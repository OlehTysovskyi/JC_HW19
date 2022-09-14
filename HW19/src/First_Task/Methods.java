package First_Task;

import java.io.*;

public class Methods {	
	
	public void serialize(File file, Serializable Object) throws Exception {
		FileOutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(Object);
		oos.close();
	}
	
	public Serializable deserialize(File file) throws Exception{
		FileInputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Serializable object = (Serializable) ois.readObject();
		ois.close();
		is.close();
		return object;
	}
}
