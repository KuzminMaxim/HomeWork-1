package homework1;

import java.util.Arrays;

public class MultidimensionalArrays {
    private static void showArray(int[][] arr){
        for (int[] j : arr) {
            for (int i : j) {
                System.out.print(" " + i);
            }
            System.out.println(" ");
        }
    }
    public static void taskA() {
        System.out.println("----5.a----");
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (1 + Math.random() * 99);
            }
        }
        MainDiagonal(arr);
        SideDiagonal(arr);
    }

    private static void MainDiagonal(int[][] arr) {
        int sum = 0;
        long composition = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                    composition *= arr[i][j];
                }
            }
        }
        System.out.println("Composition of the main diagonal: " + composition);
        System.out.println("Sum on the main diagonal: " + sum);
    }

    private static void SideDiagonal(int[][] arr) {
        int sum = 0;
        long composition = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (i == j) {
                    sum += arr[i][arr.length - 1 - j];
                    composition *= arr[i][arr.length - 1 - j];
                }
            }
        }
        System.out.println("Composition of the side diagonal: " + composition);
        System.out.println("Sum on the side diagonal: " + sum);
    }

    public static void taskB() {
        System.out.println("----5.b----");
        int[][] arr = new int[8][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 199) - 99;
            }
        }
        showArray(arr);
        max(arr);
    }

    private static void max(int[][] arr) {
        int maxEl = arr[0][0];
        int iForMax = 0;
        int jForMax = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (maxEl < arr[i][j]) {
                    maxEl = arr[i][j];
                    iForMax = i;
                    jForMax = j;
                }
            }
        }
        System.out.println("MaxEl: "+maxEl+" Index: "+iForMax+ ", " + jForMax);
    }
    public static void taskC(){
        System.out.println("----5.c----");
        int[][] arr = new int[8][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 21) - 10;
            }
        }
        showArray(arr);
        maxComposition(arr);
    }
    private static void maxComposition(int[][] arr){
        int maxString = 0;
        int maxI = 0;
        for (int i = 0; i < arr.length; i++) {
            int composition=1;
            for (int j = 0; j < arr[i].length; j++) {
                composition *= Math.abs(arr[i][j]);
            }
            if (maxString<composition){
                maxString = composition;
                maxI = i;
            }
        }
        System.out.println("Max composition: "+maxString+" Index of string: "+ maxI);
    }
    public static void taskD(){
        System.out.println("----5.d----");
        int[][] arr = new int[10][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 101);
            }
        }
        showArray(arr);
        showArray(sort(arr));
    }
    private   static  int[][] sort(int[][] arr) {
        System.out.println("Sorted array: ");
        for (int k = 0; k < arr.length; k++){
            for (int i = 0; i < arr[i].length; i++) {
                for (int j = 0; j < arr[j].length; j++) {
                    if (arr[k][i] > arr[k][j]) {
                        int n;
                        n = arr[k][i];
                        arr[k][i] = arr[k][j];
                        arr[k][j] = n;
                    }
                }
            }
        }
        return arr;
    }
}
