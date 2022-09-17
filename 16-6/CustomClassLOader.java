import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class CustomClassLOader extends ClassLoader {
	
	//Class.forName("className")
		@Override
		protected Class<?> findClass(String className) throws ClassNotFoundException {
			
			   //as byte sream container
				ByteArrayOutputStream stream=new ByteArrayOutputStream();
			
			     try(InputStream is= getClass().getClassLoader().getSystemResourceAsStream(className.replace(".", "/")+".class");)
			     {
				     int data=0;
				     while((data=is.read())!=-1)
				     {
				    	 stream.write(data);
				     }
			     
			     }catch(Exception ex) {}
			     
				//Class c= defineClass(className,stream, 0,stream.toByteArray().length);
			     byte byteArr[]=stream.toByteArray();
				return defineClass(className,byteArr, 0,byteArr.length);
		}
}
