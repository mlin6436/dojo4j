package com.mlin6436.wp;

public class NumberToWordConverterImpl implements NumberToWordConverter {
    public static final String[] ZERO_TO_NINETEEN = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    public static final String[] TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static final String HUNDRED = "hundred";
    public static final String THOUSAND = "thousand";
    public static final String MILLION = "million";

    public String convert(int in) throws InvalidIntegerException {
        if (in < 0 || in > 999999999) {
            throw new InvalidIntegerException("Input should be between (including) 0 and 999999999");
        }

        return mapper(in);
    }

    private String mapper(int in) {
        StringBuilder result = new StringBuilder();

        if (in < 20) {
            result.append(upTo20Mapper(in));
        } else if (in >= 20 && in < 100) {
            result.append(upTo100Mapper(in));
        } else if (in >= 100 && in < 1000) {
            result.append(upToOneThousandMapper(in, 100, HUNDRED));
        } else if (in >= 1000 && in < 1000000) {
            result.append(bigNumberMapper(in, 1000, THOUSAND));
        } else if (in >= 1000000 && in < 1000000000) {
            result.append(bigNumberMapper(in, 1000000, MILLION));
        }

        return result.toString();
    }

    private String upTo20Mapper(int in) {
        StringBuilder result = new StringBuilder();

        result.append(ZERO_TO_NINETEEN[in]);

        return result.toString();
    }

    private String upTo100Mapper(int in) {
        StringBuilder result = new StringBuilder();

        result.append(TENS[(in / 10) - 2]);
        if (in % 10 != 0) {
            result.append(" ");
            result.append(ZERO_TO_NINETEEN[(in % 10)]);
        }

        return result.toString();
    }

    private String upToOneThousandMapper(int in, int unit, String unitWord) {
        StringBuilder result = new StringBuilder();

        int hundreds = in / unit;
        int rest = in % unit;
        result.append(ZERO_TO_NINETEEN[hundreds]);
        result.append(" ");
        result.append(unitWord);

        if (rest != 0) {
            result.append(" and ");
            result.append(mapper(rest));
        }

        return result.toString();
    }

    private String bigNumberMapper(int in, int unit, String unitWord) {
        StringBuilder result = new StringBuilder();

        int n = in / unit;
        int rest = in % unit;
        result.append(mapper(n));
        result.append(" ");
        result.append(unitWord);

        if (rest != 0) {
            if (rest / (unit / 10) != 0) {
                result.append(" ");
            } else {
                result.append(" and ");
            }
            result.append(mapper(rest));
        }

        return result.toString();
    }
}
