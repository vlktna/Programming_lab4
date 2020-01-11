/*
 * created by Veronika Volokitina
 * 21.12.2019
 */

package com.company;

public class SailShip extends Ship{

    public SailShip(String n){
        super(n);
    }



    public void Sail(Wind w){
        if (w.getWind()){
            System.out.println("С туго натянутым парусом " + super.getName() + " стрелой неслось к горизонту");
        }
        else{
            System.out.println(super.getName() + " очень медленно двигалось вниз по течению реки.");
        }
    }

    @Override
    public void Distance(Wind w, SailShip.Bow b){
        if (w.getWind()){
            System.out.println("За этот день они проплыли целых " + Math.round((Math.random())*100 + b.getLucky()*10) + " км.");
        }
        else{
            System.out.println("За этот день они проплыли всего лишь " + Math.round((Math.random())*10 + b.getLucky()*10) + " км.");
        }
    }

    public class Bow {
        private String name;
        private byte getlucky;


        public Bow(String n) {
            this.name = n;
        }

        public void Surf() {
            System.out.println(name + " рассекал зеленоватую толщу воды, распуская в стороны белые усы пены.");
        }

        public void Luck() {
            if (Math.random() - 0.5 > 0) {
                System.out.println("Банка с волшебной водой разбилась об " + name + ", значит поездка будет удачной!");
                getlucky = 1;
            }
            else {
                System.out.println("Банка с волшебной водой не разбилась об " + name + ", значит поездка будет неудачной.");
                getlucky = 0;
            }
        }
        public byte getLucky(){
            return getlucky;
        }
    }
}
