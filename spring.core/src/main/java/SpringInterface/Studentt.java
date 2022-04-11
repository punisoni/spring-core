package SpringInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Studentt implements InitializingBean,DisposableBean
{
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Studentt() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Studentt [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public void destroy() throws Exception
	{
	System.out.println("Destroy method called");	
	}
	
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("afterPropertiesSet() method is invoked after setter method");
	}
	
}