package kbr.banking;

import java.sql.*;
import java.util.Scanner;

public class BankLogin  implements BankOperation {

	
	
	@Override
	public void startMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void branchMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void accountTypeMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void activityMenu() {
		// TODO Auto-generated method stub

	}

	@Override	
	
	public void login() throws SQLException,ClassNotFoundException {
		System.out.println("enter username");
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		System.out.println("enter password");
		String st1=s.nextLine();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://kbrsvrp01/kbrbankdb?user=sysbank&password=@sys123");
		Statement stmt=con.createStatement();
		//System.out.println("connected");
		ResultSet rs=stmt.executeQuery("select User_Name,password from employee_tbl");
		for(int i=1;i<=9;i++)
		{
		while (rs.next()) {
	            String user = rs.getString("user_name");
	            String pass =  rs.getString("password");
		 
		
		if(st.equals(user)&&st1.equals(pass))
		{ 
			System.out.println("welcome"+user);
		    
		}
		
		/*else
			{
				System.out.println("wrong");
				
			}*/
		
		 }
		}
		
		//System.out.println("enter correct username and password");
			
		
		

	}

	@Override
	public void registration() {
		// TODO Auto-generated method stub

	}

	@Override
	public void transactions() {
		// TODO Auto-generated method stub

	}

}
