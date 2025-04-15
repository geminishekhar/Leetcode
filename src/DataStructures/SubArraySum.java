package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArraySum {

    public static void main(String[] args) {
        int[] MainArray=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        //trap(trapArray);
        //where k is the sub array size..
        int k=3;
        System.out.println(Arrays.toString(MainArray));
        System.out.println(subArray(MainArray,k));

    }

    private static ArrayList<Integer> subArray(int[] mainArray,int k) {
        ArrayList<Integer> subArrayList= new ArrayList<>();
        int initialSum=0;
        for(int i=0;i<k;i++)
        {
            initialSum=initialSum+mainArray[i];
        }
        subArrayList.add(initialSum);
        for(int i=1;i<(mainArray.length-2);i++)
        {
            initialSum=initialSum-mainArray[i-1]+mainArray[i+k-1];
            subArrayList.add(initialSum);

        }
    return subArrayList;
    }
}
