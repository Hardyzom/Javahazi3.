import java.util.Arrays;

public class MyArrayUtils {
    public static void sortDescending(int[] array) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] tomb = { 2, 5, 1, 4, 3 };

        System.out.println(Arrays.toString(tomb));    // [2, 5, 1, 4, 3]

        sortDescending(tomb);

        System.out.println(Arrays.toString(tomb));    // [5, 4, 3, 2, 1]
    }
}
