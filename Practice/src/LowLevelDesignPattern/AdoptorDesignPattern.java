package LowLevelDesignPattern;

interface Pound{
	
	 public int pweight();
	
	}

class GetPound implements Pound{

	@Override
	public int pweight() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}

interface Kilogram{
	
	public double kweight();
	
}
class Convert implements Kilogram{
	
	int i = 0;
	
	Convert(Pound pound){
		i = pound.pweight();
	}
	
	@Override
	public double kweight() {
		// TODO Auto-generated method stub
		double d = i*0.45;
		return d;
	}

	
	
}

public class AdoptorDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kilogram convert = new Convert(new GetPound());
		System.out.println(convert.kweight());
		
		
	}

}
