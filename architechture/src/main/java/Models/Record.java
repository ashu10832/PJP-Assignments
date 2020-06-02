package Models;

public class Record {
	
	String fname;
	String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Record(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	public Record() {
		super();
	}
	@Override
	public String toString() {
		return "Record [fname=" + fname + ", lname=" + lname + "]";
	}
	
	

}
