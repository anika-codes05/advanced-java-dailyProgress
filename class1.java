package javadatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String driver_name ="com.mysql.cj.jdbc.Driver";
String host="jdbc:mysql://localhost:3306/empdb";

String username="root";
String pwd="";
String create_table="""
		CREATE TABLE IF NOT EXISTS employee(
		id INT PRIMARY KEY AUTO_INCREMENT,
		name VARCHAR(50) NOT NULL,
		dept VARCHAR(50),
		salary DECIMAL(10,2)
		
		)
		""";
try {
	Class.forName(driver_name);
	System.out.println("Driver is ready!");
	Connection con=DriverManager.getConnection(host,username,pwd);
	System.out.println("Host is ready!");
	Statement smt=con.createStatement();
	smt.execute(create_table);
	System.out.println("Table is ready!");
	int rowAffected=smt.executeUpdate("""
			insert into employee(name,dept,salary) values('Emp1','Account',40000)
			""");
	if(rowAffected>0) {
		System.out.println("Record inserted");
	}else {
		System.out.println("Record is not inserted! ");
	}
	
	
}catch(ClassNotFoundException | SQLException e){
	e.printStackTrace();
}
	}

}
