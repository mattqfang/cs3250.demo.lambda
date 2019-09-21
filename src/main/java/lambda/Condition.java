package lambda;

@FunctionalInterface
public interface Condition {
	boolean isValid(int n);
}
