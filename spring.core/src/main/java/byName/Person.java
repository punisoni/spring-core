package byName;
public class Person
{
	private int pid;
	private String name;
	private String Adharno;
	
	Address address;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharno() {
		return Adharno;
	}

	public void setAdharno(String adharno) {
		Adharno = adharno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", Adharno=" + Adharno + "]";
	}
	
	}