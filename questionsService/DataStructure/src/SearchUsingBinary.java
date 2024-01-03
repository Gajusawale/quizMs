public class SearchUsingBinary {
    public static void main(String[] args) {

        int nums[]=new int[10000];

        int target=6;

        int result=linearSearch(nums,target);

        int result2=binarySearch(nums,target);
        if(result2!=-1)
        {
            System.out.println("the  of value is : "+ result2);
        }

    }

    private static int linearSearch(int[] nums, int target) {

        int steps=0;
        for(int i=0;i<nums.length;i++)
        {
            steps++;
            if(nums[i]==target) {
                System.out.println(steps);
                return i;
            }
        }

        System.out.println(steps);
        return -1;
    }

    private static int binarySearch(int[] nums,int target)
    {

        int start=0;
        int end=nums.length-1;

        int steps=0;
        while(start<=end)
        {
            steps++;
            int mid=(start+end)/2;

            if(nums[mid]==target) {

                System.out.println(steps);
                return mid;
            }

            else if(nums[mid]<target)
                start=mid+1;

            else
                end=mid-1;
        }

        System.out.println(steps);
        return -1;
    }

}
