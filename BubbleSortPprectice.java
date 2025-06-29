public class BubbleSortPprectice {
    // public static void main(String[] args){
    //     int [] numbers = {56, 21, 75, 2, 85, 90, 65, 66, 3, 3};
    //     int size = numbers.length;
    //     System.out.println("Before bubble sort\n");
    //     for( int i=0; i<size; i++) {
    //         System.out.println(numbers[i] + "");
    //     }
        
    //     //For Bubble Sorting
    //     for(int i=0; i<size; i++){
    //         for(int j=0; j<size-i-1; j++){
    //             if(numbers[j] > numbers[j+1]){
    //                 int temp = numbers[j+1];
    //                 numbers[j+1] = numbers[j];
    //                 numbers[j] = temp;

    //             }
                
    //         }
    //     }
    //     System.out.println();
    //     System.out.println("After Bubble Sort");
    //     System.out.println();
    //     for(int i=0; i<size; i++){
    //         System.out.println(numbers[i] + "");
    //     }
    // }

//..................................................................
// public static void main(String[] args) {
//     int [] numbers = {54, 33, 65, 1, 34, 66, 100, 54, 32, 7};
//     int size = numbers.length;
//     System.out.println("before sorting\n");
//     for(int i = 0; i < size; i++){
//         System.out.println(numbers[i]);
//     }
//     //for Bubble sort logic
//     for(int i=0; i<size; i++){
//         for(int j=0; j<size-i-1; j++){
//             if(numbers[j] > numbers[j+1]){
//                 int temp = numbers[j+1];
//                 numbers[j+1] = numbers[j];
//                 numbers[j] = temp;
//             }

//         }
//     }
//     System.out.println();
//     System.out.println("After sorting");
//     System.out.println();
//     for(int i=0; i<size; i++){
//         System.out.println(numbers[i] + "");
//     }


// }
// }
public static void main(String[] args) {
    int arr[] = {2, 5, 7, 3, 9, 1};
    int size = arr.length;
    for(int i=0; i<size; i++){
        for(int j=0; j<size-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
            
        }
    }
    for(int i=0; i<size; i++){
        System.out.println(arr[i]);
    }
}

}