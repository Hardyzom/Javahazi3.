public class Tomb {
    
        public static boolean equals(int[] array1, int[] array2) {
            if (array1 == null || array2 == null) {
                return false;
            }
    
            if (array1.length != array2.length) {
                return false;
            }
    
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
    
            return true;
        }
    
        public static void fill(int[] array, int value) {
            for (int i = 0; i < array.length; i++) {
                array[i] = value;
            }
        }
    
        public static void sort(int[] array) {
            int n = array.length;
            boolean swapped;
    
            do {
                swapped = false;
                for (int i = 1; i < n; i++) {
                    if (array[i - 1] > array[i]) {
                        // Csere
                        int temp = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);
        }
    
    }
    

