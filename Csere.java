public class Csere {
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Csere
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Következő elemekre lépés
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] tomb = {2, 5, 1, 4, 3};

        System.out.println(Arrays.toString(tomb));    // [2, 5, 1, 4, 3]

        reverse(tomb);

        System.out.println(Arrays.toString(tomb));    // [3, 4, 1, 5, 2]
    }
}
