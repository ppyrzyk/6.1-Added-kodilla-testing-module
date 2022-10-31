package com.kodilla.exception.test;

public class FirstChallenge {

        public double divide(double a, double b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        }

        /**
         * This main can throw an ArithmeticException!!!
         * @param args
         */
        public static void main(String[] args) {
            FirstChallenge firstChallenge = new FirstChallenge();
            try {
                double result = firstChallenge.divide(34, 0);
                System.out.println(result);
            } catch(ArithmeticException a){
                System.out.println("never divide by zero " + a);
            } finally {
                System.out.println("To divide choose two numbers that are not equal to a '0'");
            }
        }
    }

