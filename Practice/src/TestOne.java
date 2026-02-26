import java.util.ArrayList;
import java.util.List;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Integer> list1 = new ArrayList<>();
        list1 = list;
        
         System.out.println(list1);

	}

}
