public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public Car(double engineVolume, String color, int productionYear) {
        this.brand = "default";
        this.model = "default";
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = "default";
    }

    public Car(String brand, String model, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = 1.5;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public Car(String brand, String model, double engineVolume, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = "белый";
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public Car(String brand, String model, double engineVolume, String color, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = 2000;
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Автомобиль: марка - " + brand + ", модель - " + model + ", объем двигателья - " + engineVolume + ", цвет кузова - " + color + ", год производства - " + productionYear + ", страна сборки - " + productionCountry;
    }
}
