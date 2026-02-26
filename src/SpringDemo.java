import java.util.Scanner;

public class SpringDemo {

    public static void main(String agr[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char c = 65 , c1 = 122 ;

        int k = 3,n=0;
        String sub[] = new String[st.length()];
        for (char i = c; i <= c1; i++) {
            for (int j = 0; j < st.length() - 2; j++) {
                   if(st.charAt(j) == i)
                   {
                       sub[n]=st.substring(j,j+k);
                       n++;
                   }
            }
        }

            System.out.print(sub[0]+" "+sub[st.length()-3]);

    }
}
