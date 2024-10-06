import java.util.*;
class LRnum{

    public static boolean Check(int num){
        String s =num+" ";
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i)))
            return false;
            else
            set.add(s.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count=0;
        for(int i=n1;i<=n2;i++){
            if(Check(i)){
                System.out.print(i+" ");
                count++;
            }

            System.out.println();
            System.out.print(count);
        }
    }
}
