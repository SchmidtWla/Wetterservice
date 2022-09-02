package main;

import gui.MainFrame;
import wetterdaten.AktuelleWetterdaten;
import wetterdaten.Wetterdaten;
import wetterdaten.Wetterstatistik;
import wetterdaten.Wettervorhersage;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        MainFrame frame = new MainFrame();
        Wetterdaten daten = new Wetterdaten();
        AktuelleWetterdaten wetter = new AktuelleWetterdaten();
        Wetterstatistik statistik = new Wetterstatistik();
        Wettervorhersage vorhersage = new Wettervorhersage();
        daten.addObserver(wetter);
        daten.addObserver(statistik);
        daten.addObserver(vorhersage);
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Eingabe Temperatur: ");
            double temp = scan.nextDouble();
            System.out.println("Eingabe Luftfeuchtigkeit: ");
            double luftfeuchtigkeit = scan.nextDouble();
            System.out.println("Eingabe Luftdruck");
            double luftdruck = scan.nextDouble();

            daten.setTemperatur(temp);
            daten.setLuftdruck(luftdruck);
            daten.setLuftfeuchtigkeit(luftfeuchtigkeit);

            daten.notifyObservers(daten);

        }

    }

}
