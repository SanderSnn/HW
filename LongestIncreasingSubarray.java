import java.util.Scanner;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во членов последовательности: ");
        int n = in.nextInt();
        int[] num = new int[n];
        if (n < 2) {
            System.out.println("В последовательности должно быть минимум два элемента!");
        } else {
            arrayShow(arrayInsert(num, in));
            System.out.println("Наибольшее кол-во возрастающих элементов подряд: ");
            System.out.println(LongestIncrSubArray(num));
        }
    }

    private static int[] arrayInsert(int[] num, Scanner in) {
        for (int i = 0; i < num.length; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            num[i] = in.nextInt();
        }
        return num;
    }

    private static void arrayShow(int[] num) {
        System.out.print("[ ");
        for (int i : num) {
            System.out.printf("%d ", i);
        }
        System.out.println("]");
    }

    private static int LongestIncrSubArray(int[] num) {
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i - 1] < num[i]) {
                count++;
            }
            if (num.length == 2 && num[i - 1] < num[i]) {
                maxCount = 2;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 1;
            }
        }
        return maxCount;
    }
}
