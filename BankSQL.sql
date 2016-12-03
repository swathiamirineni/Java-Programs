select * from branch_tbl
create table Employee_Tbl(E_ID varchar(20)primary key,B_id varchar(20),E_Name varchar(50),User_Name varchar(50)unique key,Password varchar(30),Designation varchar(10));
select * from Employee_tbl
desc Employee_tbl
select * from acctype_tbl
create table CustomerRegistration_tbl(Account_Number int Auto_Increment primary key,B_id varchar(20) foreign key references Branch_tbl(B_id),Acc_id varchar(20) foreign key references Acctype_tbl(Acc_id),Account_Name varchar(50),User_Name varchar(50) Unique key,Password varchar(20));
select * from CustomerRegistration_tbl
create table Activity_tbl(ACT_ID varchar(20)primary key,Account_Number int,foreign key(Account_Number) references CustomerRegistration_tbl(Account_Number),Activity varchar(20));
select * from Activity_tbl;
alter table customerregistration_tbl add primary key(User_name, Password);
alter table customerregistration_tbl drop unique(User_Name);