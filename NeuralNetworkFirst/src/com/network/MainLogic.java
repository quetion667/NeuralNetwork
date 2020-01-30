package com.network;
import com.network.models.Network;

import javax.print.attribute.standard.PrinterName;
import java.io.IOException;
import java.util.Scanner;

public class MainLogic {
    private static int numInputParameters;
    private static int numHiddenLayers;
    private static int [] hiddenNeurons;
    private static int numOutputParameters;
    private Scanner scSuper;

    MainLogic(Scanner sc)
    {
        scSuper = sc;
    }
    public void initialMenu() throws IOException
    {
        System.out.println("Welcome to the program!");
        System.out.println("Main Menu:");
        System.out.println("_________________________________");
        System.out.println("1.\t New Network");
        System.out.println("2.\t Import Network");
        System.out.println("3.\t Exit");

        switch(scSuper.nextInt())
        {
            case 1:
                System.out.println("\t Your choice:");
                System.out.println("\t Create new network.");
                setupNetwork();
                break;
            case 2:
                // TODO
                break;
            case 3:
                System.out.println("\t Your choice:");
                System.out.println("\t Exit");
                break;
            default:
                System.out.println("\t Something wrong");
                // TODO исключение для Ридлайна
                System.in.read();
                break;
        }
    }

    public static boolean setupNetwork()
    {
        setNumInputParameters();
        if (numInputParameters ==0) return false;
        setNumNeuronsInHiddenLayers();
        if (numHiddenLayers ==0) return false;
        SetNumOutputParameters();
        if (numOutputParameters == 0) return false;

        System.out.println("\tCreating Network...");
        Network network = new Network();

        return true;
    }

    public static void setNumInputParameters() {
        System.out.println("_________________________________");
        System.out.println("\t How many input parameters will there be? (2 or more)?");
        Scanner in = new Scanner(System.in);
        // TODO обработать исключение
        numInputParameters = in.nextInt();
        //in.close();
    }

    public static  void SetNumOutputParameters()
    {
        System.out.println("\tHow many output parameters will there be? (1 or more)");
        Scanner in = new Scanner(System.in);
        numOutputParameters = in.nextInt();
        printNewLine(2);
    }

    public  static void  setNumNeuronsInHiddenLayers()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\t How many  hidden layers? (1 or more)");
        numHiddenLayers = in.nextInt();
        // TODO обработать исключение
        System.out.println("\t How many neurons in the hidden layers? (2 or more)");
        hiddenNeurons = getArrayInput("\tNeurons in layer ", 2, numHiddenLayers );
        // TODO обработать исключение
        printNewLine(2);
    }

    public static int [] getArrayInput(String message, int min, int numToGet)
    {
        int[] nums = new int[numToGet];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i< numToGet; i++)
        {
            System.out.print("\t Neurons in layer "+ (i+1) +" - ");
            nums[i] = in.nextInt();
        }
        return nums;
    }

    public static void printNewLine(int numsOfLines)
    {
        for (int i = 0; i < numsOfLines ; i++)
        {
            System.out.println();
        }
    }

}
