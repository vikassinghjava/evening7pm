import java.io.*;

public class Test10 {
	public static void main(String[] args) throws Exception{
		PipedInputStream pin=new PipedInputStream();
		PipedOutputStream pout=new PipedOutputStream();
		pout.connect(pin);
		
		
		String str="hello";
		char ch[]=str.toCharArray();
		Runnable r1=()->
		{
			for(char ch1:ch) {
				try {
				pout.write(ch1);
				System.out.println("Writing:"+ch1);
				Thread.sleep(1000);
				}catch(Exception ex) {}
			}
		};
		
		Runnable r2=()->
		{
			try {
				for(int i=0;i<ch.length;i++) {
					int j=pin.read();
					System.out.println((char)j);
				}
				
				
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		Thread th1=new Thread(r1);
		Thread th2=new Thread(r2);
		th1.start();
		th2.start();
		
		
		
	}
}
