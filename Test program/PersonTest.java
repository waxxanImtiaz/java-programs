import pack2.Person;
import java.util.Scanner;
public class PersonTest
{
	public static Scanner input = new  Scanner( System.in ); 
	public static void main( String[] args )
	{
		
		/*
		OfficeGuard[] officeGuard = new OfficeGuard[ 2 ];
		
		
		for( int i = 0; i<2; i++ )
		{
		System.out.println( "\n\nEnter data of Guard:"+(i+1) );
		officeGuard[ i ] = new OfficeGuard();
		
		System.out.println( "Enter Name:" );
		officeGuard[ i ].setName( input.nextLine() );
		///input.next();
		System.out.println( "Enter Cast:" );
		officeGuard[ i ].setCast( input.nextLine() );
		//input.next();
		System.out.println( "Enter salary:" );
		officeGuard[ i ].setSalary( input.nextDouble() );
		input.nextLine();
		System.out.println( "Enter education:" );
		officeGuard[ i ].setEducation( input.nextLine() );
		
		System.out.println( "Enter shift:" );
		officeGuard[ i ].setShift( input.nextLine() );
		}
		
		for(  int i = 0; i<2; i++ )
		{
		System.out.println( "\nData of Guard "+(i+1) );
		System.out.println( officeGuard[i] );
		}*/
		
		Person p = new Person();
		p.name = "kamran";
		p.cast = "Jatoi";
		//p.setName( "Kamran" );
		//p.setCast( "Jatoi" );
		System.out.println( p );
	}
}