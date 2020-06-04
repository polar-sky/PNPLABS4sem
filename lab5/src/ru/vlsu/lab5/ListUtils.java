package ru.vlsu.lab5;

public class ListUtils {
static ListElement p = null;

    public static ListElement insert(ListElement first, String value){
        if (first == null){
            return new ListElement(value);
        } else{
            ListElement p = first;
            while (p.getNext() != null) p=p.getNext();
            p.setNext(new ListElement(value));
            return first;
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static boolean isSimple(String str) {
        String[] arr = str.split(",");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        return gcd(a, b) == 1;
    }

    //рекурсивная операция фильтрования. возвращает новый список на основе исходного list, в котором находятся элементы, у которых gcd(x,y)=1
    public static ListElement filter(ListElement first){
        if (first != null){
            if (isSimple(first.getValue())) p = insert(p, first.getValue());
                filter(first.getNext());
            }
        return p;
    }

    public static String reduce(ListElement first) {
        String sum = "";
        while (first != null) {
            sum += first.getValue()+"; ";
            first = first.getNext();
        }
        return sum;
    }
}
