import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeMultiple {
	public static void main(String[] args) throws Exception {
			
		//Student s1=new Student();
		//WiproEmployee wiproEmployee=new WiproEmployee();
		//TCSEmployee tcsEmployee=new TCSEmployee();
		    
		    //Generics
		    //Object objects[]=new  Object[3];
			//objects[0]=	new WiproEmployee();
			//objects[1]=	new Student();
			//objects[2]=	new TCSEmployee();
			Student sarray[]=new Student[3];
			for(int i=0;i<sarray.length;i++) {
				sarray[i]=new Student();
				
			}
			ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("d:\\user.ser"));
			
			//obj.writeObject(s1);
			//obj.writeObject(wiproEmployee);
			//obj.writeObject(tcsEmployee);
			 obj.writeObject(sarray);
			
			System.out.println(" Serializable Done!!");
			System.out.println(" ================DeSerialization start==========================");
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("d:\\user.ser"));
			
			Student objc[]=(Student[])inputStream.readObject();
			
			for(Student s:objc) 
			{
				System.out.println(s.name);
				s.display();
				//s.display2();
			}
			System.out.println(" DeSerializable Done!!");
			/*Student s=(Student)outStream.readObject();
			WiproEmployee w=(WiproEmployee)outStream.readObject();
			TCSEmployee t=(TCSEmployee)outStream.readObject();
			
			System.out.println(s.name);
			System.out.println(w.name);
			System.out.println(t.name);
			*/
			/*
			Object savedObject=outStream.readObject();
			
			if(savedObject instanceof Student) {
				Student s=(Student)savedObject;
				System.out.println(s.name);
			} else if(savedObject instanceof WiproEmployee){
				
				WiproEmployee s=(WiproEmployee)savedObject;
				System.out.println(s.name);
				
			} else if(savedObject instanceof TCSEmployee) {
				TCSEmployee s=(TCSEmployee)savedObject;
				System.out.println(s.name);
			}
			*/
	}
}
