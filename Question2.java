public class Question2 {
    static int reverse(int num){

        int rev = 0;
        while(num > 0){
        rev = rev * 10 + num % 10;
        num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}
