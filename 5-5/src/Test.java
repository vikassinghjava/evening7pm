
public class Test {
	
	public static void main(String[] args) {
		//output : a2b2c2d2z1
		//char ch1='a';
		//System.out.println((int)ch1);
		String str = "zabcdabcd";
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=97;j<=124;j++) {
				if(ch[i]==j && ch[i]==97 ) {
					System.out.println(ch[i]);
				}
			}
			
		}
		
	}

}
