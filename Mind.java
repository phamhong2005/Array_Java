public class Mind {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,3,5,6};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
                System.out.println("Phần tử nhỏ nhất là " + min);
                }
        }
    }
}
