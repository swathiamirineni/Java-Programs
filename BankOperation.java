package kbr.banking;

import java.sql.SQLException;

public interface BankOperation {
	public void startMenu();
	public void branchMenu();
	public void accountTypeMenu();
	public void activityMenu();
	public void login() throws SQLException, ClassNotFoundException;
	public void registration();
	public void transactions();
	
}
