import java.util.Arrays;

public class index1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int size = 0;
        size = AddProduct(arr, 10, size);
        size = AddProduct(arr, 11, size);
        size = AddProduct(arr, 12, size);
        size = AddProduct(arr, 13, size);
        System.out.println(Arrays.toString(arr));
//        System.out.println(search(arr,13,size));
        System.out.println(delete(arr,13,size));
    }
    public static int delete(int[] arrDelete,int elementOke,int size){
        int index1 = search(arrDelete,elementOke,size);
        for (int i = index1; i <size ; i++) {
            arrDelete[i]=arrDelete[i+1];
        }
        size--;
        return size;
    }

    public static int AddProduct(int[] arr, int Element, int size) {
        arr[size] = Element;
        size++;
        return size;
    }
    public static int search(int[] arrSearch , int elementTab,int size){
        for (int i = 0; i < size; i++) {
            if (elementTab==arrSearch[i]){
                return i;
            }
        }
        return -1;
    }
}
