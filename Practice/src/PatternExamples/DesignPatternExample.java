package PatternExamples;

import java.util.ArrayList;
import java.util.List;

interface FileSystem{
	
	public void ls();
}

class File implements FileSystem{

	@Override
	public void ls() {
		System.out.println("Here is your file");
	}
	
}

class Director implements FileSystem{
    
	List<FileSystem> file = new ArrayList<>();
	
	public void add(FileSystem fileSystem) {
		file.add(fileSystem);
	}
	
	@Override
	public void ls() {
		// TODO Auto-generated method stub
		for(FileSystem i : file) {
			i.ls();
		}
		
	}
	
}

public class DesignPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
