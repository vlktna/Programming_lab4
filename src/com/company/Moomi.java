/*
 * created by Veronika Volokitina
 * 21.12.2019
 */

package com.company;

public class Moomi extends Creature{

    public Moomi (String name){
        super(name);
        System.out.println(super.getName() + " находится на корабле.");
    }

    public void Action(Weather w){
        if (w.getTemp() < 15){
            System.out.println(super.getName() + " не может уснуть из-за холода");
        }
        else{
            if(w.getCloud() & !w.getRain()){
                System.out.println(super.getName() + " дремлет, ведь очень редко случалось, чтобы вокруг нее было так спокойно.");
            }
            else if (w.getSun() & !w.getCloud() & !w.getRain()){
                System.out.println(super.getName() + " наслаждется солнечной погодой.");
            }

            else if (w.getRain()){
                System.out.println(super.getName() + " ищет зонт, чтобы не промокнуть.");
            }
            else if (!w.getSun() & !w.getCloud()){
                System.out.println(super.getName() + " дремлет, ведь очень редко случалось, чтобы вокруг нее было так спокойно.");
            }
        }
    }

    public void sail(){
        System.out.println(super.getName()+ " управляет кораблем.");
    }

    public void play(){
        System.out.print(super.getName() + " связал шнурком суденышки, ");

        if (Math.random()*100 > 50){
            System.out.println("получилась целая флотилия!");
        }
        else{
            System.out.println("но целая флотилия не получилась.");
        }
    }
}