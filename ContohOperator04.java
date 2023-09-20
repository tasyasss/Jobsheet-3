package Jobsheet3;

public class ContohOperator04 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println("nilai x sebelum operasi x++ adalah " + x++);
        System.out.println("setelah operasi, nilai x adalah " + x);

        int y = 5;
        System.out.println("\nnilai y sebelum operasi ++y adalah " + y);
        System.out.println("setelah operasi, nilai y adalah " + ++y);

        int z = 10;
        System.out.println();
        
        System.out.println(x < z);
        System.out.println(y == x);
        System.out.println(y <= x);
        System.out.println(y <= x && x < z || y == x);

        // bitwise ^
        int i = z ^ x;
        System.out.println("\nnilai i adalah " + i);

        i %= 4;
        System.out.println("\nnilai i setelah operasi i %= 4 adalah " + i);
    }
}
