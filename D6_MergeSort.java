public class D6_MergeSort {
    void sort(int []a, int start, int mid, int end){
        int k = 0;
        int size = (end - start);
        int i = start;
        int j = mid;
        int []temp = new int[size];
        while (i<mid && j<end) {
              if(a[i] < a[j]){
                temp[k++] = a[j++];
              }
              else{
                temp[k++] = a[j++];
              }
        }
        for( i= start; i<end; i++){
            a[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr [] = {3, 6, 5, 7, 9, 8, 4, 0};
        System.out.println("Sorted array:");
        for(int num : arr){
            System.out.println(num + " ");
        }
    


    }
    
}
