public class QuickSort {

    public static void main(String[] args) {
        int[] arr={23,1,3,5,3,5,3,566,6,34};
        int length=arr.length-1;
        quickSort(arr,0,length);

        for(int num:arr)
        {
            System.out.println(num);
        }
    }

    private static void quickSort(int[] arr, int low, int high) {

        int pi=partition(arr,low,high);
        if(low<high)
        {
            quickSort(arr,low,pi-1);

            quickSort(arr,pi+1,high);
        }

    }

    private static int partition(int[] arr, int low, int high) {

        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                if (arr[j] <= pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }

        }

        swap(arr, i + 1, high);

        return i+1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
