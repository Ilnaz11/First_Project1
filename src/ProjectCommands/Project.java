package ProjectCommands;

import java.time.LocalDateTime;



public class Project {
    private static int idCount = 1;
    private int id;
    private String surname;
    private String name;
    private String lastName;
    private int age;
    private LocalDateTime data;

    public Project(String name, int age, String surname, String lastName) {
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = idCount;
        idCount++;
        this.data = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getTime() {
        return data;
   }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return " ID:" + id + " surname:" + surname + ", name:" + name + ", otchestvo:" + lastName + ", age:" + age + ", Time:" + data;
    }
}
