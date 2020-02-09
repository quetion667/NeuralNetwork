package com.network.models;
import java.util.*;
import java.lang.Math;
import java.io.Serializable;

public class Network {
    //region --Properties--
    public double learnRate;
    public double momentum;
    public ArrayList <Neuron> inputLayer;
    public ArrayList <ArrayList <Neuron>> hiddenLayers;
    public ArrayList <Neuron> outputLayers;

    //endregion
    //region --Globals--
    private final static Random rnd = new Random();

    //endregion
    //region --Constructor
    public Network()
    {
    learnRate = 0;
    momentum = 0;
    inputLayer = new ArrayList<Neuron>();
    hiddenLayers = new ArrayList<ArrayList<Neuron>>();
    //hiddenLayers.add(new ArrayList<Neuron>());
    outputLayers = new ArrayList<Neuron>();
    }
    // опять проверка на null
    public Network (int inputSize, int [] hiddenSizes, int outputSize, double LearnRate, double Momentum )
    {
        try{
            learnRate = LearnRate;
        }
        catch (NullPointerException e)
        {
            learnRate =0.4;
            System.out.println("сключение на LearnRate in Network");
        }

        try {
            momentum = Momentum;
        }
        catch (NullPointerException e)
        {
            momentum = 0.9;
            System.out.println("сключение на Momentum in Network");
        }
        inputLayer = new ArrayList<Neuron>();
        hiddenLayers = new ArrayList<ArrayList<Neuron>>();
        //hiddenLayers.add(new ArrayList<Neuron>());
        outputLayers = new ArrayList<Neuron>();

        for (var i =0 ; i <inputSize; i++)
        {
            inputLayer.add(new Neuron());
        }

        var firstHiddenLayer = new ArrayList<Neuron>();
        for (var i= 0; i < hiddenSizes[0]; i++)
            firstHiddenLayer.add(new Neuron(inputLayer));

        hiddenLayers.add(firstHiddenLayer);

        for (var i =1; i < hiddenSizes.length; i ++)
        {
            var hiddenLayer = new ArrayList<Neuron>();
            for (var j = 0; j < hiddenSizes[i]; j++)
            {
                hiddenLayer.add(new Neuron(hiddenLayers.get(i-1)));
            }
            hiddenLayers.add(hiddenLayer);
        }

        for (var i = 0; i <outputSize; i++) {
            // Проверить на исключение

            outputLayers.add(new Neuron(hiddenLayers.get(hiddenLayers.size()-1)));
        }
    }
    //endregion
    //region --Training
    public void train(ArrayList<DataSet> dataSets, int numEpochs)
    {
        for(var i = 0; i <numEpochs; i++)
        {
            for(var dataSet : dataSets)
            {

            }
        }
    }
    private void forwardPropagate(double ... inputs)
    {
        for (var i = 0; i < inputs.length; i++)
        {
            inputLayer.get(i).value = inputs [i];
        }
        hiddenLayers.forEach(a -> a.forEach( b -> b.calculateValue()));
        outputLayers.forEach(a -> a.calculateValue());
    }
    //endregion
    //region --Helpers--
    public static double getRandom()
    {
        return 2 * rnd.nextDouble() -1;
    }

    //endregion


}
