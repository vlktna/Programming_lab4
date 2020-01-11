/*
 * created by Veronika Volokitina
 * 21.12.2019
 */

package com.company;

public class Wind {
    private boolean wind;

    public Wind(boolean w) {
        wind = w;
    }

    public boolean getWind() {
        return wind;
    }

    public void NoiseWind() {
        if (this.wind) {
            System.out.println("В снастях свистел ветер.");
        } else {
            System.out.println("Ветра не было слышно.");
        }
    }

    public static class Wave{

        public void NoiseWave(Wind w) {
            if (w.wind){
                System.out.println("Волны звучно плескались в его борта.");
            }
        }
    }
}