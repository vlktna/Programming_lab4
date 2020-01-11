/*
 * created by Veronika Volokitina
 * 21.12.2019
 */

package com.company;

public class Mermaid extends Creature{

    public Mermaid (String name){
        super(name);
        System.out.println("Где-то вдалеке плавает русалка " + super.getName() + ".");
    }

    public void dance(){
        if (Math.random() >= 0.5){
            System.out.println("Русалка " + super.getName() + " подплыла к кораблю и начала танцевать вокруг его носа.");
        }
        else{
            System.out.println("Русалка " + super.getName() + " не захотела подплывать к кораблю.");
        }
    }
}