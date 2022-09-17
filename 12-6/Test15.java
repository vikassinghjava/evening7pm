import java.util.*;
//Original collection start
public class Test15 {
	public static void main(String[] args) {
		
		
		TreeSet<Employee> treeset=new TreeSet<>();
		treeset.add(new Employee(3, "savi", "cto", 3000));
		treeset.add(new Employee(1, "ravi", "developer", 1000));
		treeset.add(new Employee(4, "tavi", "cfo", 1500));
		treeset.add(new Employee(2, "kavi", "ceo", 2000));//500
		
		
		//treeset.hashCode();
		System.out.println("Total no of elements: "+treeset.size());
		//public void contains(Object obj)
		System.out.println("Search: "+treeset.contains(new Employee(2, "kavi", "ceo", 2000)));//600
		System.out.println("Remove: "+treeset.remove(new Employee(2, "kavi", "ceo", 2000)));
		System.out.println("Total no of elements: "+treeset.size());
		System.out.println("Traverse: ");
		
		Iterator<Employee> itr = treeset.iterator();
		while(itr.hasNext()) 
		{
			Employee emp=itr.next();
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getJob()+" "+emp.getSalary());
		}
		
		System.out.println("...........Salary comparator.......");
		
		TreeSet<Employee> treeSet2=new TreeSet<>(new SalaryComparator());
		treeSet2.addAll(treeset);
		
		Iterator<Employee> itr2=treeSet2.iterator();
		while(itr2.hasNext()) 
		{
			Employee emp=itr2.next();
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getJob()+" "+emp.getSalary());
		}
		
	}
	
}




