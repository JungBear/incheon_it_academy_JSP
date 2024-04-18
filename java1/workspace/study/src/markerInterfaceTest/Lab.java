package markerInterfaceTest;

public class Lab {
	
	public void checkKinds(Animal[] aniamls) {
				
		for (Animal animal : aniamls) {
			if(animal instanceof HerbivoreMarker) {
				System.out.println(animal.kind + "은(는) 초식성 동물입니다.");
			}else if(animal instanceof CarnivoreMarker){
				System.out.println(animal.kind + "은(는) 육식성 동물입니다.");
			}else {
				System.out.println(animal.kind + "은(는) 잡식성 동물입니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Lab lab = new Lab();
		
		Animal[] animals = {new Bear(), new Dog(), new Cow(), new Tiger()};
		
		lab.checkKinds(animals);
		
	}
}
