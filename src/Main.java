public class Main {
    public static void main(String[] args) {
        Car lada = new Car(1.7, "желтый", 2015);
        System.out.println(lada);
        System.out.println("");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", "черный", 2020, "Германия");
        System.out.println(audi);
        System.out.println("");

        Car bmw = new Car("BMW", "Z8", 3.0, 2021, "Германия");
        System.out.println(bmw);
        System.out.println("");

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", "Южная Корея");
        System.out.println(kia);
        System.out.println("");

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(hyundai);
    }
}