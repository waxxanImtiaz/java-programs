import java.util.ArrayList;
public class TestEmployee
{
		public static void main(String [] args)
		{
				NadraOfficer n = new NadraOfficer();
				n.getInput();
				n.printData();
		}
}

 abstract class Employee implements Payable
{
	private String name;
	private String socialSecurityNumber;
	public Employee()
	{
		name=null;
		socialSecurityNumber=null;
	}
	public Employee(String n,String ssn)
	{
	 name=n;
	 socialSecurityNumber=ssn;
	}
	
	public String getData()
	{
		return String.format("Name:%s\nSocial Security Number:%s",name,socialSecurityNumber);
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setSsn(String ssn)
	{
	  socialSecurityNumber=ssn;
	}
	@Override
	public String toString()
	{
	  return getData();
	}
	public String getName()
	{
	 return name;
	}
	public String getSsn()
	{
	  return socialSecurityNumber;
	}
	
}

class Teacher extends Employee
{
   private double sallry;
   
   public Teacher()
   {
	   
   }
   public Teacher( String n,String ssn,double s)
   {
      super(n,ssn);
	  sallry=s;
   }
   public void setSallry(double s)
   {
       sallry=s;
   }
   public double getSallry()
   {
	return sallry;
   }
   @Override
   public void setName(String n)
   {
     super.setName(n);
   }
   public String getName()
   {
		return super.getName();
   }
   @Override
   public void setSsn(String ssn)
   {
		super.setSsn(ssn);
   }
   @Override
   public String getSsn()
   {
		return super.getSsn();
   }
   @Override
   public double earnings()
   {
		return getSallry()*10;
   }
   @Override
   public String toString()
   {
		return String.format("%s\nSallry:%.2f",super.toString(),getSallry());
   }
}
class SalesMan extends Employee
{
	
	private int id;
	private double e;
	public SalesMan()
	{
		
	}
	public SalesMan(String name,String ssn,double e,int id)
	{
		super(name,ssn);
		this.id=id;
		this.e=e;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
			return id;
	}
	@Override
	public String getName()
	{
		return super.getName();
	}
	@Override
	public void setName(String name)
	{
		super.setName(name);
	}
	
	@Override
	public void setSsn(String ssn)
	{
	  super.setSsn(ssn);
	}
	@Override
	public String getSsn()
	{
	  return super.getSsn();
	}
	@Override
	public double earnings()
	{
		
		return e*10;
	}
	@Override
	public String toString()
	{
		
		return String.format("%s\nid:%d\nEarning:%.2f",super.toString(),id,earnings());
	}
	
}

class NadraOfficer extends Employee
{
	
	private ArrayList<String>data=new ArrayList<String>();
	private String name;
	private String cast;
	public void NadraOfficer()
	{
		data=null;
		name=null;
		cast=null;
	}
	
	public void getInput()
	{
		boolean b=true;
		
		while(b)
		{
			
		System.out.println("Enter your cast:");
		cast=MyScanner.Input.nextLine();
		data.add(cast);
		System.out.println("Enter your name:");
		name=MyScanner.Input.nextLine();
		data.add(name);
		
		System.out.println("Do you want to continue? press t or f");
		b=MyScanner.Input.nextBoolean();
		}
	}	
	public void printData()
	{
		
		for(int i=0,j=1; i<data.size()-1; i++,j++)
			System.out.printf("\nName:%s\nCast:%s",data.get(i),data.get(j));
	}
	@Override
	public double earnings()
	{
	 return 2.33;	
	}
	
}
