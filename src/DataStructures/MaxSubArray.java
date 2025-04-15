package DataStructures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArray {
    public static int[] maxSubsequence(int[] nums, int k) {
        int maxSum=0;
        //int currentSum;
        int startMaxPointer=0;
        int endMaxPointer=k;

        for(int i=0;i<k;i++)
        {
            maxSum=maxSum+nums[i];
        }
        int start=1;
        int end=k;
        int currentSum=maxSum;
        while(end<nums.length)
        {
            currentSum= currentSum + nums[end] - nums[start-1];
            if(currentSum>maxSum)
            {
                maxSum=currentSum;
                startMaxPointer=start;
                endMaxPointer=end;
            }
            start++;
            end++;
        }
        List<Integer> resultList=new ArrayList<>();
        for(int i=startMaxPointer;i<=endMaxPointer;i++)
        {
            resultList.add(nums[i]);
        }
        int[] resultArray=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++)
            resultArray[i]=resultList.get(i);

        return resultArray;

    }

    public static void main(String[] args) {
        int[] myArray=new int[]{2,1,3,3};
        System.out.println(Arrays.toString(maxSubsequence(myArray, 2)));

    }
}