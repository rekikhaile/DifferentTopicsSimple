package HashSetExample;

public class Student2 {
int rollNumber;
    
    Student2(int n){
        rollNumber = n;
    }
    
    @Override
    public boolean equals(Object obj){
    	return obj instanceof Student2 && rollNumber == ((Student2) obj).rollNumber;
    	}
    
    @Override
    	public int hashCode() {
    		return rollNumber;
    	}
}
