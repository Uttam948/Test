package StreamAPI;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImplementStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Fruit> fruits = new ArrayList<>();
		
		
		
		fruits.add(new Fruit("Mango" , 50 , 20 , "yellow"));
		fruits.add(new Fruit("Apple" , 150 , 100 , "Red"));
		fruits.add(new Fruit("Banana" , 200 , 60 , "yellow"));
		fruits.add(new Fruit("Coconut" , 75 , 20 , "Blue"));
		fruits.add(new Fruit("Cherry" , 250 , 80 , "Red"));
		fruits.add(new Fruit("Papaya" , 150 , 30 , "yellow"));
		fruits.add(new Fruit("Grapes" , 75 , 35 , "Green"));
		fruits.add(new Fruit("Lichi" , 150 , 45 , "white"));
		fruits.add(new Fruit("Orange" , 175 , 60 , "Orange"));
		
	   fruits.stream().filter(p->p.calories > 100)
			   .sorted(Comparator.comparingInt(Fruit :: getCalories).reversed())
			   .forEach( p-> System.out.println(p.name));
	   
	   for(Fruit fu : fruits) {
		   
		   System.out.println(fu.color + "=" + fu.name);
	   }
	   
	   fruits.stream().filter(p->p.color == "Red")
	   .sorted(Comparator.comparingInt(Fruit :: getPrice))
	   .forEach(p-> System.out.println(p.name));
	   
	  
		List<News> news = new ArrayList<>();
		
		news.add(new News(1 , "Amit" , "latest news" , "Train ident"));
		news.add(new News(2 , "Rahul" , "latest news" , "Train Accdent"));
		news.add(new News(2 , "Rahul" , "latest news" , "rainccident"));
		news.add(new News(1 , "Amit" , "latest news" , "Train Acident"));
		news.add(new News(3 , "Uttam" , "latest news" , "Train Acident"));
		news.add(new News(3 , "Uttam" , "latest news" , "Tran Acidnt"));
		news.add(new News(7 , "Aditya" , "latest news" , "Train ccident"));
		news.add(new News(1 , "Amit" , "latest news" , "Tain Accident"));
		news.add(new News(1 , "Amit" , "latest news" , "Tran Acident"));
	
		
		
		List<Trader> traders = new ArrayList<>();
		
		traders.add(new Trader("Amit" , "Kanpur"));
		traders.add(new Trader("Rahul" , "Varanasi"));
		traders.add(new Trader("Kishan" , "Delhi"));
		traders.add(new Trader("Rohan" , "Goa"));
		traders.add(new Trader("Uttam" , "Kolkata"));
		traders.add(new Trader("Sumit" , "Pune"));
		traders.add(new Trader("Aditya" , "Allahabad"));
		traders.add(new Trader("Vikash" , "Noida"));
		traders.add(new Trader("Ajit" , "kanpur"));
		traders.add(new Trader("Vijay" , "kanpur"));
		
		List<Transaction> transactions = new ArrayList<>();
		
		transactions.add(new Transaction(new Trader("Amit" , "Kanpur") , 2015 , 2500));
		
	}

}
