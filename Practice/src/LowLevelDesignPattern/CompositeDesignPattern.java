package LowLevelDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface FileSystem{
	
	public void ls();
	
}

class File implements FileSystem{

	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println("This is your File");
	}
	
}

class FileDirectory implements FileSystem{
	
	
	List<FileSystem> list = new ArrayList<>();

	public void add(FileSystem fs) {
		list.add(fs);
	}
	@Override
	public void ls() {
		// TODO Auto-generated method stub
		for(FileSystem file : list) {
			file.ls();
		}
	}
	
}

public class CompositeDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
