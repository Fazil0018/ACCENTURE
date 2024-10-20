import java.util.*;
public class sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]hash = new int[200];
        for(int i=0;i<n;i++)
        {
            hash[sc.nextInt()]++;
        }
        int res=0;
        for(int f:hash)
        {
            res+=f/2;
        }
        System.out.print(res);
    }
}
