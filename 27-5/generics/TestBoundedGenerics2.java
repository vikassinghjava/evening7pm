package generics;
//upper bound
interface BoundedUpper<T extends RTest>{}

class RTest{}
class STest extends RTest{}
class UTest extends STest{}

public class TestBoundedGenerics2 
{
	    static void show(BoundedUpper<? extends RTest> bounded)
	    {
	    	
	    }
		public static void main(String[] args)
		{
			BoundedUpper<STest> boundedUpper=null;
			show(boundedUpper);
		}
}
