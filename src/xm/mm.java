package xm;
/**
 ��¼�û���������趨
 */
public class mm {
	private String name;//�û���
	private String password;//����  
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
