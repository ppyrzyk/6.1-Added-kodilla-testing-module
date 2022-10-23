package com.kodilla.stream;

import com.kodilla.lambda.ExpressionExecutor;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

//        Beautifying the text

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("TEST1 TEST2 ",text -> "test3 "  + text + "test4");
        poemBeautifier.beautify("TEST1 TEST2 ",text -> "ABC" + " " + text + "ABC");
        poemBeautifier.beautify("Text in upper case",text -> text.toUpperCase());
        poemBeautifier.beautify("DOES TEXT IN LOWER CASE LOOK BETTER?",text -> text.toLowerCase());
        poemBeautifier.beautify("Indenting the text by 8 spaces",text -> text.indent(8)); // next line after indenting is blank
        poemBeautifier.beautify("Concatenating text: 1st part with ",text -> text.concat(" the 2nd part"));



    }

}