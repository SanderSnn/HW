import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел Фибоначчи вывести на экран? ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNum(i) + " ");
        }
        System.out.println();
        System.out.print("До какого значения числа вывести на экран числа Фибоначчи? ");
        int x = in.nextInt();
        boolean isGood = true;
        int k = 0;
        while(isGood){
            System.out.print(fibonacciNum(k) + " ");
            if(fibonacciNum(k+1) > x){
                isGood = false;
            }
            k++;
        }
    }

    private static long fibonacciNum(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        }
        long prev = 1;
        long oldprev = 1;
        long fib = 1;
        for (int i = 2; i < num; i++) {
            fib = prev + oldprev;
            oldprev = prev;
            prev = fib;
        }
        return fib;
    }
}
