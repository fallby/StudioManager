package arrays;
import java.util.Scanner;

public class StudioArray {
    private static String[] specialists = new String[4];
    private static String[] clients = new String[3];

    public static void inputNames(Scanner scanner, String[] names) {
        int arrayLength = names.length;
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("№" + (i + 1));
            System.out.println("Введите фамилию:");
            String surname = scanner.nextLine();
            System.out.println("Введите имя:");
            String name = scanner.nextLine();
            System.out.println("Введите отчество:");
            String patronymic = scanner.nextLine();

            String fullName = surname + " " + name + " " + patronymic;
            names[i] = fullName;
        }
    }

    public static void outputNames(String[] names) {
        int arrayLength = names.length;
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(names[i]);
        }
    }

    public static void arrayMenu(Scanner scanner) {
        boolean is_working = true;
        while (is_working) {
            System.out.println("Массивы");
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить специалистов");
            System.out.println("2. Вывести список всех специалистов");
            System.out.println("3. Добавить клиентов");
            System.out.println("4. Вывести список всех клиентов");
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
}
