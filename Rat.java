import java.util.*;
public class Rat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int[] a = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum +=a[i];
        }
        int val = r*unit;
        int j=0;
        if(n <= 0)
            System.out.println("-1");
        else if(val > sum){
            System.out.println("0");
        }else{
            while (val > 0){
                val -= a[j];
                j++;
            }
            System.out.print(j);
        }
    }
}
