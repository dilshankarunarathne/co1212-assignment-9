package me.karunarathne.ExpressionBalancing;

import java.util.Arrays;

public class Main {
    private static String [] expressions = {
            "x{R-(5/2)}",
            "[p+1-(3xr+5)]",
            "{2t(5r{m-1)",
            "[{3x-4(2r-1)+8}+97]",

    };

    public static void main(String[] args) {
        Arrays.stream(expressions).forEach(
                expression -> checkExp(expression)
        );
    }

    private static void checkExp(String expression) {
        System.out.println(
                (ExpChecker.checkBalance(expression)) ? ("") : ("")
        );
    }
}
