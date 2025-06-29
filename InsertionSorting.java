public class InsertionSorting {
    public static void main(String[] args) {
        int[] numbers = {15, 11, 13, 45, 25, 35, 35, 15, 43};
        int size = numbers.length;
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println("....................");
        System.out.println();
        System.out.println("Numbers before sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); 
        // Insertion Sort
        for (int i = 1; i < size; i++) {
            int temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && temp < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = temp;
        }
        System.out.println();

        // Printing sorted numbers
        System.out.println("Numbers after sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

