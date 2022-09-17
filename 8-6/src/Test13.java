import java.util.*;
//Original collection start
public class Test13 {
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(1, "ravi", "developer", 1000));
		list.add(new Employee(2, "kavi", "ceo", 2000));//500
		list.add(new Employee(3, "savi", "cto", 3000));
		//list.add(null);
		Collections.sort(list);
		
		
		System.out.println("Total no of elements: "+list.size());
		//public void contains(Object obj)
		//System.out.println("Search: "+list.contains(new Employee(2, "kavi", "ceo", 2000)));//600
		//System.out.println("Remove: "+list.remove(new Employee(2, "kavi", "ceo", 2000)));
		System.out.println("Total no of elements: "+list.size());
		System.out.println("Traverse: ");
		
		/*Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) 
		{
			Employee emp=itr.next();
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getJob()+" "+emp.getSalary());
		}
		*/
		
		for( Employee emp :list) 
		{
			String name=emp.getName();
			System.out.println(emp.getId()+" "+name+" "+emp.getJob()+" "+emp.getSalary());
			if(name.equals("ravi")) {
				//list.add(new Employee(4, "havi", "kto", 6000));
			}
		}
			
			
			
			
		
	}
	
}




