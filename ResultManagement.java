
class ResultManagement extends JFrame
{
	
	private JComboBox list;
	private JPanel fieldPanel,labelPanel,mainPanel;
	private JLabel batch,rollNumber;
	private JTextField jtfBatch,jtfRollNumber;
	private String[] departments = { "Department","Computer System Engineering","Electronics","Chemical" };
	private String[] semester = { "Semester","1st","2nd","3rd","4th","5th","6th","7th","8th" };
	private JComboBox semComboBox;
	private  JButton next;
	private int departSelected = 0 ;
	private String batchEntered = null;
	private String rollNumEntered = null;
	private int semSelected = 0;
	static String query = "select*from firstSemester_cs13" ;
	private ResultSetTableModel tableModel;
	private JScrollPane scroll;
	String deprt,sem,batchName,tableNameStudentTable;
	private ResultSetTableModel myTableModel = new ResultSetTableModel(); 
	private String semesterSelect;
	//constructor definition....
	public ResultManagement( )
	{
		setSize( 600,600 );
		setLayout( null  );
		setTitle( "Rusult Management" );
		
		//createConnection();
		
		list = new JComboBox( departments );
		list.setMaximumRowCount( 5 );
	
		labelPanel = new JPanel();
		labelPanel.setLayout(new GridLayout( 2,2,5,5 ));
		
		mainPanel = new JPanel();
		next = new JButton( "Next" );
		
		labelPanel.add( new JLabel( "Batch" ) );
		labelPanel.add( jtfBatch = new JTextField( "" ) );
		
		labelPanel.add( new JLabel( "Roll number" ) );
		labelPanel.add( jtfRollNumber = new JTextField( "" )  );
		
		
		
		
		
		semComboBox = new JComboBox( semester );
		add( semComboBox );
		add( list);
		add( labelPanel );
		add( next );
		next.setBounds( 30,200,90,30 );
		list.setBounds(30, 60, 200, 30);
		labelPanel.setBounds(30, 140, 200, 50);
		semComboBox.setBounds( 30,100,200,30 );
		
		semComboBox.setBackground(Color.WHITE);
		list.setBackground( Color.WHITE );
		getContentPane().setBackground( new Color( 230,200,230 ) );
		
		
		setResizable( false );
		
		
		
		list.addItemListener( new ItemListener(){
			public void itemStateChanged( ItemEvent e )
			{
				if( e.getStateChange() == e.SELECTED )
				{
					departSelected = list.getSelectedIndex();
					
				}
			}
		} );
		
		semComboBox.addItemListener( new ItemListener(){
		public void itemStateChanged( ItemEvent e )
		{
			if( e.getStateChange() == e.SELECTED )
			{
				semSelected = semComboBox.getSelectedIndex();
				semesterSelect = (String)semComboBox.getSelectedItem();
			}
		}
		} );
		
		
		   
		
		
		
		next.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				
				
			   	if( (semSelected == 0)||( departSelected == 0 )||(jtfBatch.getText().equals( "" ) )||(jtfRollNumber.getText().equals( "" ) ))
				{
					JOptionPane.showMessageDialog(null,"Please fill empty fields and choose Department and Semester from lists", " Information message ",JOptionPane.INFORMATION_MESSAGE);
				}
			   	else
			   	{
			   		batchEntered = jtfBatch.getText();
					rollNumEntered = jtfRollNumber.getText();
					
					deprt = myTableModel.executeQuery( "Select departName from departments where did="+departSelected,"departName" );
					
					batchName = myTableModel.executeQuery("Select batchName from "+deprt+" where bid =  "+batchEntered, "batchName");
				
					if( batchName.equals( " " ) )
					{
						JOptionPane.showMessageDialog(null, "Batch not found","Information",JOptionPane.INFORMATION_MESSAGE);
						
					}
					else
					{
						String checkRollNumber = myTableModel.executeQuery("select rollNumber from "+batchName+" where rollNumber = "+rollNumEntered , "rollNumber");
						
						if( checkRollNumber.equals(" ") )
							JOptionPane.showMessageDialog(null, "Roll number not found","Information",JOptionPane.INFORMATION_MESSAGE);
							else{
								tableNameStudentTable = myTableModel.executeQuery( "Select tableName from "+batchName+" where rollNumber="+rollNumEntered,"tableName" );
	
								String tableNameJoinTable,name = "";
					
								tableNameJoinTable = myTableModel.executeQuery("select tableName from "+tableNameStudentTable+" where semid= "+semSelected,"tableName" );
								
								String firstName,lastName;
								
								firstName = myTableModel.executeQuery("select firstName from "+batchName+" where rollNumber = "+rollNumEntered, "firstName");
								
								lastName = myTableModel.executeQuery("select lastName from "+batchName+" where rollNumber = "+rollNumEntered, "lastName");
								
								addLabels( rollNumEntered,semesterSelect,firstName,lastName,myTableModel.executeQuery("select fatherName from "+batchName+" where rollNumber = "+rollNumEntered, "fathername") );
								
								
							
								
								String n =  myTableModel.executeQuery("select subtable from departsubandsem where did = "+departSelected,"subtable");
								//myTableModel.myTable(  );
								
								
								query = " select s.subname,s.creditHours,s.totalMarks,f.obtainedmarks,f.subject_gpa from "+ n +" as s inner join "+ tableNameJoinTable +" as f on s.subid = f.subid and f.rollNumber ="+rollNumEntered;
								
								//System.out.println( query );
								//createConnection();
								addTable(  );
								}//end of inner else..
					}//end of outer else
					 
			   	}//end  of outer most else
			   	
			    
			   	
		}});
		
		
		
	}// end of constructor... 
	
	public void addLabels( String rollNumEntered,String semesterSelect,String firstName,String lastName,String fatherName )
	{
		JLabel name = new JLabel( "Name: "+firstName+" "+lastName );  
		JLabel fname = new JLabel( "Father Name: "+fatherName);
		JLabel rollnum = new JLabel( "Roll Number: "+rollNumEntered );
		JLabel sems = new JLabel( "Semester: "+semesterSelect );
		JLabel labl = new JLabel( "Result of "+semesterSelect+ " Semester." );
		
		name.setFont( new Font( "Arial",Font.BOLD,15 ) );
		fname.setFont( new Font( "Arial",Font.BOLD,15 ) );
		rollnum.setFont( new Font( "Arial",Font.BOLD,15 ) );
		sems.setFont( new Font( "Arial",Font.BOLD,15 ) );
		labl.setFont( new Font( "Arial",Font.BOLD,20 ) );
		
		add( name  );
		add( fname );
		add( rollnum );
		add( sems );
		add( labl );
		
		name.setBounds( 30,200,400,100 );
		fname.setBounds( 30,230,400,100 );
		rollnum.setBounds( 30,260,400,100 );
		sems.setBounds( 30,290,400,100 );
		labl.setBounds( 30,320,400,100 );
		
	}//end of addLabels method......
	
	public void createConnection()
	{
			try{
				tableModel = new ResultSetTableModel(query);
				//System.out.println( query );
				
			}catch( SQLException x )
			{
				JOptionPane.showMessageDialog(null,x.getMessage(),"Database error",JOptionPane.ERROR_MESSAGE);
				tableModel.disconnectFromDatabase();
				System.exit( 1 );
			}
	}//end of createConnection method..
	
	
	
	public String addTable(  )
	{
	
		
			
			myTableModel.setQuery(query);
			JTable resultTable = new JTable( myTableModel );
		
			scroll = new JScrollPane( resultTable );
			scroll.setBounds( 30,400,500,150 );
			
			add( scroll );
			validate();
			revalidate();
			
		
		return "";
	}
	
}
