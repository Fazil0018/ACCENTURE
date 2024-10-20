import java.util.*;
class passwords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char []ch=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]=str.charAt(i);
        }
        int z=str.length();

        int n=0,cap=0,s=0,q=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(ch[i])) n++;
            if(ch[i]==' '||ch[i]=='/')s++;
            if(Character.isUpperCase(ch[i])) cap++;
            if(Character.isDigit(ch[0]))q++;
        }
        if(z>=4 && n>-1 && cap >=1 && s==0 && q==0)
        {
            System.out.print("true");
        }else{
            System.out.print("false");
        }
        sc.close();
    }
}
