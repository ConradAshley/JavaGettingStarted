import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Implement each of the tests below in order within the src/main/java/FizzBuzz class
 * Make a Git commit after implementing each test. Add only the minimum amount of code required
 * for each test case to make that test pass. This may include just putting in a literal value...
 * do not add any additional code.
 *
 * Hint:  If you complete implementing a test and the next test passes w/o any changes to FizzBuzz.java,
 *        you did too much and should start over from the previous test.
*/

public class WeekTwoExercisePartTwo {
    // TODO: remove @Disabled attribute, make the test run green, and then move on to the next test
    // TODO: remember to refactor after you have a green test (never refactor when you have a failing test)

    // TODO Response: Why would you never refactor if you had a failing test?
    // you don't want to commit bad code

    @Test
    public void sendingOneShouldReturnStringOne(){
        // TODO Comment: Just added an if statement, that if number == 1 return number.toString();
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        FizzBuzz fb = new FizzBuzz();
        String expected = "1";

        String actual = fb.execute(1);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingTwoShouldReturnStringTwo(){
        // TODO Comment: Added else if to say if number == 2 to return 2 to string.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "2";

        String actual = fb.execute(2);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingThreeShouldReturnStringFizz() {
        // TODO Comment: replace this comment with a brief description of why you made the change you did in FizzBuzz.java
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(3);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingAnyMultipleOfThreeShouldReturnStringFizz() {
        // TODO Comment: If statement for if number == 3 return Fizz
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(9);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingAnyMultipleOfFiveOfThreeShouldReturnStringBuzz() {
        // TODO Comment: If statement, if number modulus 5 == 0, return Buzz
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "Buzz";

        String actual = fb.execute(25);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingAnyMultipleOfThreeAndFiveOfThreeShouldReturnStringFizzBuzz() {
        // TODO Comment: If number modulus 3 == 0 and number modulus 5 == 0 return FizzBuzz
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "FizzBuzz";

        String actual = fb.execute(45);

        assertEquals(expected, actual);
    }
}
