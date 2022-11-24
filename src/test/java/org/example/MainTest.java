package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @ValueSource(strings = {"a", "aa", "maDam", "Hannah", "Race Car", "\"race %&,.* %c  ar! !\""})
    @DisplayName("given a time between 5 and 12, greeting returns good morning")
    public void givenAStringReturnTrue(String word) {
        boolean expected = true;
        boolean result = Main.palindromeChecker(word);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "aa", "maDam", "Hannah", "Race Car", "\"race %&,.* %c  ar! !\""})
    @DisplayName("given a time between 5 and 12, greeting returns good morning")
    public void givenAStringReturnTrueRecursion(String word) {
        boolean expected = true;
        boolean result = Main.palindromeCheckRecursion(word);
        assertEquals(expected, result);
    }
}