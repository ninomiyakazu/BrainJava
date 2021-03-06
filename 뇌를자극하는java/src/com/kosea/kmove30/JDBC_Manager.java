package com.kosea.kmove30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Manager {
	
	
	//////////////속성(필드)
	Connection conn = null; // 1단계: DB 연결을 위한 커넥션 인터페이스 
	Statement stmt = null;  // Statement 인터페이스 - SQL 실행.
	ResultSet rs = null;     // ResultSet 인터페이스 - SQL 결과를 저장
	//생성자
	public JDBC_Manager(Connection conn, Statement stmt, ResultSet rs) {
		super();
		this.conn = conn;
		this.stmt = stmt;
		this.rs = rs;
	}
	
	public JDBC_Manager() {
		System.out.println("JDBC_Manager() 기본 생성자 호출");
	}
	
	
	/////기능(메소드)
	//DB연결
	public Connection  DBConnection(String driver, String url, String user, String pass) throws Exception {
	//	Class.forName("com.mysql.jdbc.Driver");
		Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
        return conn;
	}
	
	//query - "select pname, age, gender from person"
    public ResultSet SelectTable(String query) throws Exception {
    	stmt = conn.createStatement();
    	 rs = stmt.executeQuery(query);
    	 return rs;
	}
    //query - "delete from person where 이름 = 홍길동 " ;
    public void deletTable(String deleteName)  throws Exception{
    	String query = "delete from person where pname = '" +deleteName + "'";
    	stmt =conn.createStatement();
    	int deleteCount = stmt.executeUpdate(query);
    	
    	if(deleteCount > 0)
    	System.out.println(deleteCount + "건이 삭제되었습니다.");
    
		
    }
// // DB SQL 작업
//    stmt = conn.createStatement();
//String sql =  "delete from person where pname = '" + args[0] + "'"; //을지문덕'
//    int chageRecord = stmt.executeUpdate(sql);
//         
//    
    
    
    
 // DB 연결해제
 	public void DBClose() throws Exception{
 		conn.close();
	
	
	
	//DB종료
 	}
}

