package xm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * ���ݿ�����
 */
public class DatabaseConnectionSql{
	//����SQLServer���ݿ���������
	private static final String DBRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//����SQLServer���ݿ����ӵ�ַ��t e s t d b�ɸĳ��Լ������ݿ�����
	private static final String DBURL="jdbc:sqlserver://localhost:1433;DatabaseName=testdb";
	private static final String DBUSER="sa"; //SQLServer���ݿ������û���
	private static final String PASSWORD="cj43042620020610"; //SQLServer���ݿ���������
	private Connection conn=null; //�������Ӷ���
	public DatabaseConnectionSql(){//���췽���������ݿ�
		try {
			Class.forName(DBRIVER);
			this.conn=DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
		} catch (Exception e) {e.printStackTrace();}
	}
	public Connection getConnection() {//�������ݿ����Ӷ���
		return this.conn;
	}
	public void close() {//�ر���������
		if(this.conn!=null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

