package kbr.banking;

import java.sql.SQLException;

public interface BankInterface {
		String s = null;
		public void startMenu() throws SQLException, ClassNotFoundException, InterruptedException ;
		public void branchMenu() throws InterruptedException;
		public void accountTypeMenu()throws InterruptedException;
		public void activityMenu();
		public void login();
		public void registration() throws SQLException, ClassNotFoundException;
		public void transations();
		public void menu() throws InterruptedException;
		public void fixedTransation();
		public void fixedTransation2();
		}


