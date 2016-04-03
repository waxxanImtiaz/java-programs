public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimaryTeacher pT=new PrimaryTeacher();
		pT.setId(2);
		pT.display();
		
		
		
	}

}

class Employee
{
	private String name;
	private int id;
	
	public Employee(int id,String name)
	{
		this.name=name;
		this.id=id;
	}
	public Employee()
	{
		
		this(10,"Imtiaz");
	}
	public void setId(int id)
	{
		if(id>=23)
			this.id=id;
			else
				throw new IllegalArgumentException("Id is not valid");
			
		
	}
	public int getId()
	{
		
		return id;
	}
	public void setName(String name)
	{
		
		this.name=name;
	}
	public String getName()
	{
		
		return name;
	}
	public void display()
	{
		
		System.out.println("Dislay in Employee class");
		System.out.println("name:"+name+" id:"+id);
	}
	public String toString()
	{
		
		System.out.println("toString In empolyee class");
		return "name:"+name+",id:"+id;
	}
	
}//end of Employee class

class Teacher extends Employee
{
	protected String qual;
	
	public Teacher()
	{
		qual=" Primary Teacher";
	}
	public Teacher(int id,String name,String qual)
	{
		super(id,name);
		this.qual=qual;
	}
	public	Teacher(String qual)
	{
		
		super();
		this.qual=qual;
	}
	
	public void display()
	{
		
		//super.display();
		System.out.println("display in Teacher class ");
		
		System.out.println(" qualification:"+qual);
	}
	
	public String toString()
	{
		
		System.out.println("toString in Teacher class:");
		return " qualification:"+qual;
	}
	
}//end of Teacher class.

class PrimaryTeacher extends Teacher
{
	   protected int age;
	   protected String dateOfBirth;
	   private int id;
	   public PrimaryTeacher(int age, String dateOfBirth)
	   {
		  
		   this.age=age;
		   this.dateOfBirth=dateOfBirth;
		   this.id=super.getId();
		  
		   }
	   
	   public PrimaryTeacher()
	   {
		   
		   this(22,"Arshad");
		   
		  
	   }
	   
	   public void setAge(int age)
	   {
		   
		   this.age=age;
	   }
	   public int getAge()
	   {
		   return age;
	   }
	   
	   public void dateOfBirth(String dateOfBirth)
	   {
		   this.dateOfBirth=dateOfBirth;
		   
	   }
	
	   public void setId(int id)
	   {
		   
		  
			if(id>=20)
				this.id=id;
		   	else
		   		throw new IllegalArgumentException("Id is not valid");
		   	
	   }
	  
	   public int getId()
	   {
		   
		   return id;
	   }
	   
	   
	   public void display()
	   {
		   
		  //super.display();
		   System.out.println("display in PrimaryTeacher class:");
		   System.out.printf("date of birth:%s\n age:%d\nid:%d\n",dateOfBirth,age,id);
	   }
	   
	   public String toString()
	   {
		   System.out.println("toString in PrimaryTeacher class:");
		   
		   return "date of Birth:"+dateOfBirth+" id:"+id+" age:"+age;
	   }
}//end of PrimaryTeacher class..