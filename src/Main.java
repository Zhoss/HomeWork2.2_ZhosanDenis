import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Person maxim = new Person(localDate.getYear() - 35, "Максим", "Минск","бренд-менеджер");
        Person anya = new Person(-1985, "Аня", "Москва", "методист образовательных программ");
        Person katya = new Person(localDate.getYear() - 28, "Катя", "Калининград", "продакт-менеджер");
        Person artem = new Person(localDate.getYear() - 27);

        sayHello(maxim);
        sayHello(anya);
        sayHello(katya);
        sayHello(artem);
    }
    public static void sayHello(Person person) {
        System.out.println("Привет! Меня зовут " + person.getName() + ". Я из города " + person.getCity() + ". Я родился/лась в " + person.getBirthYear() + " году. Я работаю на должности " + person.getJob() + ". Будем знакомы!");
    }
}