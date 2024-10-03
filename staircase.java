import java.util.*;
public class staircase
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int j=0;
        int h=0,ways=1;
        for(int i=0;i<n;i++){
            j=ways;
            ways=h+ways;
            h=j;
        }
        System.out.print(ways);
    }
}
