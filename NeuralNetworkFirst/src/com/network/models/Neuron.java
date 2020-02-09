package com.network.models;
import java.util.*;
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;

public class Neuron {
    //region Properties
    public UUID id;
    public List <Synapse> inputSynapses;
    public List <Synapse> outputSynapses;
    public double bias;
    public double biasDelta;
    public double gradient;
    public double value;
    //endregion
    //region Constructor
    public Neuron ()
    {
        id = UUID.randomUUID();
        inputSynapses = new ArrayList<>();//Почему Лист в эррэйЛист
        outputSynapses = new ArrayList<>();//Почему Лист в эррэйЛист
        bias = Network.getRandom();
    }
    public Neuron (Iterable <Neuron> InputNeurons)
    {
        this();
        for (var inputNeuron : InputNeurons)
        {
            // разобраться
            var synapse = new Synapse(inputNeuron, this);
            inputNeuron.outputSynapses.add(synapse);
        }
    }
    //endregion
    //region Values and Weights
    public double calculateValue()
    {
        double sumList=0.0;
        Iterator <Synapse> itInput = inputSynapses.iterator();
        int i =0;
        while(itInput.hasNext())
        {
            sumList += inputSynapses.get(i).weight * inputSynapses.get(i).inputNeuron.value;
            i++;
            itInput.next();
        }
        return value = sumList;
    }
    public double calculateError(double target)
    {
        return target - value;
    }
    // Проверка аргумента на нуль??
    public double calculateGradient(double target)
    {
        // че тут за хрень?
        return  gradient = calculateError(target)*Sigmoid.derivative(value);
    }
    public void updateWeights( double learnRate, double momentum)
    {
        var prevDelta = biasDelta;
        biasDelta = learnRate * gradient;
        bias += biasDelta + momentum * prevDelta;

        for (var synapse : inputSynapses ) {
            prevDelta = synapse.weightDelta;
            synapse.weightDelta = learnRate * gradient * synapse.inputNeuron.value;
            synapse.weight += synapse.weightDelta + momentum * prevDelta;
        }
    }
    //endregion

}
