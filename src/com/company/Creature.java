/*
 * created by Veronika Volokitina
 * 21.12.2019
 */

package com.company;

public abstract class Creature{
    private String name;

    public Creature(){
    }

    public Creature (String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}
