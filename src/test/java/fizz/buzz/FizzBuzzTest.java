package fizz.buzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    public void fizzBuzz(int value) {
        for (int i = 1; i <= value; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 2 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    @Test
    public void main() {
        this.fizzBuzz(50);
    }

}
