package generics;
public class Employee3<K,V> {
	K k;
	V v;
	public Employee3(K k,V v) {
	 this.k=k; this.v=v;
	}

	void show() {
		System.out.println(k+" "+v);
	}
	public static void main(String[] args) {
		Employee3<String, Integer> e=new Employee3<>("ram", 101);
		e.show();
	}

}
