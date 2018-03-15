package ioc.com.dzm.xml.entity;

public class User {
	
	private Integer uid;
	
	private String name;
	
	private String pwd;

	public User() {
	}
	
	public User(Integer uid, String name, String pwd) {
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
	

}
