class List
{
	private int data;
	private List link;

	public List()
	{
	data=0;
	link=null;
	}

	public List(int newData,List newLink)
	{
	data=newData;
	link=newLink;
	}
	
	public List newNode(int newData,List Node)
	{
	data=newData;
	link=Node;
	}
	public List getLink()
	{
	return link;
	}

	public int getData()
	{
	return data;
	}
}
public class NewList
{
 	public static void main(String [] args)
	{
		List head=new List();
		
		List myNode=new List(10,head);
	
		
	}
}