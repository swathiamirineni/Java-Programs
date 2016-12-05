package banking;

import java.sql.SQLException;

public interface BankInterface {
		String s = null;
		public void startMenu() throws SQLException, ClassNotFoundException, InterruptedException, SQLException ;
		public void branchMenu() throws InterruptedException, ClassNotFoundException, SQLException;
		public void accountTypeMenu()throws InterruptedException;
		public void activityMenu();
		public void login() throws SQLException, ClassNotFoundException, InterruptedException;
		public void registration() throws SQLException, ClassNotFoundException, InterruptedException;
		public void transations();
		public void menu() throws InterruptedException, ClassNotFoundException, SQLException;
		public void fixedTransation();
		public void fixedTransation2();
		}
