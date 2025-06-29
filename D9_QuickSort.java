public class D9_QuickSort{
    public static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right); 
            quickSort(arr, left, pivotIndex - 1); 
            quickSort(arr, pivotIndex + 1, right); 
        }
    }

   
    public static int partition(int arr[], int left, int right) {
        int pivot = arr[left]; 
        int i = left + 1; 
        int j = right; 

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) i++;

            while (i <= j && arr[j] > pivot) j--;

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, left, j);

        return j; 
    }

   
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

   
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1}; 
        int size = arr.length;

        quickSort(arr, 0, size - 1); 
       
        System.out.println("Array After Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}