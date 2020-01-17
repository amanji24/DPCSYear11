import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FractionRunner {

	public static void main(String[] args) throws InterruptedException {

		/*
		System.out.println(Fraction.getFractionCount());
		Fraction f1 = new Fraction(3,2);
		System.out.println(Fraction.getFractionCount());
		Fraction f2 = new Fraction(6,5);
		System.out.println(Fraction.getFractionCount()+" fractions\n");
		
		f1.divide(f2);
		
		System.out.println(f1.getNum() + "/" + f1.getDen());
		*/
		
		
		// USER 
		
		
		User u = new User(17, "Adam");
		/*save(u, "user");
		
		System.out.println("\n");
		//*/
		
		
		User u2 = (User) load("user");
		System.out.println(u2);
		System.out.println("Lifetime: " + u2.getLifetime());
		
		
		/*Thread.sleep(2000);
		System.out.println(u.getLifetime());
		//*/
		
		
		
	}
	
	public static Object load(String path) {
		try {
			FileInputStream f = new FileInputStream("/tmp/" + path + ".ser");
			ObjectInputStream in = new ObjectInputStream(f);
			Object out = in.readObject();
			in.close();
			f.close();
			return out;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void save(Object o, String path) {
		try {
	         FileOutputStream fileOut =
	         new FileOutputStream("/tmp/" + path + ".ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(o);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/" + path + ".ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}

}
