package agh.ics.oop;

import java.util.ArrayList;

public class Genotype {
    private ArrayList<Integer> gens = new ArrayList<>();

    public Genotype(int[] gens){
        for(int a : gens)this.gens.add(a);
    }

    public boolean equals(Genotype gen) {return this.gens.equals(gen); }

    public String toString(){
        return gens.toString();
    }

}
