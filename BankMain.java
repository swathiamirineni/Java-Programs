package kbr.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		BankLogin bl=new BankLogin();
		bl.login();

	}

}
