import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

    public static void main(String agr[]) {

        String st = "He is a very very good boy, isn't he?";
        String[] st1 = st.split(" ");
     //   String[] st2 = new String[st1.length+1];
       int n = st1.length;
        for(int i=0 ;i< st1.length ; i++ )
        {
            for(int j = 0 ; j<st1[i].length() ;j++)
                if(st1[i].charAt(j) == '\'')
                {
                    n++;
                }
                    st1[i] = st1[i].replace("\'","\n");
                    st1[i] = st1[i].replace(",","");
                    st1[i] = st1[i].replace(".","");
                    st1[i] = st1[i].replace("!","");
                    st1[i] = st1[i].replace("@","");
                    st1[i] = st1[i].replace("?","");
                    st1[i] = st1[i].replace("_","");
            }

        System.out.println(n);
        for(int i=0;i< st1.length;i++)
        {
            System.out.println(st1[i]);
        }
    }
}
