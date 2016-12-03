package kbr.banking;

import java.util.*;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

 class BankOperations implements BankInterface  {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s="insert into CustemerRegistration_tbl values(?,?,?,?,?)";
	
	public void startMenu() throws InterruptedException, SQLException, ClassNotFoundException   
	{
	
		System.out.println("Welcome to OUR BANK");
		System.out.println("1:Existing User");
		System.out.println("2:New User");
		System.out.println("3:Exit");
		
		switch(n)
		{
		case 1:login();
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
	
	public void branchMenu() throws InterruptedException {
		System.out.println("Enter Branch where U wish to have an Account");
		System.out.println("1:kukatpally");
		System.out.println("2:lingampally");
		System.out.println("3:Ameerpet");
		
		switch(n)
		{
		case 1:accountTypeMenu();
		           break;
		case 2:accountTypeMenu();
		           break;
		case 3:accountTypeMenu(); 
		           break;
		default:menu();
		}
	
		
	}

	public void accountTypeMenu() throws InterruptedException {
		System.out.println("Enter the Type of Accout to have:");
		System.out.println("1:Saving Type");
		System.out.println("2:Current Type");
		System.out.println("3:Fixed Type");
		System.out.println("4:Recurring Type");
		System.out.println("5:Loan Type");
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
	
	public void login() {
		
		
	}
	
	public void registration() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://kbrsvrp01/kbrbankdb?user=sysbank&password=@sys123");
		PreparedStatement ps=con.prepareStatement(s);
		con.close();
	}
	
	public void transations() {
		
		
	}
	public void menu() throws InterruptedException
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
	
	}
		
		
	


