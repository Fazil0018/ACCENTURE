import java.util.*;
class rowcols{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int[][] num = new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++)
                num[i][j]=sc.nextInt();
        }
        int key = sc.nextInt();
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
            if(num[i][j]==key){
                System.out.print(i+",");
                System.out.print(j);
                count=1;
                break;
            }
    }
}
if(count==0)
System.out.println("Not found");
    }
}
