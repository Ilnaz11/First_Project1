import java.util.Scanner;
import java.util.*;


public class Main {
    private List<Person> users;

    public Main() {
        users = new ArrayList<>();
        System.out.println("[PROJECT-CREATE] ");
    }

    public void addUsers(String name, int age, String surname, String lastName) {
        Person per = new Person(name, age, surname, lastName);
        per.getId();
        users.add(per);
        System.out.println("Пользователь сохранен: " + per);
    }
// :)

    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("Нет пользователей.");
        } else {
            System.out.println("Список пользователей:");
            for (Person user : users) {
                System.out.println(user);
            }
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[СОЗДАНИЕ ПОЛЬЗОВАТЕЛЯ] ");
            System.out.println("[ВВЕДИТЕ ФАМИЛИЮ]");
            String surname = scanner.nextLine();
            System.out.println("[ВВЕДИТЕ ИМЯ]");
            String name = scanner.nextLine();
            System.out.println("[ВВЕДИТЕ ОТЧЕСТВО]");
            String lastName = scanner.nextLine();
            System.out.println("[ВВЕДИТЕ ВОЗРАСТ]");
            int age;
            try {
                age = Integer.parseInt(scanner.nextLine());
                main.addUsers(name, age, surname, lastName);
                main.displayUsers();
            } catch (NumberFormatException e) {
                System.out.println("Возраст должен быть числом.\nВводите данные по новой");
            }
            break;
        }
    }
}
