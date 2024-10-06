import java.util.*;
public class strnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n.length();i++)
        {
            if(Character.isDigit(n.charAt(i)))
            sb.append(n.charAt(i));
        else{
            if(!sb.isEmpty()){
                System.out.println(sb.toString());
                sb.delete(0,sb.length());
            }
        }
    }
    if(!sb.isEmpty());
    System.out.println(sb.toString());
}
}
