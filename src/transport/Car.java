package transport;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private String color;
    private Integer productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean summerTyres;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isSeasonTypes() {
        return summerTyres;
    }

    public void setSeasonTypes(boolean seasonTypes) {
        this.summerTyres = seasonTypes;
    }

    public Car(String brand,
               String model,
               Double engineVolume,
               String color,
               Integer productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean seasonTypes) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        if (isNull(color)) {
            this.color = "black";
        } else {
            this.color = color;
        }
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.summerTyres = summerTyres;
    }

    public static boolean isNull(String value) {
        return value == null || value.isBlank();
    }

    public static boolean chekAutoNumber(String autoNumber) {
        char[] chars = autoNumber.toCharArray();
        if (autoNumber.length() != 9) {
            return false;
        }
        if (!Character.isAlphabetic(autoNumber.charAt(0))
                && !Character.isAlphabetic(autoNumber.charAt(4))
                && !Character.isAlphabetic(autoNumber.charAt(5))) {
            return false;
        }
        if (!Character.isDigit(autoNumber.charAt(1))
                || !Character.isDigit(autoNumber.charAt(2))
                || !Character.isDigit(autoNumber.charAt(3))
                || !Character.isDigit(autoNumber.charAt(6))
                || !Character.isDigit(autoNumber.charAt(7))
                || !Character.isDigit(autoNumber.charAt(8))) {
            return false;
        }

        return true;
    }

    public static class Key {
        final private boolean remoteStart;
        final boolean keyAccess;

        public Key(boolean remoteStart, boolean keyAccess) {
            this.keyAccess = keyAccess;
            this.remoteStart = remoteStart;
        }
    }

    public static class Insureance {
        private final LocalDate validUntil;
        private final double cost;
        private final String insureanceNumber;

        public Insureance(LocalDate validUntil, double cost, String insureanceNumber) {
            this.validUntil = validUntil;
            if (validUntil.isBefore(LocalDate.now())) {
                System.out.println("Срочно едем оформляться");
            }
            if (insureanceNumber.length() < 9) {
                System.out.println("Номер страховки не правильный");
            }
            this.cost = cost;
            this.insureanceNumber = insureanceNumber;
        }
    }
}