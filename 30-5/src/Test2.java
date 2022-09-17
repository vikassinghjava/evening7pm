import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		//ArrayList<String> ar=new ArrayList<>();
		List<String> ar1=new ArrayList<>();//10 elements
		ar1.add("ravi");
		ar1.add("kavi");
		ar1.add("savi");
		ar1.add("rahul");
		ar1.add("savi");
		ar1.add("mohan");
		
		List<String> ar2=new ArrayList<>();//10 elements
		ar2.add("kamal");
		ar2.add("rohan");
		ar2.add("sohan");
		
		ar1.addAll(ar2);
		
		System.out.println("collection 1st : "+ar1);
		
		//ar1.retainAll(ar2);
		ar1.removeAll(ar2);
		//System.out.println(ar1);
		ar1.clear();
		System.out.println(ar1);
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
		
		//ar.forEach(System.out::println);//since java8 onward
		
	}
	
}
