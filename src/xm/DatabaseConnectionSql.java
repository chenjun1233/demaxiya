package xm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 数据库连接
 */
public class DatabaseConnectionSql{
	//定义SQLServer数据库驱动程序
	private static final String DBRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//定义SQLServer数据库连接地址，t e s t d b可改成自己的数据库名称
	private static final String DBURL="jdbc:sqlserver://localhost:1433;DatabaseName=testdb";
	private static final String DBUSER="sa"; //SQLServer数据库连接用户名
	private static final String PASSWORD="cj43042620020610"; //SQLServer数据库连接密码
	private Connection conn=null; //保存连接对象
	public DatabaseConnectionSql(){//构造方法连接数据库
		try {
			Class.forName(DBRIVER);
			this.conn=DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
		} catch (Exception e) {e.printStackTrace();}
	}
	public Connection getConnection() {//返回数据库连接对象
		return this.conn;
	}
	public void close() {//关闭数据连接
		if(this.conn!=null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

