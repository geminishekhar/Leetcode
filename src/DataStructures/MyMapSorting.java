package DataStructures;
import java.util.*;

public class MyMapSorting {
    public static void main(String[] args) {
        Map<Integer,Integer> frequency_map=new HashMap<>();
        List<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        //System.out.println(numbers);
        for(Integer i:numbers)
        {
          frequency_map.put(i,frequency_map.getOrDefault(i,0)+1);
        }
        //System.out.println(frequency_map);
        ArrayList<Map.Entry<Integer,Integer>> mySet=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m: frequency_map.entrySet())
        {
            mySet.add(m);
        }


        class MyComparator implements Comparator<Map.Entry<Integer,Integer>>
        {

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        }
        Collections.sort(mySet,new MyComparator());
        System.out.println(mySet);
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<2;i++)
        {
            result.add(mySet.get(i).getKey());
        }
        System.out.println(result);

    }
}
