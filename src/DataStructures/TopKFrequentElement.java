package DataStructures;

import java.util.*;

public class TopKFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequency_map=new HashMap<>();
        for(int n:nums)
        {
            frequency_map.put(n,frequency_map.getOrDefault(n,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> myMapList=new ArrayList<>(frequency_map.entrySet());
        class MyComaparator implements Comparator<Map.Entry<Integer,Integer>>
        {
            @Override
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2)
            {
                return o2.getValue()-o1.getValue();
            }
        }
        Collections.sort(myMapList,new MyComaparator());
        ArrayList<Integer> result= new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            result.add(myMapList.get(i).getKey());
        }
        int[] finalResult=new int[result.size()];
        for(int j=0;j<result.size();j++)
        {
            finalResult[j]=result.get(j);
        }
        return   finalResult;
    }

    public static void main(String[] args) {
        int[] numbers={1,1,1,2,2,3,4,5};
        int k=2;
         int[] finalResult=topKFrequent(numbers,k);
        System.out.println(Arrays.toString(finalResult));;
    }
}