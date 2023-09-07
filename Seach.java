import java.util.Arrays;
import java.util.Scanner;

public class Seach {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int size = 0;
        size = addlist(arr, 1, size);
        size = addlist(arr, 2, size);
        size = addlist(arr, 3, size);
        size = addlist(arr, 4, size);
        System.out.println(Arrays.toString(arr));
        System.out.println("Size lúc đầu là " + size);
        System.out.println("Phần tử thứ 3 là " + search(arr,3,size));
        System.out.println("Phần tử sau khi sửa là " + delete(arr,1,size));
    }
    public static int delete(int[] arr , int ElementDelete,int size){
        int index = search(arr,ElementDelete,size);// tìm phần tử xem có thuộc mảng không
        for (int i = index; i <size ; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return size;
    }

    public static int addlist(int[] arr, int Element, int size) {  // thêm phần tử vào mảng
        arr[size] = Element;
        size++; // size là số phần tử của mảng
        return size;
    }
    public static int search(int[]arr , int elementSearch , int size){ // tìm vị trí của phần tử
        for (int i = 0; i < size; i++) {
            if (elementSearch==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
