import java.util.*;
public class OddEvenNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            for(int i=1;i<=n;i++)
                System.out.println(i+(i%2==0?" is Even":" is Odd"));
        } else System.out.println("Not a natural number");
    }
}
