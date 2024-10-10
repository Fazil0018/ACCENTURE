import java.util.*;
class common{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] arr = new int[n];
        int[] arrs = new int[a];
        for(int i=0; i<n; i++){
            for(int j=0; j<a; j++){
                if(n == j){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }

            } 
        }       
    }
}
