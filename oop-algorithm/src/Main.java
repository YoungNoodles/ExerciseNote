import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[] arr = {165, 5, 175, 61, 108, 18, 101, 57, 167, 141, 51, 156, 147, 13, 194, 177, 193, 52, 158, 194, 170, 197, 119, 153, 51, 76, 73, 155, 127, 49};
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    count++;
                    System.out.println(Arrays.toString(arr) + count);
                }
            }
        }*/
        String a = "谁";
        String b = "爸爸";
        System.out.println(a.compareTo(b));
    }
}