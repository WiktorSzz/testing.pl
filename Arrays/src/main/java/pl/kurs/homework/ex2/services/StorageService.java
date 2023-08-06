package pl.kurs.homework.ex2.services;

import pl.kurs.homework.ex1.models.Student;
import pl.kurs.homework.ex2.app.StorageServiceRunner;
import pl.kurs.homework.ex2.models.Car;

public class StorageService {
    private Car carMagazine[];
    private int howManyCars;

    public StorageService(int capacity) {
        this.carMagazine = new Car[capacity];
    }

//    public void addCar(Car car) {
//        if (car == null)
//            System.out.println("Nie podano samochodu do dodania!");
//        else if (howManyCars == carMagazine.length)
//            System.out.println("Magazyn jest pełny.");
//        else if (carMagazine.length > howManyCars) {
//            if (car.getProductionYear() < 2010)
//                System.out.println("Samochód jest za stary, przyjmujemy samochody powyżej 2010 roku.");
//            else if (car.getColor().contains("White"))
//                System.out.println("Nie przyjmujemy białych samochodów do magazynu.");
//                if (car.getProductionYear()<2010){
//                    System.out.println("Samochód jest za stary, przyjmujemy samochody powyżej 2010 roku.");
//                }
//            else if (car.gethP() < 300)
//                System.out.println("Samochód ma za mało mocy, przyjmujemy samochody powyżej 300hP.");
//            else {
//                carMagazine[howManyCars++] = car;
//                System.out.println("Samochód został pomyślnie dodany do magazynu " + car);
//            }
//
//        }
//    }

    public void addCar(Car car) {
        if (car == null) System.out.println("Nie podano samochodu do dodania!");
        else if (howManyCars == carMagazine.length) System.out.println("Magazyn jest pełny.");
        else if (carMagazine.length > howManyCars) {
            if (car.getProductionYear() < 2010 && car.getColor().contains("White") && car.gethP() < 300)
                System.out.println("Samochód jest za stary, ma za mało mocy i ma zły kolor, przyjmujemy tylko samochody powyżej 2010 roku, z mocą powyżej 300hP i innego koloru niż biały.");
            else if (car.getProductionYear() < 2010 && car.getColor().contains("White"))
                System.out.println("Samochód jest za stary i ma zły kolor, przyjmujemy tylko samochody powyżej 2010 roku i innego koloru niż biały.");
            else if (car.getProductionYear() < 2010 && car.gethP() < 300)
                System.out.println("Samochód jest za stary i ma za mało mocy, przyjmujemy tylko samochody powyżej 2010 roku i powyżej 300hP");
            else if (car.gethP() < 300 && car.getColor().contains("White"))
                System.out.println("Samochód ma za mało mocy i ma zły kolor, przyjmujemy tylko samochody powyżej 300hP i innego koloru niż biały.");
            else if (car.getColor().contains("White"))
                System.out.println("Nie przyjmujemy białych samochodów do magazynu.");
            else if (car.getProductionYear() < 2010)
                System.out.println("Samochód jest za stary, przyjmujemy samochody powyżej 2010 roku.");
            else if (car.gethP() < 300)
                System.out.println("Samochód ma za mało mocy, przyjmujemy samochody powyżej 300hP.");
            else {
                carMagazine[howManyCars++] = car;
                System.out.println("Samochód został pomyślnie dodany do magazynu " + car);
            }
        }
    }


    public void deleteLastAddedCar() {
        if (howManyCars == 0) {
            System.out.println("Magazyn jest pusty !");
        } else {
            howManyCars--;
            System.out.println("Usunięto ostatnie dodane auto:  " + carMagazine[howManyCars]);
            carMagazine[howManyCars] = null;
        }
    }
}