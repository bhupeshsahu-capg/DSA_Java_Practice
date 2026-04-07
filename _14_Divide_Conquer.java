public class _14_Divide_Conquer {
    //Printing Function
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }

    //Merge Sorting function
    public static void mergeSort(int arr[], int si, int ei) {
        //Base Case
        if(si >= ei) {
            return;
        }
        int mid = si+ (ei-si) / 2;
        mergeSort(arr, 0, mid); // left
        mergeSort(arr, mid+1, ei); // Right
        merge(arr, si, mid, ei);
    }
    //Merge Function
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left side
        int j = mid+1; //iterator for right side
        int k = 0; //iterator for temp arr

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        //right part
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }


    //Quick Sort function
    

    public static void main(String[] args) {
        //Merge Sort
        int arr[] = {2, 14, 6, 23, 69, -1};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
