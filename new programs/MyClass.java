public class MyClass
{
  public static void main(String[] args)
	{
	String name[]={"IMTIAZ ALI","imtiaz ali"};
	String temp;
	char get;
	temp=name[0].toLowerCase();
	System.out.println(temp);	
	temp=name[0].toUpperCase();
	System.out.println(temp);

	get=name[0].charAt(0);
	
	System.out.println(get);
	
	temp=name[0].substring(1,7);

	System.out.println(temp);	
	boolean flag;
	
	flag=name[0].equals(name[1]);

	System.out.println(flag);
	
	flag=name[0].equalsIgnoreCase(name[1]);	
	
	System.out.println(flag);	
	int index;
	index=name[0].indexOf("Wassan");
	System.out.println(index);
	
	index=name[1].compareTo(name[0]);

	System.out.println(index);
	}
}