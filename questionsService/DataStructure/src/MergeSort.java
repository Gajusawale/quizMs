public class MergeSort {

    private static void mergeSort(int[] arr,int l,int r) {

        if(l<r) {
            int mid = (l+r) / 2;


            // Recursively sort the left and right halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr,int l,int mid,int r) {

        int n1=mid-l+1;
        int n2=r-mid;

        int[] lArr=new int[n1];
        int[] rArr=new int [n2];

        // Split the array into left and right halves
//        System.arraycopy(arr, 0, left, 0, mid);
//        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        for(int i=0;i<n1;i++){
            lArr[i]=arr[l+i];
        }

        for(int i=0;i<n2;i++){
            rArr[i]=arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2)
        {
            if(lArr[i]<=rArr[j]) {
                arr[k] = lArr[i];
                i++;
            }
            else {
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }

        while (i<n1)
        {
            arr[k]=lArr[i];
            i++;
            k++;
        }
        while (j<n2)
        {
            arr[k]= rArr[j];
            j++;
            k++;

        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,2,6,7,1};

        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        mergeSort(arr,0,arr.length-1);


        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }


}
