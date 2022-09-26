public class Person {
    private int birthYear;
    private String name;
    private String city;
    private String job;

    public Person(int birthYear, String name, String city, String job) {
        if (birthYear >= 0) {
            this.birthYear = birthYear;
        } else {
            this.birthYear = 0;
        }
        this.name = name;
        this.city = city;
        this.job = job;
    }

    public Person(int birthYear) {
        if (birthYear >= 0) {
            this.birthYear = birthYear;
        } else {
            this.birthYear = 0;
        }
        this.name = "Информация не указана";
        this.city = "Информация не указана";
        this.job = "Информация не указана";
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
