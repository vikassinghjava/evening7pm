package generics;

class LowerBound<T extends java.lang.Number>
{
	
}
 
public class TestLoweBoundedGenerics2 
{
	    static void show(LowerBound<? super Number> lb)
	    {
	    	
	    }
		public static void main(String[] args)
		{
			LowerBound<Byte> bb=null; 
			show(bb);
		}
}
