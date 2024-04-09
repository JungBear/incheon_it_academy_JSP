package ex1_interface;

public class Kitchen implements Menu1/* Menu2, Menu3*/{
	
	@Override
	public String boggembab() {
		return "쌀 + 계란 + 춘장";
	}
	@Override
	public String tangsuyuck() {
		return "돼지고기 + 당근 + 양념";
	}
	@Override
	public String jajang() {
		return "중면 + 춘장 + 완두콩";
	}
}
