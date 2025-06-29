public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 15, 11, 13, 45, 25, 35, 35, 15, 43 };
        int size = arr.length;
        int midIndex;
        int minvalue;
        System.out.println();
        System.out.println("Selection Sort");
        System.out.println("..........................");
        System.out.println();
        System.out.println("Number Before Sorting");
        // for printing given index numbers
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // for looping
        for (int i = 0; i < size; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

            System.out.println("Array after sorted");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }

    }
}
