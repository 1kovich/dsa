import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Выберите студента 1 до 2 ");
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        Kairat(b);
        azamat(b);
    }

    static int Kairat(int b) {
        if (b == 1) {
            System.out.println("Зовут : Кайрат  ");
            System.out.println("Место положение  : Кочкор-ата  ");
            System.out.println("Место положение  : Кочкор-ата  ");

        }
        return b;
    }

    static int azamat(int b) {
        if (b == 2) {
            System.out.println("Зовут : Azamat ");
            System.out.println("Место положение  : Кочкор-ата  ");
            System.out.println("Возраст  : 15 ");


        }
        return b;
    }
}