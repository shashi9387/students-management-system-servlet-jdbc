package in.ineuron.dto;

import java.io.Serializable;

//DTO -> Data Transfer Object
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private int sid;
	private String sname;
	private Integer sage;
	private String saddr;

	public Student() {
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddr=" + saddr + "]";
	}

}
