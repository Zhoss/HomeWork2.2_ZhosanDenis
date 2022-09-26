public class Person {
    private int birthYear;
    private String name;
    private String city;
    private String job;

    public Person(int birthYear, String name, String city, String job) {
        this.birthYear = birthYear;
        this.name = name;
        this.city = city;
        this.job = job;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }
}
