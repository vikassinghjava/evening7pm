public class Employee {

	String name,city,designnation;
	double salary;
	public Employee(String name, String city, String designnation, double salary) {
		super();
		this.name = name;
		this.city = city;
		this.designnation = designnation;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesignnation() {
		return designnation;
	}
	public void setDesignnation(String designnation) {
		this.designnation = designnation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		String s=String.format("%s,%s,%s,%.2f", name,designnation,city,salary);
		return s;
	}
	
}
