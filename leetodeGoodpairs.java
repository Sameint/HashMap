package HashMap;

public class leetodeGoodpairs {

    public static void main(String[] args) {
        int[] num = {1,1,1,1};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] == num[j] && i < j) {
                    sum++;
                }
            }
        }
        System.out.print(sum);
    }
}

