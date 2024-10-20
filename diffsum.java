import java.util.*;
public class diffanceofsum{

    public static int diffanceofsum(int n ,int m)
    {
        int n1 = 0;
        int m1 = 0;

        for(int i=0;i<=m;i++)
        {
            if(i%n == 0)
            {
                n1 += i;
            }else{
                m1 += i;
            }
        }
        return m1-n1;
    }
    public static void main(String[] args){
        Scanner  ob=new Scanner(System.in);

        int n=ob.nextInt();

        int m=ob.nextInt();

        int res = diffanceofsum(n, m);
        System.out.print(res);

    }
}
