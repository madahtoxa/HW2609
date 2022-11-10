package Task1;

public class Car {
    private String carBrand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarBrand() {
        this.carBrand = "default";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModel() {
        this.model = "default";
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void setEngineVolume() {
        this.engineVolume = 1.5;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setColor() {
        this.color = "White";
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    public void setProductionYear() {
        this.productionYear = 2000;
    }
    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public void setProductionCountry() {
        this.productionCountry = "default";
    }

    public String getBrand() {
        return carBrand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public Car(String carBrand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.carBrand = carBrand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public Car() {
    }

    public String toString() {
        return "Task1.Car brand= " + carBrand +
                ". Model= " + model +
                ". engineVolume= " + engineVolume +
                ". Color= " + color +
                ". productionYear= " + productionYear +
                ". productionCountry= " + productionCountry + ".";

    }
}
