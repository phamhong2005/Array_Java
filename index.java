import java.util.Arrays;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Nhập độ dài đi");
        int length = Input.nextInt();
        int[] arr = new int[length];
        int size = 0;

        while (size!=length){
            System.out.println("Nhập phần tử đi ");
            int Element = Input.nextInt();
            arr[size] = Element;
            size++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
