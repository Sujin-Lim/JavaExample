package extra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SujinTest {


    @Test
    void fizzbuzz() {
        assertEquals("fizzbuzz",FizzBuzzRe.fizzbuzz(15, ""));
    }
    @Test
    void fizz() {
        assertEquals("fizz",FizzBuzzRe.fizzbuzz(3, ""));
    }
    @Test
    void buzz() {
        assertEquals("buzz",FizzBuzzRe.fizzbuzz(5, ""));
    }
    @Test
    void extra() {
        assertEquals("11",FizzBuzzRe.fizzbuzz(11, ""));
    }
}