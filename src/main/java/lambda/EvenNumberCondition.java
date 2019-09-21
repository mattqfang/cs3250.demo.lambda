package lambda;

public class EvenNumberCondition implements Condition {

	@Override
	public boolean isValid(int n) {
		return n % 2 == 0;
	}

}
