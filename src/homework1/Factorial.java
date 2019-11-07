package homework1;

public class Factorial {
    public static void factorial(int x) {
        System.out.println("--------2. Factorial--------");
        long startTime = System.nanoTime();
        long result = 1;
        for(int i = 1; i<=x; i++) {
            result = result * i;
        }
        long estimatedTime = System.nanoTime()- startTime;
        System.out.println("Result = "+result+", time without recursion: "+estimatedTime+" - less");
    }
    public static int factorialRecursion(int x) {

        int result = 1;
        if (x == 0 || x== 1)
            return x;
        result = x * factorialRecursion(x-1);

        return result;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

