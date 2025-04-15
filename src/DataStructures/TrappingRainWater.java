package DataStructures;
import java.util.Arrays;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];
        int current_left_max=height[0];
        int current_right_max=height[height.length-1];
        leftMax[0]=height[0];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++)
        {
            if(height[i-1]>current_left_max)
                current_left_max=height[i-1];
            leftMax[i]=current_left_max;
        }
        System.out.println(Arrays.toString(leftMax));
        for(int i=height.length-2;i>=0;i--)
        {
            if(height[i+1]>current_right_max)
                current_right_max=height[i+1];
            rightMax[i]=current_right_max;
        }
        System.out.println(Arrays.toString(rightMax));
        int trapped_water_sum=0;
        for(int i=1;i<height.length-1;i++)
        {
            int minimum=Math.min(leftMax[i],rightMax[i]);
            trapped_water_sum=trapped_water_sum+minimum-height[i];

        }
        return  trapped_water_sum;
    }

    public static void main(String[] args) {
        int[] trapArray=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        //trap(trapArray);
        System.out.println( trap(trapArray));

    }
}
