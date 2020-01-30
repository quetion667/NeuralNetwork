package com.network.models;
import java.util.*;

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
        inputSynapses = new List<Synapse>()
        {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Synapse> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Synapse synapse) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Synapse> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Synapse> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Synapse get(int index) {
                return null;
            }

            @Override
            public Synapse set(int index, Synapse element) {
                return null;
            }

            @Override
            public void add(int index, Synapse element) {

            }

            @Override
            public Synapse remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Synapse> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Synapse> listIterator(int index) {
                return null;
            }

            @Override
            public List<Synapse> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

    }
    //endregion
}
