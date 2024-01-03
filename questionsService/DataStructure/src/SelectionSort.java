public class SelectionSort {
    public static void main(String[] args) {
        int nums[]={8,4,3,6,2,7,9};
        int size=nums.length;
        int temp=0;
        int minIndex=0;

        System.out.println("before sorting");
        for(int num:nums)
        {
            System.out.print(num);
        }


        for(int i=0;i<size-1;i++)
        {
            minIndex=i;
            for (int j = i+1; j < size; j++) {
                if(nums[minIndex]>nums[j])
                {
                    minIndex=j;
                }

            }
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }



        System.out.println("after sorting");
        for(int num:nums)
        {
            System.out.print(num);
        }

    }
}
