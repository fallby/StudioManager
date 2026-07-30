package objects;

import java.util.ArrayList;
import java.util.Scanner;

public class StudioRun {

    public static <T> void inputNames(Scanner scanner, ArrayList<T> arrayList) {
        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите отчество:");
        String patronymic = scanner.nextLine();

    }

    public static void StudioRunMenu(Scanner scanner) {

        boolean is_working = true;
        while (is_working) {
            System.out.println("Объекты и ArrayList");
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить специалиста");
            System.out.println("2. Обновить данные специалиста");
            System.out.println("3. Удалить специалиста по имени");
            System.out.println("4. Удалить всех специалистов");
            System.out.println("5. Поиск специалиста по фамилии");
            System.out.println("6. Вывести специалиста по индексу");
            System.out.println("7. Вывести список всех специалистов");

            System.out.println("8. Добавить клиента");
            System.out.println("9. Обновить данные клиента");
            System.out.println("10. Удалить клиента по имени");
            System.out.println("11. Удалить всех клиентов");
            System.out.println("12. Поиск клиента по фамилии");
            System.out.println("13. Вывести клиента по индексу");
            System.out.println("14. Вывести список всех клиентов");
            System.out.println("0. Назад");

            int point = scanner.nextInt();
            scanner.nextLine();

            switch (point) {
                case 1:
                    System.out.println("Введите ФИО специалиста:");
                    inputNames(scanner, specialists);
                    break;
                case 2:
                    System.out.println("Все специалисты:");
                    outputNames(specialists);
                    break;
                case 3:
                    System.out.println("Введите ФИО клиента:");
                    inputNames(scanner, clients);
                    break;
                case 4:
                    System.out.println("Все клиенты:");
                    outputNames(clients);
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
        ArrayList<Specialist> specialists = new ArrayList<Specialist>();
        ArrayList<Client> clients = new ArrayList<Client>();

        StudioRunMenu(scanner);
    }

}