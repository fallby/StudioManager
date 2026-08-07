import arrays.StudioArray;
import objects.StudioRun;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        StudioRun studioRun = new StudioRun();

        boolean is_working = true;

        while (is_working) {
            System.out.println("Система управления");
            System.out.println("Выберите способ управления:");
            System.out.println("1. Массив");
            System.out.println("2. Объекты и ArrayList");

            System.out.println("5. Выйти");

            int point = scanner.nextInt();
            scanner.nextLine();
            switch (point) {
                case 1:
                    StudioArray.arrayMenu(scanner);
                    break;
                case 2:
                    studioRun.StudioRunMenu(scanner);
                    break;

                case 5:
                    System.out.println("Выход из системы.");
                    is_working = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Выберите существующий пункт меню.");

            }
        }
    }
}