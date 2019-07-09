public class ReverseString {
    public static void main(String[] args) {
        String s = "Это проверка";
            reverse(s, s.length()-1);
    }
    private static void reverse(String s, int index){ // Рекурсивный метод
        if(index ==0){
            System.out.print(s.charAt(0));
        }
        else {
            System.out.print(s.charAt(index));
            reverse(s, index -1);
        }
    }
    private static void reverse2(String s, int index){ // Обычный метод
        for(int i = index-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
