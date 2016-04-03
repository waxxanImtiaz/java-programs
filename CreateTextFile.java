import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile
{
		private Formatter output;
		
		public void openFile()
		{
			try
			{
				output = new Formatter( "clients.txt" );
			}
			catch(  )
		}
}