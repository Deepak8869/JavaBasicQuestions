//find min and max in an array//

public class Question4 {
    static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int findMin(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array = {1,23,44,55,765};
        System.out.println(findMax(array));
        System.out.println(findMin(array));
    }
}
