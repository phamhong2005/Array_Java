import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int [] array = new int[5];
        int size = 0;
        size = addList(array, 10 , size);
        size = addList(array, 1 , size);
        size = addList(array, 120 , size);
        System.out.println(Arrays.toString(array));
        System.out.println("Số phần tử trong mảng là " + size);
    }
    public static int addList(int[] arr , int Element , int size) {
        arr[size] = Element;
        size ++;
        return size;
    }
}
