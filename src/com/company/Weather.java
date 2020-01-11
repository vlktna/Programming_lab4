/*
 * created by Veronika Volokitina
 * 21.12.2019
 */

package com.company;

public class Weather implements IRainyWeather, ISunnyWeather {

    public int temp;
    public boolean sun;
    public boolean clouds;
    public boolean rain;

    @Override
    public int getTemp() {
        return temp;
    }
    @Override
    public boolean getSun() {
        return sun;
    }
    @Override
    public boolean getCloud() {
        return clouds;
    }
    @Override
    public boolean getRain() {
        return rain;
    }

    public Weather(int t, boolean s){
        temp = t;
        sun = s;
        clouds = false;
        rain = false;
    }
    public Weather(int t, boolean s, boolean c){
        temp = t;
        sun = s;
        clouds = c;
        rain = false;
    }
    public Weather(int t, boolean s, boolean c, boolean r){
        temp = t;
        sun = s;
        clouds = c;
        rain = r;
    }

    public void ShowWeather(){
        if (temp > 15){
            if (clouds & rain){
                System.out.println("Погода стояла чудесная, хотя и не совсем ясная, потому что солнце было затянуто легкой золотистой дымкой.");
            }
            else if (sun & !clouds & !rain){
                System.out.println("Светит яркое солнце.");
            }

            else if (rain){
                System.out.println("Ой, кажется, дождь начинается!");
            }
        }
        else{
            System.out.println("Кажется, на улице похоладало.");
        }
    }
    public void StrangeWeather() throws WeatherException{
        if (!sun & !clouds & !rain){
            throw new WeatherException("ОШИБКА: В волшебном мире не может не быть солнца, облаков и дождя одновременно.");
        }
    }
    public void BelowZero() throws TempException{
        if (temp < 0){
            throw new TempException("ОШИБКА: В волшебном мире не может быть отрицательной температуры.");
        }
    }
}


