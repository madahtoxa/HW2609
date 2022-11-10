package Task2;

class Flower {
    String flowerColor;
    String name;
    String country;
    Double cost;


    Integer stayDay;

    public Flower(String name, String flowerColor, String country, Double cost, Integer stayDay) {
        this.name = name;
        if(isNull(flowerColor)){
            this.flowerColor="Белый";
        }
        this.country = country;
        this.cost = cost;
        this.stayDay = stayDay;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public Double getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor=flowerColor;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "Russia";
        } else {
            this.country = flowerColor;
        }
    }

    public void setCost(Double cost) {
        if (cost == null || cost != null || cost != 0) {
            this.cost = null;
        } else {
            this.cost = cost;
        }
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setStayDay(Integer stayDay) {
        if (stayDay<=0) {
            this.stayDay = 3;
        } else {
            this.stayDay = stayDay;
        }
    }

    public static boolean isNull(String value){
        return value==null||value.isBlank();
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", stayDay=" + stayDay +
                '}';
    }
}
