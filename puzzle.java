import java.util.*;
public class puzzle
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a = 0;
        System.out.println("puzzle in are:");
        for(int i=1;i<=6;i++){
            for(int j=1;i<=6;j++){
                if(i+j==n){
                    System.out.println(i + " " + j);
                    a++;
                }
            }

        }
        System.out.println("Number of puzzle" + a );
        sc.close();
    }
}
