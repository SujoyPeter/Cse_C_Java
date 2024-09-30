package introduction;
import java.util.ArrayList;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> al = new ArrayList<>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		System.out.println(al);
		al.set(0, "Vibha");
		al.remove(1);
//		System.out.println(al.get(0));
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}