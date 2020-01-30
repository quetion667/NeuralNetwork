package com.network;
import java.util.Scanner;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        MainLogic ML = new MainLogic(sc);
        ML.initialMenu();

    }
}
