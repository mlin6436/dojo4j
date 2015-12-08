package com.mlin6436.wp.tests;

import com.mlin6436.wp.InvalidIntegerException;
import com.mlin6436.wp.NumberToWordConverter;
import com.mlin6436.wp.NumberToWordConverterImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NumberToWordConverterTests {

    NumberToWordConverter converter = new NumberToWordConverterImpl();

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldThrowInvalidIntegerExceptionGivenAnIntegerIsLessThanZero() throws InvalidIntegerException {
        exception.expect(InvalidIntegerException.class);
        exception.expectMessage("Input should be between (including) 0 and 999999999");
        converter.convert(-1);
    }

    @Test
    public void shouldThrowInvalidIntegerExceptionGivenAnIntegerIsGreaterThan999999999() throws InvalidIntegerException {
        exception.expect(InvalidIntegerException.class);
        exception.expectMessage("Input should be between (including) 0 and 999999999");
        converter.convert(1000000000);
    }

    @Test
    public void shouldReturnZero() throws InvalidIntegerException {
        String expected = "zero";
        String result = converter.convert(0);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnOne() throws InvalidIntegerException {
        String expected = "one";
        String result = converter.convert(1);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTwo() throws InvalidIntegerException {
        String expected = "two";
        String result = converter.convert(2);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnFour() throws InvalidIntegerException {
        String expected = "four";
        String result = converter.convert(4);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnFive() throws InvalidIntegerException {
        String expected = "five";
        String result = converter.convert(5);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnSix() throws InvalidIntegerException {
        String expected = "six";
        String result = converter.convert(6);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnSeven() throws InvalidIntegerException {
        String expected = "seven";
        String result = converter.convert(7);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnEight() throws InvalidIntegerException {
        String expected = "eight";
        String result = converter.convert(8);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnNine() throws InvalidIntegerException {
        String expected = "nine";
        String result = converter.convert(9);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTen() throws InvalidIntegerException {
        String expected = "ten";
        String result = converter.convert(10);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnEleven() throws InvalidIntegerException {
        String expected = "eleven";
        String result = converter.convert(11);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTwelve() throws InvalidIntegerException {
        String expected = "twelve";
        String result = converter.convert(12);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnThirteen() throws InvalidIntegerException {
        String expected = "thirteen";
        String result = converter.convert(13);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnFourteen() throws InvalidIntegerException {
        String expected = "fourteen";
        String result = converter.convert(14);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnFifteen() throws InvalidIntegerException {
        String expected = "fifteen";
        String result = converter.convert(15);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnSixteen() throws InvalidIntegerException {
        String expected = "sixteen";
        String result = converter.convert(16);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnSeventeen() throws InvalidIntegerException {
        String expected = "seventeen";
        String result = converter.convert(17);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnEighteen() throws InvalidIntegerException {
        String expected = "eighteen";
        String result = converter.convert(18);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnNineteen() throws InvalidIntegerException {
        String expected = "nineteen";
        String result = converter.convert(19);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTwenty() throws InvalidIntegerException {
        String expected = "twenty";
        String result = converter.convert(20);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTwentyOne() throws InvalidIntegerException {
        String expected = "twenty one";
        String result = converter.convert(21);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTwentyFive() throws InvalidIntegerException {
        String expected = "twenty five";
        String result = converter.convert(25);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnThirty() throws InvalidIntegerException {
        String expected = "thirty";
        String result = converter.convert(30);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnForty() throws InvalidIntegerException {
        String expected = "forty";
        String result = converter.convert(40);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnFifty() throws InvalidIntegerException {
        String expected = "fifty";
        String result = converter.convert(50);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnSixty() throws InvalidIntegerException {
        String expected = "sixty";
        String result = converter.convert(60);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnSeventy() throws InvalidIntegerException {
        String expected = "seventy";
        String result = converter.convert(70);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnEighty() throws InvalidIntegerException {
        String expected = "eighty";
        String result = converter.convert(80);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnNinety() throws InvalidIntegerException {
        String expected = "ninety";
        String result = converter.convert(90);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnOneHundred() throws InvalidIntegerException {
        String expected = "one hundred";
        String result = converter.convert(100);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTwoHundred() throws InvalidIntegerException {
        String expected = "two hundred";
        String result = converter.convert(200);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnOneHundredAndFive() throws InvalidIntegerException {
        String expected = "one hundred and five";
        String result = converter.convert(105);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnOneHundredAndTwentyThree() throws InvalidIntegerException {
        String expected = "one hundred and twenty three";
        String result = converter.convert(123);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnOneThousand() throws InvalidIntegerException {
        String expected = "one thousand";
        String result = converter.convert(1000);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTwoThousand() throws InvalidIntegerException {
        String expected = "two thousand";
        String result = converter.convert(2000);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnOneThousandAndFive() throws InvalidIntegerException {
        String expected = "one thousand and five";
        String result = converter.convert(1005);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnOneThousandAndFortyTwo() throws InvalidIntegerException {
        String expected = "one thousand and forty two";
        String result = converter.convert(1042);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnOneThousandOneHundredAndFive() throws InvalidIntegerException {
        String expected = "one thousand one hundred and five";
        String result = converter.convert(1105);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTwentyFiveThousandTwoHundredAndFiftyOne() throws InvalidIntegerException {
        String expected = "twenty five thousand two hundred and fifty one";
        String result = converter.convert(25251);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnSixHundredAndTwentyFiveThousandTwoHundredAndFiftyOne() throws InvalidIntegerException {
        String expected = "six hundred and twenty five thousand two hundred and fifty one";
        String result = converter.convert(625251);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnOneMillion() throws InvalidIntegerException {
        String expected = "one million";
        String result = converter.convert(1000000);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnTwoMillion() throws InvalidIntegerException {
        String expected = "two million";
        String result = converter.convert(2000000);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnFiftySixMillionNineHundredAndFortyFiveThousandSevenHundredAndEightyOne() throws InvalidIntegerException {
        String expected = "fifty six million nine hundred and forty five thousand seven hundred and eighty one";
        String result = converter.convert(56945781);
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnNineHundredAndNinetyNineMillionNineHundredAndNinetyNineThousandNineHundredAndNinetyNine() throws InvalidIntegerException {
        String expected = "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine";
        String result = converter.convert(999999999);
        assertThat(result, is(expected));
    }
}
