package threading;

import java.util.function.BiFunction;

public class Test15 
{
		public static void main(String[] args) 
		{
			BiFunction<Integer, Integer, String> bf;
			
			bf=(num1,num2)->(num1+num2)%2==0?"Even":"Odd";
			System.out.println(bf.apply(10, 21));
			System.out.println(bf.apply(11, 21));
			System.out.println(bf.apply(12, 21));
			System.out.println(bf.apply(13, 21));
		}
}
