package objectTest;

import java.util.Objects;

class Sports{
	private String type;
	private int total;
	
	public Sports() {;}
	
	public Sports(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(total, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sports other = (Sports) obj;
		return total == other.total && Objects.equals(type, other.type);
	}
	
}

public class ToStringTest {

	public static void main(String[] args) {
		Sports sports = new Sports("농구", 5);
		System.out.println(sports);

	}

}
