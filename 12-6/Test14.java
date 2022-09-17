import java.util.*;
//Original collection start
public class Test14 {
	public static void main(String[] args) {
		
		HashSet<Employee> hashSet=new HashSet<>();
		hashSet.add(new Employee(1, "ravi", "developer", 1000));
		hashSet.add(new Employee(2, "kavi", "ceo", 2000));//500
		hashSet.add(new Employee(3, "savi", "cto", 3000));
		hashSet.add(new Employee(4, "tavi", "cfo", 4000));
		//hashSet.hashCode();
		System.out.println("Total no of elements: "+hashSet.size());
		//public void contains(Object obj)
		System.out.println("Search: "+hashSet.contains(new Employee(2, "kavi", "ceo", 2000)));//600
		System.out.println("Remove: "+hashSet.remove(new Employee(2, "kavi", "ceo", 2000)));
		System.out.println("Total no of elements: "+hashSet.size());
		System.out.println("Traverse: ");
		
		Iterator<Employee> itr = hashSet.iterator();
		while(itr.hasNext()) 
		{
			Employee emp=itr.next();
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getJob()+" "+emp.getSalary());
		}
	}
	
}




