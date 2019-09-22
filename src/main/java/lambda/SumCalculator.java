package lambda;

public class SumCalculator {

	public static void main(String[] args) {
		int re = 0;
		SumCalculator summer = new SumCalculator();
		int answer = summer.sum(1, 100, x -> true);
		System.out.println("The answer is " + answer);
		int even = summer.sum(1, 100, new EvenNumberCondition());
		System.out.println("The answer is " + even);
		int answer3r1 = summer.sum(1, 100, x -> {int r = x % 3;
		                                          if (r == 1) {
		                                        	 return true;
		                                        	 } else { return false;}
		                                          });
		System.out.println("The answer is " + answer3r1);
		int noMore = summer.sum(1, 100, x -> x % 5 == 4);
		System.out.println("The answer is " + noMore);
	}
	
	private int sum(int low, int high, Condition condition) {
		int s = 0;
		for(int n = low; n <= high; n++) {
			if (condition.isValid(n)) {
				s += n;
			}
		}
		
		return s;
	}
	
}
