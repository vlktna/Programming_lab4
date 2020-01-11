/*
 * created by Veronika Volokitina
 * 21.12.2019
 */

package com.company;

public class Animal extends Creature{

    private AnimalType type;

    public AnimalType getType(){
        return type;
    }
    public Animal(){
    }

    public Animal(String n){
        super(n);
    }

    public Animal(String n, AnimalType t){
        super(n);
        type = t;
    }

    public void Fly(Weather w){
        if (w.getRain()){
            System.out.println(super.getName() + " улетели из-за дождя.");
        }
        else{
            System.out.println(super.getName() + " кружат в вышине.");
        }
    }

    @Override
    public String toString() {
        return super.getName() + " ("+type+") - ";
    }

    @Override
    public boolean equals(Object obj) {
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
        return  super.getName().hashCode() + type.hashCode();
    }
}
