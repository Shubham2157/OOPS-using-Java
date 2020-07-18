package Hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class StrangeGame {

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        int T = Integer.parseInt(name);
        while(T-- > 0){
            String nk[] = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String[] a_arr = br.readLine().split(" ");
            String[] b_arr = br.readLine().split(" ");
            int[] a= new int[n];int[] b= new int[n];
            for(int i = 0;i < n;i++)
            {
                a[i] = Integer.parseInt(a_arr[i]);
                b[i] = Integer.parseInt(b_arr[i]);
            }
            Arrays.sort(b);
            int amax = b[n-1] + 1;
            long time = 0;
            for (int i = 0; i < n; i++) {
                if(a[i] < amax)
                {
                    time = time + ((amax-a[i])*k);
                }

            }
            sb.append(time+"\n");
        }
        System.out.println(sb);

    }
}