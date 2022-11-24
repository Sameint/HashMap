package HashMap;

import java.util.HashSet;
import java.util.Set;

public class subArrayWith0Sum {
    public static boolean subArray(int[]num){
        Set<Integer> hs=new HashSet<>();
        hs.add(0);
        int sum=0;
        for(int i:num){
         sum+=i;
            if(hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = { 4, -6, 3, -1, 4, 2, 7 };
        if(subArray(nums)){
            System.out.print("sub array present");
        }else{
            System.out.print("not present");
        }
    }
}
