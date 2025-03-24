package ProjectCommands;

import java.time.LocalDateTime;



public class Project {
    private static int idCount = 0;
    private static int id;
    private static String surname;
    private static String name;
    private static String lastName;
    private static int age;
    private LocalDateTime data;

    public Project(String surname, String name, String lastName, int age) {
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = idCount;
        idCount++;
        this.data = LocalDateTime.now();
    }

    public static int getId() {
        return id;
    }
    public static String getSurname() {
        return surname;
    }
    public static String getLastName() {
        return lastName;
    }

    public LocalDateTime getTime() {
        return data;
   }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return " ID:" + id + " surname:" + surname + ", name:" + name + ", otchestvo:" + lastName + ", age:" + age + ", Time:" + data;
    }
}
