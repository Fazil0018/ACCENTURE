import java.util.*;
public class factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        System.out.print(count(s));
    }
    public static int count(int n)
    {
        if(n<5)
        return 0;
        int sum=0;
        while(n>=5)
        {
            sum=sum+n/5;
            n=n/5;
        }
        return sum;
    }


}
