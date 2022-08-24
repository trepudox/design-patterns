package com.trepudox.designpatterns.template.operation;

public abstract class Operation {

    public final double calculate(double number1, double number2) {
        return doCalculate();
    }

    protected abstract double doCalculate();

}
