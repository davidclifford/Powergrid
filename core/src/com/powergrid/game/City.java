package com.powergrid.game;

import java.util.List;

/**
 * Created by David on 8/07/2017.
 */
public class City {
    private String name;
    private int id;
//    private List<Connection> connections;
    private Zone zone;
    private Player ten;
    private Player fifteen;
    private Player twenty;

    public static final int numCities = 42;
    public static City germany[] = new City[numCities];

    public static City flensburg = new City(0).name("Flensberg").zone(Zone.cyan);
    public static City kiel = new City(1).name("Kiel").zone(Zone.cyan);
    public static City cuxhaven= new City(2).name("Cuxhaven").zone(Zone.cyan);
    public static City hamburg = new City(3).name("Hamburg").zone(Zone.cyan);
    public static City wilhelmshaven = new City(4).name("Wilhelmshaven").zone(Zone.cyan);
    public static City bremen = new City(5).name("Bremen").zone(Zone.cyan);
    public static City hannover = new City(6).name("Hannover").zone(Zone.cyan);

    public static City lubeck = new City(7).name("Lubeck").zone(Zone.brown);
    public static City rostock = new City(8).name("Rostock").zone(Zone.brown);
    public static City schwerin = new City(9).name("Schwerin").zone(Zone.brown);
    public static City torgelow = new City(10).name("Torgelow").zone(Zone.brown);
    public static City magdeburg = new City(11).name("Magdeburg").zone(Zone.brown);
    public static City berlin = new City(12).name("Berlin").zone(Zone.brown);
    public static City frankfurto = new City(13).name("Franfurt-O").zone(Zone.brown);

//    public static City  = new City().name("").zone(Zone.red);
    public static City osnabruck = new City(14).name("Osnabruck").zone(Zone.red);
    public static City duisburg = new City(15).name("Duisburg").zone(Zone.red);
    public static City munster = new City(16).name("Munster").zone(Zone.red);
    public static City essen = new City(17).name("Essen").zone(Zone.red);
    public static City dusseldorf = new City(18).name("Dusseldorf").zone(Zone.red);
    public static City dortmund = new City(19).name("Dortmund").zone(Zone.red);
    public static City kassel = new City(20).name("Kassel").zone(Zone.red);

    public static City halle = new City(21).name("Halle").zone(Zone.yellow);
    public static City leipzig = new City(22).name("Leipzig").zone(Zone.yellow);
    public static City fulda = new City(23).name("Fulda").zone(Zone.yellow);
    public static City erfurt = new City(24).name("Erfurt").zone(Zone.yellow);
    public static City dresden = new City(25).name("Dresden").zone(Zone.yellow);
    public static City wurzburg = new City(26).name("Wurzburg").zone(Zone.yellow);
    public static City nurnberg = new City(27).name("Nurnberg").zone(Zone.yellow);

    public static City aachen = new City(28).name("Aachen").zone(Zone.blue);
    public static City koln = new City(29).name("Koln").zone(Zone.blue);
    public static City trier = new City(30).name("Trier").zone(Zone.blue);
    public static City wiesbaden = new City(31).name("Wiesbaden").zone(Zone.blue);
    public static City frankfurtm = new City(32).name("Frankfurt-M").zone(Zone.blue);
    public static City saarbrucken = new City(33).name("Saarbrucken").zone(Zone.blue);
    public static City mannheim = new City(34).name("Mannheim").zone(Zone.blue);

    public static City stuttgart = new City(35).name("Stuttgard").zone(Zone.magenta);
    public static City regensburg = new City(36).name("Regensburg").zone(Zone.magenta);
    public static City passau = new City(37).name("Passau").zone(Zone.magenta);
    public static City augsburg = new City(38).name("Augsburg").zone(Zone.magenta);
    public static City munchen = new City(39).name("Munchen").zone(Zone.magenta);
    public static City freiburg = new City(40).name("Freiburg").zone(Zone.magenta);
    public static City konstanz = new City(41).name("Konstanz").zone(Zone.magenta);

    public City(int id) {
        if (germany[id] != null) {
            System.out.println("City already registered");
            System.exit(1);
        }
        germany[id] = this;
        this.id = id;
    }

    public City zone(Zone zone) {
        this.zone = zone;
        return this;
    }

    public City name(String name) {
        this.name = name;
        return this;
    }
}
