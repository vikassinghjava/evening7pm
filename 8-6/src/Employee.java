
public class Employee  implements Comparable<Employee>{
	
	private int id;
	private String name;
	private String job;
	private int salary;

	public Employee(int id, String name, String job, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee emp) {
		//return this.id - emp.id;
		return this.name.compareTo(emp.name);
	}
	
	//String s1="ram"; String s2=new String("ram";
	
	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;*/
		
		return this.id+
				this.getName().hashCode()+
				this.getJob().hashCode()+
				this.salary;
	}


	@Override
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		
		if(emp.getId()==this.id && emp.getName().equals(name) 
		 && emp.getJob().equals(job)&& emp.getSalary()==salary) 
		{
			return true;
		}
		return false;
	}
	

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	 */
  


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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
