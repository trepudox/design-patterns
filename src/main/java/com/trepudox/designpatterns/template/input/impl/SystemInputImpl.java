package com.trepudox.designpatterns.template.input.impl;

import com.trepudox.designpatterns.template.input.SystemInput;

import java.util.Scanner;

public class SystemInputImpl implements SystemInput {

    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public String getStringInput() {
        return SCANNER.next();
    }

    @Override
    public Double getDoubleInput() {
        return SCANNER.nextDouble();
    }
}
