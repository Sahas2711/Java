public class Sum_of_array_elements {
    public static void main(String[] args) {
        float[] arr = new float[5];
        for (int i = 0; i < 4; i++) {
            arr[i] = i + 0.2f;
        }
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
