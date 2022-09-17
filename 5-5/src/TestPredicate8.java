import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicate8 {
 public static void main(String[] args) {
	 
	 ArrayList<Employee> ar=new ArrayList<>();
	 ar.add(new Employee("vikas", "jaipur", "lead",100000));
	 ar.add(new Employee("vikas", "jaipur", "lead",200000));
	 ar.add(new Employee("ravi", "delhi", "developer",20000));
	 ar.add(new Employee("kamal", "merrut", "tester",30000));
	 ar.add(new Employee("managl", "agra", "manager",100));
	 
	 Predicate<Employee> p1=emp->emp.getDesignnation().equals("lead");
	 Predicate<Employee> p2=emp->emp.getCity().equals("jaipur");
	 Predicate<Employee> p3=emp->emp.getSalary()==100000;
	
	 /*for(Employee e:ar) {
		 if(p.test(e)) {
			 System.out.println(e);
		 }
	 }*/
	 
	 /*for(Employee e:ar) {
		 if(p1.and(p2).and(p3).test(e)) {
			 System.out.println(e);
		 }
	 }*/
	 
	 /*for(Employee e:ar) {
		 if(p1.or(p2).or(p3).test(e)) {
			 System.out.println(e);
		 }
	 }*/
	 

	 for(Employee e:ar) {
		 if(p1.negate().test(e)) {
			 System.out.println(e);
		 }
	 }
 }
 

}
