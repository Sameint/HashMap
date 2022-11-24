package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class removeMin {
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }
        return arr;
    }

    public static void removeMinEle(int[] arr, int n, int m) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = arr[i];
        Arrays.sort(arr);
        a = reverse(a);
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < m; i++) {
            hm.put(arr[i], 1);
        }
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {99, 56, 50, 93, 47, 36, 65, 25, 87, 16};
        int k = 2;
        int n = arr.length;
//        int cnt=0;
//        cnt+=arr[i];
        removeMinEle(arr, n, k);
        }
    }

