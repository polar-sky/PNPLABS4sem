package figures;

import java.util.Arrays;

public class SearchMedian {

    public static double findMedian(int[] array){
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0) {
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        } else
            median = array[array.length/2];
        return median;
    }
}