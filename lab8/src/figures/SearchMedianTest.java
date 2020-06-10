package figures;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SearchMedianTest {
    SearchMedian arr = new SearchMedian();

    //генерирует массив случайных чисел величиной до 1000
    private int[] generateArrayRnd(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }

    @org.junit.jupiter.api.Test
    public void simpleTest(){
        //медиана массива равна 87, массив изначально не отсортирован
        int[] a = {80,87,83,95,92};
        double actual = arr.findMedian(a);
        double expected = 87;
        assertEquals(expected,actual);
        //медиана массива равна 89.5, массив изначально не отсортирован
        int[] c = {80,87,83,95,92,98};
        actual = arr.findMedian(c);
        expected = 89.5;
        assertEquals(expected,actual);
    }

    //вызывает функцию большое количество раз с различным генерируемым рандомно набором данных
    @org.junit.jupiter.api.Test
    public void stresTestOne() {
        for (int i = 0; i < 101; i = i + 1) {
            System.out.println(arr.findMedian(generateArrayRnd(1000 + i)));
        }
    }

    @org.junit.jupiter.api.Test
    public void stresTestTwo() {
        for (int i = 0; i < 10001; i = i + 10) {
            System.out.println(arr.findMedian(generateArrayRnd(1000 + i)));
        }
    }

    @org.junit.jupiter.api.Test
    public void stresTestThree() {
        for (int i = 0; i < 100001; i = i + 100) {
            System.out.println(arr.findMedian(generateArrayRnd(1000 + i)));
        }
    }
}
