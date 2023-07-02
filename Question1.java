//Swapping of two numbers//


public class Question1 {
    static void swap(int n1,int n2){
       n1 = n1+n2;
       n2 = n1-n2;
       n1 = n1 - n2;

    }
    public static void main(String[] args) {
      int n1 = 10;
      int n2 = 20;
       System.out.println("Before Swapping " + n1 + n2);
       int temp = n1;
       n1 = n2;
       n2 = temp;
    swap(n1,n2);
      System.out.println("After swapping " + n1 + n2);
    }
}
