import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài đi");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int size = 0;
        while (size != length) {
            System.out.println("Nhập số phần tử thứ " + size);
            int Element = sc.nextInt();
            arr[size] = Element;
            size++;
        }
        System.out.println(Arrays.toString(arr));


    }


}
