package figures;

import ru.vlsu.lab5.ListElement;
import ru.vlsu.lab5.ListUtils;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество элементов: ");
        int N = sc.nextInt();
        System.out.println("Введите пары чисел x,y : ");
        ListElement first = null;
        for (int i = 0; i < N; i++) {
            String value = sc.next();
            first = ListUtils.insert(first, value);
        }
        String res = ListUtils.reduce(ListUtils.filter(first));
        System.out.println(res);
        }
    }
