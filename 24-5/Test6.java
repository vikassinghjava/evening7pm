package test2;
public class Test6 {
	
		public static void main(String[] args) {
				String str="hello";//ch[0h][1e][2l][3l][4O]
				char ch[]=str.toCharArray();
				System.out.println(ch.length);//5
				for(int i=ch.length-1;i>=0;i--) 
				{
					System.out.println(ch[i]);
				}
		}
}
