package HashMap;

import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void twoSum(int[]num,int target){
        Map<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<num.length;i++){
            if(hm.containsKey(target-num[i])){
                System.out.printf("%d,%d",num[hm.get(target-num[i])],num[i]);
                return;
            }
            hm.put(num[i],i);
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        int[]num={2,8,4,5,9,7};
        int target=10;
        twoSum(num,target);
    }
}
