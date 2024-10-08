import java.util.*;
class chocolat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        int y = sc .nextInt();
        Arrays.sort(arr);
        for(int i=0;i<y;i++)
        {
            sum=sum+arr[i];
        }
        if(y<0 || y>n)
        System.out.println(-1);
        else
        System.out.print(sum);
    }

}
