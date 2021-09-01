package com.company;

import java.util.Scanner;

public class Arephmetics_Action {

    public static void Arephmetics_Action() {
        int number_1;
        int number_2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("какое действие вы хотите сделать__'+' '-' '*' '/' '%' 'к'");
        String deystvie = scanner.nextLine();
        int len = deystvie.length();
        if (len > 1) {
            System.out.println("не правельное значение!");
            Arephmetics_Action();
        } else {
            switch (deystvie) {
                case "*":
                    System.out.println("Введите первое число для умножения");
                    number_1 = scanner.nextInt();
                    System.out.println("Введите второе число для умножения");
                    number_2 = scanner.nextInt();
                    System.out.println("Результат равняется = " + number_1 * number_2);
                    Arephmetics_Action();
                    break;
                case "+":
                    System.out.println("Ведите первое число для сложения");
                    number_1 = scanner.nextInt();
                    System.out.println("Ведите второе число для сложения");
                    number_2 = scanner.nextInt();
                    System.out.println("Результат равняется = " + (number_1 + number_2));
                    Arephmetics_Action();
                    break;
                case "-":
                    System.out.println("Ведите первое число для вычитание");
                    number_1 = scanner.nextInt();
                    System.out.println("Ведите второе число для вычитание");
                    number_2 = scanner.nextInt();
                    System.out.println("Результат равняется = " + (number_1 - number_2));
                    Arephmetics_Action();
                    break;
                case "/":
                    System.out.println("Ведите первое число для диление");
                    number_1 = scanner.nextInt();
                    System.out.println("Ведите второе число для диление");
                    number_2 = scanner.nextInt();
                    System.out.println("Результат равняется = " + number_1 / number_2);
                    Arephmetics_Action();
                    break;
                case "%":
                    System.out.println("Введите число равное 100%");
                    number_1 = scanner.nextInt();
                    System.out.println("Введите какой процент нужно вывести");
                    number_2 = scanner.nextInt();
                    System.out.println(" Результат равняется =  "+(number_1 / 100 * number_2)+"%");
                    Arephmetics_Action();
                    break;
                case "к":
                    System.out.println("Введите число для нахождения корня");
                    number_1 = scanner.nextInt();
                    System.out.println("Результат равняется = " + (1 + number_1 / 1)/2);
                    Arephmetics_Action();
                    break;
                default:
                    System.out.println("Не правельное значение!");
                    Arephmetics_Action();

            }
        }
    }

}
