import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		 
        List list = new ArrayList();
        
        list.add(10);
        list.add(10);
        
        System.out.print(list.size());
        System.out.println();
        
        list.remove(new Integer(10));
        
        System.out.print(list.size());
    }

}
