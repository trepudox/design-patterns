package com.trepudox.designpatterns.template;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double number1 = scanner.nextDouble();

        System.out.print("Digite a operação desejada: ");
        String operation = scanner.next();

        System.out.print("Digite o segundo número: ");
        double number2 = scanner.nextDouble();

        calculate(number1, number2, operation);

        scanner.close();
    }

    private static void calculate(double number1, double number2, String operation) {
        Double result = null;
        switch(operation) {
            case "+":
                result = sum(number1, number2);
                break;
            case "-":
                result = subtraction(number1, number2);
                break;
            case "*":
                result = multiplication(number1, number2);
                break;
            case "/":
                result = division(number1, number2);
                break;
            default:
                System.out.println("Operação inexistente");
        }

        System.out.println(result);
    }

    private static double sum(double number1, double number2) {
        return number1 + number2;
    }

    private static double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    private static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    private static double division(double number1, double number2) {
        return number1 / number2;
    }

}
