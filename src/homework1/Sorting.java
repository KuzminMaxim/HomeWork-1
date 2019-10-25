package homework1;

import java.util.Arrays;

public class Sorting {
    public static int[] arrayFilling(int[] arr){
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    public static void bubbleSort(int[] arr) {
        System.out.println("----1.----");
        long startTime = System.nanoTime ();
        boolean needIter = true;
        while(needIter) {
            needIter = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]<arr[i-1]) {
                    int x = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = x;
                    needIter = true;
                }
            }

        }
        long estimateTime = System.nanoTime () - startTime;
        System.out.println("----bubbleSort----");
        System.out.println("Time: "+estimateTime+" - values of the same order");
    }
    public static void selectionSort(int[] arr){
        long startTime = System.nanoTime ();
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int x = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = x;
            }
        }
        long estimateTime = System.nanoTime () - startTime;
        System.out.println("----selectionSort----");
        System.out.println("Time: "+estimateTime+" - values of the same order");
    }
    public static void standartSort(int[] arr){
        long startTime = System.nanoTime ();
        Arrays.sort(arr);
        long estimateTime = System.nanoTime () - startTime;
        System.out.println("----standartSort----");
        System.out.println("Time: "+estimateTime+" - longest");
    }

}
