package xm;
/**
 登录用户和密码的设定
 */
public class mm {
	private String name;//用户名
	private String password;//密码
	public mm(String name,String password) {
		this.name=name;
		this.password=password;
	}
	public boolean validate() {
		if("cj".equals(name)&&"12".equals(password)) {
			return true;
		}
		else
			return false;
	}
}
