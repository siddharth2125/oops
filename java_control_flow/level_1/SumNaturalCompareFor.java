import java.util.*;
public class SumNaturalCompareFor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            int sumFormula=n*(n+1)/2, sumLoop=0;
            for(int i=1;i<=n;i++) sumLoop+=i;
            System.out.println("Formula sum = "+sumFormula);
            System.out.println("For loop sum = "+sumLoop);
        } else System.out.println("Not a natural number");
    }
}
