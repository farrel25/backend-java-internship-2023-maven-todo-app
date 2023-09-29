package com.farrel.todoapp.util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static String input(String text) {
        System.out.print(text);
        return scanner.nextLine();
    }
}
