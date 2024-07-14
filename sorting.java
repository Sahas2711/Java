public class sorting {
    public static void selection_sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minval = array[i];
            int minindex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (minval > array[j]) {
                    minval = array[j];
                    minindex = j;
                }
            }
            int temp = array[minindex];
            array[minindex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        selection_sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}