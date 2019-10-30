package homework1;

import java.util.Arrays;

public class OneArrays {
    private static void arrayFilling(int[] arr){
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*10);
        }
    }
    private static void asc(int[] arr) {
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
        System.out.println("In ascending order:"+Arrays.toString(arr));
        }
    }
    private static void desc(int[] arr) {
        boolean needIter = true;
        while(needIter) {
            needIter = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]>arr[i-1]) {
                    int x = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = x;
                    needIter = true;
                }
            }
        }
        System.out.println("In decreasing order:"+Arrays.toString(arr));
    }

    public static void arrOfOddNumbers(){
        System.out.println("----4.a----");
        int[] arr = new int[50];
        for (int i = 0, d = 1; d < 100; i++, d+=2) {
            arr[i] = d;
        }
        asc(arr);
        desc(arr);
    }
    public static void numberEvenOddElements(){
        System.out.println("----4.b----");
        int[] arr = new int[20];
        int even = 0;
        int odd = 0;
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*10);
            if (arr[i] % 2 == 0){
            even++;
            } else {
                odd++;
            }
        }
        System.out.println("Array of 20 numbers"+ Arrays.toString(arr));
        System.out.println("Even: "+ even);
        System.out.println("Odd: "+ odd);

        }
        public static void replacingOddIndexByZero(){
            System.out.println("----4.c----");
        int[] arr = new int[10];
            for (int i = 0; i<arr.length; i++) {
                arr[i] = (int) (Math.random() *100)+1;
            }
            System.out.println("Array of 10 numbers: "+ Arrays.toString(arr));
            for (int i = 0; i<arr.length; i++) {
                if (i % 2 !=0){
                    arr[i] = 0;
                }
            }
            System.out.println("Array of 10 numbers with zero: "+ Arrays.toString(arr));
        }
        public static void maxMinElementsPlusIndex(){
        System.out.println("----4.d----");
        int[]arr = new int[15];
        int min = arr[0];
        int max = arr[0];
        int indexForMin = 0;
        int indexForMax = 0;

            for (int i = 0; i<arr.length; i++) {
                arr[i] = (int) (Math.random() *101)-50;
            }
            for (int i = 0; i<arr.length; i++){
                if (min >= arr[i]){
                    min = arr[i];
                    indexForMin=i;
                }
                if (max <= arr[i]){
                    max = arr[i];
                    indexForMax=i;
                }
            }
            System.out.println("indexForMin: "+indexForMin);
            System.out.println("indexForMax: "+indexForMax);
            System.out.println("Min: "+min);
            System.out.println("Max: "+max);
        }
        public static void averageComparison(){
        System.out.println("----4.e----");
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double avg1 = 0;
        double avg2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        arrayFilling(arr1);
        arrayFilling(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
            for (int i : arr1) {
                sum1 += i;
                avg1 = (double) sum1 / arr1.length;
            }
            for (int i : arr2) {
                sum2 +=i;
                avg2 = (double) sum2 / arr2.length;
            }
                if (avg1 < avg2){
                    System.out.println("The average for the second array is greater");
                }
                else if (avg2 < avg1){
                    System.out.println("The average for the first array is greater");
                }
                else if (avg1 == avg2) {
                    System.out.println("The average of two arrays is the same");
                }
        }
        public static void frequentElement(){
        System.out.println("----4.f----");
        int[] arr = new int[20];
        int zeroCount =0;
        int oneCount =0;
        int minusOneCount = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() *3)-1;
                if (arr[i] == -1){
                    minusOneCount++;
                }
                else if (arr[i] == 0){
                    zeroCount++;
                }
                else
                    oneCount++;
            }
            System.out.println(Arrays.toString(arr));
            if (minusOneCount>zeroCount && minusOneCount>oneCount){
                System.out.println("Most common: -1");
            }
            else{
                if (zeroCount>minusOneCount && zeroCount>oneCount){
                    System.out.println("Most common: 0");
                }
                else if (oneCount>minusOneCount && oneCount>zeroCount){
                    System.out.println("Most common: 1");
                }
                else if (minusOneCount == zeroCount){
                    System.out.println("The same number of times found: -1 and 0");
                }
                else if (minusOneCount == oneCount){
                    System.out.println("The same number of times found: -1 and 1");
                }
                else if (zeroCount == oneCount){
                    System.out.println("The same number of times found: 0 and 1");
                }
            }

        }

    }

