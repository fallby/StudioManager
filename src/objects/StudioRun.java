package objects;

import java.util.ArrayList;
import java.util.Scanner;

public class StudioRun {
    private final ArrayList<Specialist> specialists = new ArrayList<Specialist>();
    private final ArrayList<Client> clients = new ArrayList<Client>();

    public static void addSpecialist(Scanner scanner, ArrayList<Specialist> arrayList) {
        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите отчество:");
        String patronymic = scanner.nextLine();

        Specialist specialist = new Specialist(surname, name, patronymic);
        arrayList.add(specialist);
    }

    public static void addClient(Scanner scanner, ArrayList<Client> arrayList) {
        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите отчество:");
        String patronymic = scanner.nextLine();

        Client client = new Client(surname, name, patronymic);
        arrayList.add(client);
    }

    public static void changeSurname(Scanner scanner, Person person) {
        String surname = scanner.nextLine();
        person.setSurname(surname);
    }

    public static void changeName(Scanner scanner, Person person) {
        String name = scanner.nextLine();
        person.setName(name);
    }

    public static void changePatronymic(Scanner scanner, Person person) {
        String patronymic = scanner.nextLine();
        person.setPatronymic(patronymic);
    }

    public static void updateInfoSpecialist(Scanner scanner, ArrayList<Specialist> arrayList) {
        boolean is_working = true;
        while (is_working) {
            System.out.println("Выберите специалиста:");
            printList(scanner, arrayList);
            int personNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Выберите действие:");
            System.out.println("1. Обновить фамилию");
            System.out.println("2. Обновить имя");
            System.out.println("3. Обновить отчество");

            System.out.println("0. Назад");
            Specialist specialist = arrayList.get(personNumber);
            if (personNumber < 0 || personNumber > arrayList.size() + 1) {
                System.out.println("Введите существующий номер");
            }

            int point = scanner.nextInt();
            scanner.nextLine();

            switch (point) {
                case 1:
                    System.out.println("Введите фамилию:");
                    changeSurname(scanner, specialist);
                    break;
                case 2:
                    System.out.println("Введите имя:");
                    changeName(scanner, specialist);
                    break;
                case 3:
                    System.out.println("Введите отчество:");
                    changePatronymic(scanner, specialist);
                    break;
                case 0:
                    is_working = false;
                    break;
                default:
                    System.out.println("Выберите существующий пункт меню.");
            }
        }
    }

    public static void printList(Scanner scanner, ArrayList<? extends Person> arrayList) {
        if (!arrayList.isEmpty()) {
            for (int i = 0; i <= arrayList.size(); i++) {
                System.out.println(i + 1 + ". " + arrayList.get(i));
            }
        } else {
            System.out.println("Список пустой");
        }
    }

    public static void StudioRunMenu(Scanner scanner, ) {

        boolean is_working = true;
        while (is_working) {
            System.out.println("Объекты и ArrayList");
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить специалиста"); //есть
            System.out.println("2. Обновить данные специалиста");
            System.out.println("3. Удалить специалиста по фамилии");
            System.out.println("4. Удалить всех специалистов");
            System.out.println("5. Поиск специалиста по фамилии");
            System.out.println("6. Вывести специалиста по индексу");
            System.out.println("7. Вывести список всех специалистов"); //есть

            System.out.println("8. Добавить клиента"); //есть
            System.out.println("9. Обновить данные клиента");
            System.out.println("10. Удалить клиента по фамилии");
            System.out.println("11. Удалить всех клиентов");
            System.out.println("12. Поиск клиента по фамилии");
            System.out.println("13. Вывести клиента по индексу");
            System.out.println("14. Вывести список всех клиентов"); //есть
            System.out.println("0. Назад");

            int point = scanner.nextInt();
            scanner.nextLine();

            switch (point) {
                case 1:
                    System.out.println("Введите ФИО специалиста:");
                    addSpecialist(scanner, specialists);
                    break;
                case 2:
                    updateInfoSpecialist(scanner, specialists);
                    break;
                case 7:
                    System.out.println("Все специалисты:");
                    printList(scanner, specialists);
                    break;
                case 8:
                    System.out.println("Введите ФИО клиента:");
                    addClient(scanner, clients);
                    break;
                case 14:
                    System.out.println("Все клиенты:");
                    printList(scanner, clients);
                    break;
                case 0:
                    is_working = false;
                    break;
                default:
                    System.out.println("Выберите существующий пункт меню.");
            }
        }
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        StudioRunMenu(scanner);
    }

}