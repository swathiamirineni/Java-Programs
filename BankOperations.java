package banking;



import java.util.*;

import java.sql.*;

 class BankOperations implements BankInterface  {
	Scanner sc=new Scanner(System.in);
	
	String s="";
	
	public void startMenu() throws InterruptedException, SQLException, ClassNotFoundException   
	{
	
		System.out.println("Welcome to OUR BANK");
		Thread.sleep(2000);
		System.out.println("");
		System.out.println("1:Existing User");
		Thread.sleep(1000);
		System.out.println("2:New User");
		Thread.sleep(1000);
		System.out.println("3:Exit");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:loginMenu();
		       break;
		case 2:registration();
		       break;
		case 3:System.out.println("Exited");
	           System.exit(0);
		       break;
		default:System.out.println("PLZZZZZ... ENTER PROPER OPTION");
		        Thread.sleep(2000);
		        System.out.println("");
		        startMenu();
                
		}
	}
	
	public void branchMenu() throws InterruptedException, SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=manager");
		
		System.out.println("Enter Branch where U wish to have an Account");
		System.out.println("B01:kukatpally");
		System.out.println("B02:lingampally");
		System.out.println("B03:Ameerpet");
		PreparedStatement ps=con.prepareStatement("insert into customerregistration_tbl values(?,?,?,?,?,?)"); 
		
		ps.setString(1,sc.next() );
		ps.setString(2,sc.next() );
		ps.setString(3,sc.next() );
		ps.setString(4,sc.next() );
		ps.setString(5,sc.next() );
		ps.setString(6,sc.next() );
		ps.executeUpdate();
		String br=sc.next();
		switch(br)
		{
		case "B01":accountTypeMenu();
		           break;
		case "B02":accountTypeMenu();
		           break;
		case "B03":accountTypeMenu(); 
		           break;
		default:menu();
		}
	
		con.close();
	}

	public void accountTypeMenu() throws InterruptedException {
		System.out.println("Enter the Type of Accout to have:");
		System.out.println("1:Saving Type");
		System.out.println("2:Current Type");
		System.out.println("3:Fixed Type");
		System.out.println("4:Recurring Type");
		System.out.println("5:Loan Type");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:transations();
		       break;
		case 2:transations();
	       break;
		case 3:fixedTransation();
	           break;
		case 4:fixedTransation();
	       break;
		case 5:fixedTransation2();
	       break;
	     default:System.out.println("Plz...Enter proper Option");
	             Thread.sleep(2000);
	             accountTypeMenu();
	             
		}
		
		
	}

	public void activityMenu() {
		
		
		
	}
	public void loginMenu() throws ClassNotFoundException, SQLException, InterruptedException{
		System.out.println("Type of login");
		System.out.println("1:Employee");
		System.out.println("2:User");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:login();
		       break;
		case 2:userLogin();
	           break;
	    default:System.out.println("Plz...Enter proper Option");
        Thread.sleep(2000);
        loginMenu();
        
		}
		
	}
	
	public void login() throws ClassNotFoundException, SQLException{
		System.out.println("enter username");
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		System.out.println("enter password");
		String st1=s.nextLine();
		Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=manager");
Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select Designation,UserName,password from employee_tbl");
		
		
		for(int i=1;i<=9;i++)
		{
		while (rs.next()) {
	            String user =rs.getString("UserName");
	            String pass =rs.getString("password");
	            String deg=rs.getString("Designation");
		
		if(st.equals(user)&&st1.equals(pass))
		{ 
			System.out.println("welcome "+user);
		     if(deg.equals("Manager"))
		    	 manager();
		     else if(deg.equals("Cashier"))
		          cashier();
		     else if(deg.equals("Clerk"))
		    	 clerk();
		}
		else
		{
			System.out.println();
			
		}
		}
		
		}
		
		
		
		//System.out.println("enter correct username and password");
		

		
		
	}
	
	public void registration() throws SQLException, ClassNotFoundException, InterruptedException {
		
		
		branchMenu();
		
		
	}
	
	public void transations() {
		
		
	}
	public void menu() throws InterruptedException, ClassNotFoundException, SQLException
	{
		System.out.println("press 1 for Branch option & press 2 for exit");
		int i=sc.nextInt();
		switch(i)
		{
		case 1:branchMenu();
				break;
		case 2:System.exit(0);
				break;
	    default: System.out.println("plz... enter proper option");
	            menu();
	    
		}
	}

	
	public void fixedTransation() {
		
		
	}
	public void fixedTransation2()
	{
	}
	public void manager()
	{
		System.out.println("welcome manager");
	}
	public void cashier()
	{
		System.out.println("cashier");
	}
	public void clerk()
	{
		System.out.println("clerk");
	}
	public void userLogin() throws ClassNotFoundException, SQLException{
		System.out.println("check");
		System.out.println("enter username");
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		System.out.println("enter password");
		String st1=s.nextLine();
		Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=manager");
//System.out.println("connected");
Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select User_Name,password from customerregistration_tbl");
		
		
		for(int i=1;i<=6;i++)
		{
		while (rs.next()) {
	            String user =rs.getString("User_Name");
	            String pass =rs.getString("password");
	            
		if(st.equals(user)&&st1.equals(pass))
		{ 
			System.out.println("welcome "+user);
		}
	}
		
	}
	}
 }
	
	
		
		
	


