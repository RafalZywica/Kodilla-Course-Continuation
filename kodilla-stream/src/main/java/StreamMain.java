package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //System.out.println("Calculating expressions with lambdas");
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        //System.out.println("Calculating expressions with method references");
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Beautifying poems with lambdas");
        poemBeautifier.beautify("Gdzie kucharek sześć tam nie ma co jeść", (a) -> "ABC " + a + " ABC");
        poemBeautifier.beautify("Chłopaki nie płaczą", (a) -> a.toUpperCase());
        poemBeautifier.beautify("Z deszczu pod rynnę", (a) -> a.toLowerCase());
        poemBeautifier.beautify("I cóż, że ze Szwecji", (a) -> a.length() + " " + a + " " + a.length());

    }
}