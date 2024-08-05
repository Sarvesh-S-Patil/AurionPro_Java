package com.apro.test.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 30;

        // Equal to operator (==)
        boolean sameNumbers = number1 == number2;
        System.out.println("Are the numbers equal? " + sameNumbers);

        // Not equal to operator (!=)
        boolean differentNumbers = number1 != number2;
        System.out.println("Are the numbers different? " + differentNumbers);

        // Greater than operator (>)
        boolean greater = number1 > number2;
        System.out.println("Is number1 greater than number2? " + greater);

        // Less than operator (<)
        boolean lesser = number1 < number2;
        System.out.println("Is number1 lesser than number2? " + lesser);
    }
}

