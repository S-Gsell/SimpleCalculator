// SimpleCalculatorApplication.java
// D. Singletary
// 1/9/2024
// Template for calculator application

//L. Nguyen
//1/22/2024
//Creating methods for each operation
//Submitting for another pull request for Steven to approve.

package edu.fscj.cen3024c.simplecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Added import statement to run SimpleCalculator.java
import static edu.fscj.cen3024c.simplecalculator.SimpleCalculator.*;

@SpringBootApplication
public class SimpleCalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculatorApplication.class, args);

        // Test the multiply function
        int number1 = 10; // This can be input from the user or arguments
        int number2 = 5; // This can be input from the user or arguments
        int result = multiply(number1, number2);
        System.out.println("Multiply result is: " + result);

        // Test the divide function
        result = divide(number1, number2);
        System.out.println("Divide result is: " + result);

        // Test the add function
        result = add(number1, number2);
        System.out.println("Add result is: " + result);

        // Test the subtract function
        result = subtract(number1, number2);
        //This print said add, edited to say subtract
        System.out.println("Subtract result is: " + result);
    }
}