import java.util.Scanner;

public class Practice2 {

    public static void main(String agr[]){

        long a = 0,b= 1,c=0;
        int j= 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(j<n)
        {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;

            j++;
        }
    }
}
