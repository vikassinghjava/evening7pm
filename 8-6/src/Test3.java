import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		List<String> ar=new LinkedList<>();//10 elements
		ar.add("ravi");
		ar.add("kavi");
		ar.add("savi");
		ar.add("rahul");
		ar.add("savi");
		ar.add("mohan");
		System.out.println("Total no of elements :"+ar.size());//6
		System.out.println("delete: "+ar.remove("ravi"));//true
		System.out.println("search: "+ar.contains("ravi"));	//false
		System.out.println("after delete: "+ar.size());//5
		System.out.println("----traverse------------------");
		
		/*for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}*/
		/*for(String str:ar) {
			System.out.println(str);
		}*/
		
		//forward compatibility
		/*Iterator<String> itr=ar.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}*/
		
		//forward and backward compatibility
		/*ListIterator<String>  listitr=ar.listIterator();//starting of index
		while(listitr.hasNext()==true) {
			System.out.println(listitr.next());
		}
		System.out.println("reverse..");
		listitr=ar.listIterator(ar.size());//at given index
		while(listitr.hasPrevious()==true) {
			System.out.println(listitr.previous());
		}
		*/
		
		ar.forEach(System.out::println);//since java8 onward
		
	}
	
}
