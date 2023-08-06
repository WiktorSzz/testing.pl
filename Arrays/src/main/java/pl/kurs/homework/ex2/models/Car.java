package pl.kurs.homework.ex2.models;

public class Car {
    private String producer;
    private String model;
    private String color;
    private int productionYear;
    private int hP;

    public Car(String producer, String model, String color, int productionYear, int hP) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.hP = hP;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int gethP() {
        return hP;
    }


    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", hP=" + hP +
                '}';
    }
}
