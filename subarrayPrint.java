package HashMap;

import java.util.*;

public class subarrayPrint {
    private static <k,v>void insert(Map<k, List<v>> hm, k key, v value){
        // if the key is seen for the first time, initialize the list
hm.putIfAbsent(key,new ArrayList<>());
hm.get(key).add(value);
    }
    public static void subArrayPrint(int[]nums){
        Map<Integer,List<Integer>>hm=new HashMap<>();
        insert(hm,0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum)){
                List<Integer>list=hm.get(sum);
                for(Integer j:list){
System.out.println((j+1)+" "+i);
                }
            }
            insert(hm,sum,i);
        }
    }
    public static void main(String[] args) {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        subArrayPrint(nums);
    }
}
