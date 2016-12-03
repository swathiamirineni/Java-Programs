package kbr.banking;

import java.sql.*;

public class BankMain extends BankOperations{
	

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {	
		
	BankInterface b1=new BankOperations();
	b1.startMenu();
	b1.branchMenu();
	}
	

}