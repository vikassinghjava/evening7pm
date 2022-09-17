package generics;
class B<K,V> implements A<K,V>
{
	public K getKey(K k) 
	{
		return k;
	}
	
	public V getValue(V v) 
	{
		return v;
	}
    
	static void show() {}
    
	public static void main(String[] args) {
		B<String, Integer> b=new B<>();
		String str=b.getKey("hello");
		int val=b.getValue(100);
		
		System.out.println(str+" "+val);
	}
}