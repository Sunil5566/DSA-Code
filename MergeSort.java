
    public class MergeSort {
   
        static void sort(int[]a, int start,int mid,int end){
            int k = 0;
            int size = end -start;
            int i = start;
            int j = mid;
            int [] temp = new int[size];
            while (i < mid && j < end){
                if(a[i]<a[j]){
                    temp[k++] = a[i++];
                }
                else {
                    temp [k++] = a[j++];
                }
            }
            while(i < mid){
                temp[k++] = a[i++];
            }
            while(j < end){
                temp[k++] = a[j++];
            }
            for(i = start;i < end;i++){
                a[i] = temp[i];
            }
            for(i = 0;i < end;i++){
                System.out.print ("  "+ a[i]);
            }
        }
    
        public static void main(String[] args) {
            int a [] = {15, 11, 13, 45, 25, 35, 35, 15, 43};
            int start = 0;
            int mid = a.length/2;
            int end = a.length;
            sort(a,start,mid,end);
    }
    }
    

