/*
 * created by Veronika Volokitina
 * 21.12.2019
 */

package com.company;

public abstract class Ship{
    private String name;

    public String getName(){
        return name;
    }
    public Ship (String n){
        this.name = n;
    }

    public abstract void Distance(Wind w, SailShip.Bow b);
}