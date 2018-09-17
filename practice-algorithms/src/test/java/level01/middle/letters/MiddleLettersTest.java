package level01.middle.letters;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleLettersTest {
    MiddleLetters middleLetters = new MiddleLetters();

    @Test
    public void solution() {
        assertEquals( middleLetters.solution("abcde"), "c");
        assertEquals( middleLetters.solution("qwer"), "we");
    }
}