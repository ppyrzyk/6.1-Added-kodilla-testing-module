package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result1 = simpleUser.getUsername();

            if (result1.equals("theForumUser")) {
            System.out.println("test OK");
            } else {
            System.out.println("Error!");
            }
            System.out.println("Test - mój pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(2,4);

            int result2 = calculator.getMultiplyResult();
            if(result2 == 8) {
                System.out.println("Multiplication has been completed successfully");
            }else{
                System.out.println("Error");
            }
            int result3 = calculator.getAddingResult();
            if(result3 == 6 ){
                System.out.println("Addition has been completed successfully");
            }else{
                System.out.println("Error");
            }


    }

}
