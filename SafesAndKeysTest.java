import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafesAndKeysTest {

    @Test
    public void test1() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        int[] numbers = {2, 1, 2, 4};
        SafesAndKeys.run(4, numbers);

        String expectedOutput = "2\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void test2() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        int[] numbers = {2, 1, 9, 9, 3, 7, 8, 6, 3};
        SafesAndKeys.run(9, numbers);

        String expectedOutput = "3\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void test3() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        int[] numbers = {1, 2, 4, 4, 4};
        SafesAndKeys.run(5, numbers);

        String expectedOutput = "3\n";
        assertEquals(expectedOutput, outputStream.toString());
    }


}
