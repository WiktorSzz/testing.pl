package pl.kurs.examples;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Tworzenie tablic:
        int[] ints = new int[5]; //javowy sposób
        int ints2[] = new int[5]; //C-styowy sposób
        char[] chars = new char[7];
        boolean[] booleans = new boolean[12];
        String[] strings = new String[20];

        System.out.println(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println(booleans);
        System.out.println(Arrays.toString(booleans));

        int[] ints3 = new int[]{3, 2, 334, 232};
        System.out.println(Arrays.toString(ints3));
        int[] ints4 = {3, 2, 334, 232}; //takiego zapisu nie można rodzielić na dwie instrukchje deklaracji oraz inicjacji
        System.out.println(Arrays.toString(ints4));


        String[] carsBrands = new String[4];
        carsBrands[0] = "Audi";
        carsBrands[1] = "Skoda";
        carsBrands[2] = "Mercedes";
        carsBrands[3] = "Bmw";
        System.out.println(Arrays.toString(carsBrands));


        Employee employee1 = new Employee("Wiktor", "Witkiewicz");
        Employee employee2 = new Employee("Antek", "Michalewicz");
        Employee employee3 = new Employee("Marek", "Michalewicz");

        Employee[] januszex = new Employee[5];
        januszex[0] = employee1;
        januszex[1] = employee2;
        januszex[3] = employee3;

        //System.out.println(januszex[5]); błą przekroczenia indexu tablicy

        System.out.println(Arrays.toString(januszex));


        //Tablice wielowymiarowe
        int[][] tab = new int[3][3];
        int[][][][] tab2 = new int[2][2][4][2];

        ////tab[0][0]     tab[0][1]      tab[0][2]
        ////
        ////tab[1][0]     tab[1][1]      tab[1][2]
        ////
        ////tab[2][0]     tab[2][1]      tab[2][2]

        System.out.println(Arrays.deepToString(tab));
        System.out.println(Arrays.deepToString(tab2));


        String[] heroes = {"Batman", "Spiderman", "Robocop"};
        String[] cities = {"New York", "Gotham", "Detroit"};

        String[][] heroesAndCities = {heroes, cities};

        System.out.println(Arrays.deepToString(heroesAndCities));


        System.out.println("heros = " + heroesAndCities[0][0]);
        System.out.println("city = " + heroesAndCities[1][1]);


        System.out.println("heros = " + heroesAndCities[0][1]);
        System.out.println("city = " + heroesAndCities[1][0]);


       System.out.println("heros = " + heroesAndCities[0][2]);
       System.out.println("city = " + heroesAndCities[1][2]);


    }
}