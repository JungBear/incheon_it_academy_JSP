package castingTest;



public class CastingTask {
/*
 * 넷플릭스
 *  애니메이션, 영화, 드라마 클래스
 * 	사용자가 선택한 영상이 애니메이션이라면 "자막지원"기능
 * 	영화라면 "4D" 기능
 * 	드라마라면 "굿즈" 기능
 */
	public void check(Netflex netflex) {
		if(netflex instanceof Animation) {
			Animation ani = (Animation) netflex;
			ani.showText();
		}else if(netflex instanceof Movie) {
			Movie movie = (Movie)netflex;
			movie.fourD();
		}else{
			Drama drama = (Drama)netflex;
			drama.goods();
		}
	
	}
	
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		Animation ani = new Animation();
		ct.check(ani);
		
		Drama drama = new Drama();
		ct.check(drama);
		
		Movie movie = new Movie();
		ct.check(movie);
	}
}
