package homework1;

public class Main {

    public static void main(String[] args) {
        ////1. Sorting arrays////
        int n = 10;
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        Sorting.arrayFilling(arr);
        System.arraycopy(arr, 0, arr1, 0, n);
        System.arraycopy(arr, 0, arr2, 0, n);
        Sorting.bubbleSort(arr);
        Sorting.selectionSort(arr1);
        Sorting.standartSort(arr2);
        ////2. Factorial////
        int x = 5;
        Factorial.factorial(x);
        long startTime = System.nanoTime();
        Factorial.factorialRecursion(x);
        long estimatedTime = System.nanoTime()- startTime;
        System.out.println("Result = "+Factorial.factorialRecursion(x)+", time with recursion: "+estimatedTime+" - longer");
        ////3. Nested loops////
        NestedLoops.drawRectangle();
        NestedLoops.drawTriangle();
        NestedLoops.drawCircle();
        ////4. One-dimensional arrays ////
        OneArrays.arrOfOddNumbers();
        OneArrays.numberEvenOddElements();
        OneArrays.replacingOddIndexByZero();
        OneArrays.maxMinElementsPlusIndex();
        OneArrays.averageComparison();
        OneArrays.frequentElement();
        ////5. Multidimensional Arrays////
        MultidimensionalArrays.sumProductDiagonal();
        MultidimensionalArrays.valueAndIndexElement();
        MultidimensionalArrays.rowIndexWithMaxProduct();
        MultidimensionalArrays.sortedRows();
    }
}
