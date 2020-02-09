package com.network;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        MainLogic ML = new MainLogic(sc);
        ML.initialMenu();
/*
        List <String> inters = new ArrayList<>();
        inters.add("first");
        inters.add("second");
        for (int i=0; i < inters.size(); i++)
        {
            var uz = "0";
            System.out.println(inters.get(i));
        }

 */
    }
}
