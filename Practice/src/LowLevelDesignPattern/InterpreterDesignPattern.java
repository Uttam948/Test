package LowLevelDesignPattern;

import java.util.HashMap;
import java.util.Map;

class Context{
	
	Map<String , Integer> map = new HashMap<>();
	
	public void put(String str , int i) {
		
		map.put(str, i);
	}
	
	public int get(String str) {
		
		return map.get(str);
	}
	
}

interface AbstractExpression{
	
	int interpret(Context context);
}


class NormalTerminal implements AbstractExpression{
	
	String str1 ;
	
	NormalTerminal(String str2){
		this.str1 = str2;
	}
	
	
	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return context.get(str1);
	}
	
}
class MultipleTerminal implements AbstractExpression{

	AbstractExpression leftAbstractExpression;
	AbstractExpression rightAbstractExpression;
	
	MultipleTerminal(AbstractExpression leftAbstractExpression ,AbstractExpression rightAbstractExpression ){
		this.leftAbstractExpression = leftAbstractExpression;
		this.rightAbstractExpression = rightAbstractExpression;
				
	}
	
	
	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return leftAbstractExpression.interpret(context) * rightAbstractExpression.interpret(context);
	}
	
}

public class InterpreterDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context con = new Context();
		con.put("a", 3);
		con.put("b", 4);
	}

}
