public class InsertionSort {
    public static void main(String[] args) {
        int[] array={4,6,3,7,2,1};
        int size=array.length;

        System.out.println("printing before the sorting");
        for(int num:array)
        {
            System.out.print(num);
        }

        for (int i = 0; i <size ; i++) {
            int key=array[i];
            int j=i-1;

            while(j>=0 && array[j]>key){

                array[j+1]=array[j];

                j--;
            }
            array[j+1]=key;
        }

        System.out.println();
        System.out.println("printing after the sorting");
        for(int num:array)
        {
            System.out.print(num);
        }
    }
}
