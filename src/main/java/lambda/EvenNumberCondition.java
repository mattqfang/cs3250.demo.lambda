package lambda;

public class EvenNumberCondition implements Condition {

	@Override
	public boolean isValid(int n) {
		int r = n % 3;
        if (r == 1) {
      	 return true;
      	 } else { return false;}
        
	}

}
