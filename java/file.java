package java2;

abstract class Persistence
{
	abstract public void persist();
}
class FilePersistence extends Persistence
{
	public void persist()
	{
		System.out.println("Data is saved in File");
		
	}
	
}

class DatabasePersistence extends Persistence
{
     public void persist() 
     {
    	 System.out.println("Data is saved in Database");
		
	}
	
}

public class file
{
	public static void main(String[] args)
	{
		Persistence obj1 = new FilePersistence();
		Persistence obj2 = new DatabasePersistence();
		obj1.persist();
		obj2.persist();
	}
}