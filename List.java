import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        int[] ar = new int[10];
        for (int i = 0; i < 10; i++) {
            ar[i] = i;
        }
        System.out.println(Arrays.toString(ar));

        for (int i = 3; i < ar.length - 1; i++) {
            ar[i -1] = ar[i];
        }
        System.out.println(Arrays.toString(ar));
    }
}