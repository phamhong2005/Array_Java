public class MaxMind {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        System.out.println(" Max là " + MaxMind(arr));

    }
    public static int MaxMind(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
