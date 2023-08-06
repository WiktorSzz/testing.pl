package pl.kurs.homework.ex2.app;

import pl.kurs.homework.ex2.models.Car;
import pl.kurs.homework.ex2.services.StorageService;

public class StorageServiceRunner {
    public static void main(String[] args) {
        StorageService storageService = new StorageService(10);
        Car car = new Car("Audi", "RS5", "Grey", 2012, 450);
        Car car2 = new Car("Skoda", "Octavia", "Candy White", 20,30 );
        Car car3 = new Car("Porsche", "911", "Green", 2019, 600);
        Car car4 = new Car("Fiat", "126p", "Blue", 2000, 25);
        Car car5 = new Car("Ferrari", "f40", "Rosso Corsa", 1991, 600);
        Car car6 = new Car("Bmw", "e92", "Saphirschwarz", 2011, 325);
        Car car7 = new Car("Ford", "Transit", "Silver", 2021, 150);

        storageService.addCar(car);
        storageService.addCar(car2);
        storageService.addCar(car3);
        storageService.addCar(car3);
        storageService.addCar(car3);
        storageService.addCar(car3);
        storageService.addCar(car4);
        storageService.addCar(car5);
       storageService.addCar(car6);
//        storageService.addCar(car7);
//        storageService.addCar(car3);
//        storageService.addCar(car3);

        storageService.deleteLastAddedCar();

    }

}
