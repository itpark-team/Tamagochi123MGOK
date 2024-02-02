import java.util.Scanner;

public class Util {


    public static int inputInt(String message, int min, int max) {
        boolean isValidInput;
        int output = 0;
        do {
            try {
                isValidInput = true;
                Scanner scanner = new Scanner(System.in);

                System.out.print(message);
                output = scanner.nextInt();

                if (output < min || output > max) {
                    System.out.println("Ошибка ввода. Вы вышли за границы диапазона от " + min + " до " + max);
                    throw new Exception();
                }

            } catch (Exception e) {
                isValidInput = false;
                System.out.println("Ошибка ввода. Пожалуйста повторите ввод");
            }

        } while (isValidInput == false);

        return output;
    }

    public static void printlnMessage(String message) {
        System.out.println(message);
    }

    public static void printlnEnter() {
        System.out.println();
    }

    public static void screenClean() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }

}
