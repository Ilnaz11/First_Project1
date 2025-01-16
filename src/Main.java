import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.*;


public class Main {
    private List<Person> users;
    private List<LocalDateTime> save;


    public Main() {
        users = new ArrayList<>();
        System.out.println("[PROJECT-CREATE] ");
    }

    public void addUsers(String name, int age, String surname, String lastName) {
        Person per = new Person(name, age, surname, lastName);
        per.getId();
        users.add(per);
        System.out.println("Пользователь сохранен: " + per);
        System.out.println("Время и дата добавления пользователя: ");

    }
    public void getToday() {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
    }



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
        System.out.println("После того как ведете данные пользователя,напишите слово - exit");
        while (true) {
            System.out.println("Введите данные пользователя через пробел\nА именно ФИО и возраст: ");
            String surname = scanner.nextLine();
            String name = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age;
            try {
                age = Integer.parseInt(scanner.nextLine());
                main.addUsers(name, age, surname, lastName);
                main.displayUsers();
            } catch (NumberFormatException e) {
                System.out.println("Возраст должен быть числом.\nВводите данные по новой");
            } finally {
                String exit = scanner.nextLine();
                if(exit.equals("exit")) {
                    break;
                }
            }
        }
    }
}
