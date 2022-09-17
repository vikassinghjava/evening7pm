import java.util.*;
public class Test18 {
	public static void main(String[] args) {
		
			HashMap<Employee, Integer> hashmap=new HashMap<>();
			
			hashmap.put(new Employee(1, "ram", "cto", 1000), 101);
			hashmap.put(new Employee(2, "ravi", "cto", 4000), 102);
			hashmap.put(new Employee(3, "kavi", "cto", 51000), 103);
			hashmap.put(new Employee(4, "savi", "cto", 71000), 104);
			hashmap.put(null, 105);
			
			Set<Employee> empset=hashmap.keySet();
			hashmap.values();
			Iterator<Employee> itr=empset.iterator();
			while(itr.hasNext()) {
				Employee e=itr.next();
				Optional<Employee> optional=Optional.ofNullable(e);//java8 features
				if(optional.isPresent()) {
					System.out.println(e.getId()+" "+e.getName()+" "+e.getJob()+"="+hashmap.get(e));
				}
				/*Employee e=itr.next();
				if(e!=null) {
					System.out.println(e.getId()+" "+e.getName()+" "+e.getJob()+"="+hashmap.get(e));
				}*/
				
			
				
			}
	}
	
}




