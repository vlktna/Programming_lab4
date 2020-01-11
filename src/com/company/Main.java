/*
 * created by Veronika Volokitina
 * 21.12.2019
 */

package com.company;

public class Main {
    public static void main(String[] args){

        Weather weatherNow = new Weather(-100, false, false, false); //Temperature, sun, cloud, rain
        Wind windNow = new Wind(true);

        try{
            weatherNow.BelowZero();
        }
        catch(TempException ex){
            System.out.println(ex.getMessage());
            System.out.println("Установлены значения по умолчанию."+ '\n');
            weatherNow.temp = 20;
        }

        try{
            weatherNow.StrangeWeather();
        }
        catch(WeatherException ex){
            System.out.println(ex.getMessage());
            System.out.println("Установлены значения по умолчанию."+ '\n');
            weatherNow.sun = true;
            weatherNow.clouds = true;
            weatherNow.rain = false;
        }

        SailShip adventure = new SailShip("'Приключение'");
        SailShip.Bow adventureBow = adventure.new Bow("нос корабля");

        adventure.Sail(windNow);
        adventureBow.Luck();
        adventure.Sail(windNow);

        windNow.NoiseWind();
        Wind.Wave NiceWave = new Wind.Wave();
        NiceWave.NoiseWave(windNow);

        weatherNow.ShowWeather();

        Mermaid alice = new Mermaid("Алиса");
        alice.dance();

        Moomi moomiDad = new Moomi("Муми-папа");
        Moomi moomiMom = new Moomi("Муми-мама");
        Moomi sniff = new Moomi("Снифф");
        Moomi mumitroll = new Moomi("Мумми-тролль");

        moomiDad.sail();
        moomiMom.Action(weatherNow);
        sniff.play();

        Animal  whiteBird = new Animal("Белые птицы", AnimalType.Bird);
        whiteBird.Fly(weatherNow);

        adventure.Distance(windNow, adventureBow);
    }
}
