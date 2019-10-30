package homework1;

public class NestedLoops {
    public static void drawRectangle(){
        System.out.println("--------3. Nested loops--------");
        System.out.println("----3.1----");
        int size = 5;
        for(int i = 1; i<=size; i++){
            for(int j = 1; j<size; j++){
                System.out.print("#");
            }
            System.out.println("#");
        }
        System.out.println();
    }
    public static void drawTriangle(){
        System.out.println("----3.2----");
        System.out.println("----triangle1----");
        for (int i = 1; i<=8; i++){
                for (int j = 0; j<i; j++){
                    System.out.print("#");
                }
                System.out.println();
            }
        System.out.println("----triangle2----");
        for (int i = 8; i>=1; i--){
            for (int j = 0; j<i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
        public static void drawCircle(){
            System.out.println("----Circle----");
            int length = 8;
            int width = 8;
            for (int i = 1; i <= length; i++)
            {
                if (i == 1 || i == length){
                    for (int j = 1; j <= width; j++) {
                        System.out.print("#");
                    }
                } else {
                    System.out.print("#");
                    for (int j = 1; j <= width - 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("#");
                }
                System.out.println();
            }
        }




}

