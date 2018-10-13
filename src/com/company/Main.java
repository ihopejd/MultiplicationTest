package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Результат = " + multiply(7, 12));
    }

    private static int multiply(int firstNumber, int secondNumber) {

        int result = 0;
        boolean Minus = false;
        if (firstNumber < 0) {
            firstNumber = -firstNumber;
            Minus = true;
        }
        if (secondNumber == 0) {
            return result;
        }
        while (firstNumber != 0) {
            result += secondNumber;
            firstNumber--;
        }

        if (Minus) result = -result;
        return result;
    }


}