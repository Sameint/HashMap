package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class nonRepeatingChar {

    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //String s=sc.nextLine();
        String s="newtonschool";
        HashMap<Character,Integer> hs=new HashMap<>();//   creat Hashmap to check KEY and VALUE
        for(int i=0;i<s.length();i++){     //iterate value 0 to n-1
            if(hs.get(s.charAt(i))!=null){  // check if charater!=0
hs.put(s.charAt(i),hs.get(s.charAt(i))+1);  // if charater ==1
            }else{
                hs.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(hs.get(s.charAt(i))==1){
             System.out.print(i);
             break;
            }else{
if(i==s.length()-1){
    System.out.print("-1");
}
            }
        }
    }
}
