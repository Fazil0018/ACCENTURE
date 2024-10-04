import java.util.*;
public class diff
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int dif=sc.nextInt();
        int n=sc.nextInt();
        int[] a =new int[dif];
        int count = 0;
        for (int i = 0; i < dif; i++) {
            a[i]= sc.nextInt();
            int val = Math.abs(a[i]-num);
            if(val < dif)
            count++;
    }
    System.out.println(count==0?-1:count);
}
}
