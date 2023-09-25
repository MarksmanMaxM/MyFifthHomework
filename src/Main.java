public class Main {
    public static void main(String[] args) {

        int i;
    // Задание 1

        for (i = 1; i <= 10; i++)
            System.out.println(i);

    // Задание 2

        for (i = 10; i >= 1; i--)
            System.out.println(i);

    // Задание 3

        for (i = 0; i <= 17; i++)
            if (i % 2 == 0) System.out.println(i);

    // Задание 4

        for (i = 10; i >= -10; i--)
            System.out.println(i);

    // Задание 5

        System.out.println("Високосные годы с 1904 по 2096:");

        for (i = 1904; i <= 2096; i++)
            if (i % 4 == 0) System.out.println(i);

    // Задание 6

        for (i = 7; i <= 98; i += 7)
            System.out.println(i);

    // Задание 7

        for (i = 1; i <= 512; i *= 2)
            System.out.println(i);

    // Задание 8

        int money = 29000;
        int result = money;

        for (i = 1; i <= 12; i++) {
            System.out.printf("В %d месяц сумма накоплений равна %d \n", i, result);
            result += money;
        }

    // Задание 9

        float resultBank = money;

        for (i = 1; i <= 12; i++) {
            System.out.printf("В %d месяц сумма накоплений в банке равна %,.2f \n", i, resultBank);
            resultBank += money + resultBank * 0.01;
        }

    // Задание 10


        for (i = 1; i <= 10; i++) {
            System.out.printf("2 * %d = %d \n", i, i*2);
        }


    }
}