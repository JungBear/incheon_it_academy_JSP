package lambda;

@FunctionalInterface
public interface PrintName {
	public String getFullName(String firstName, String lastName);
}
