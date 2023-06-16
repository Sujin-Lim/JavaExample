package extra;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzProcessorTest {
    @Test
    public void FizzBuzzNormalNumber() {
        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assertions.assertEquals("1",fb.convert(1));
        Assertions.assertEquals("2",fb.convert(2));
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }
}