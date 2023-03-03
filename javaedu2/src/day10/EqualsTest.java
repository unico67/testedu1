package day10;

import java.util.Date;
import java.util.Objects;

class Value {
	int value;
	Value(int value){
		this.value = value;
	}
	/*public boolean equals(Object obj) {
		boolean result = false;
        if(obj != null && obj instanceof Value)
        	if(value == ((Value)obj).value)
        		result = true;
		return result;
    }*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Value))
			return false;
		Value other = (Value) obj;
		if (value != other.value)
			return false;
		return true;
	}	
}
public class EqualsTest {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null)); // f
		System.out.println(v1.equals(v3));   // f
		System.out.println(v1.equals(v2));   // t
		System.out.println(v1.equals(new Date()));   // f
		
		if(v1.equals(v2)) 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		v2 = v1;
		if(v1.equals(v2)) 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");		
	}
}
