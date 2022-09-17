package generics;


//upper bound
class Bounded<T extends R>{}

class R{}
class S extends R{}
class U extends S{}

public class TestBoundedGenerics 
{
	    static void show(Bounded<? extends R> bounded)
	    {
	    	
	    }
		public static void main(String[] args)
		{
			//Bounded<R> obj=null;
			Bounded<S> obj=null;
			//Bounded<Object> obj;
			//Bounded<String> obj;
			//Bounded<R,Integer> obj=null;
			show(obj);
		}
}
