
public class Employee {
	int Eid;
	String name;
	
	public void Emplyee(int Eid, String name) {
		this.Eid =Eid;
		this.name = name;
		
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", name=" + name + "]";
	}
	
}
