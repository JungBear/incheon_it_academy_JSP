package interfaceTest;

public abstract class PetAdapter implements Pet{

	@Override
	public void sitDown() {;}

	@Override
	public void turn() {;}

	@Override
	public void giveYourHand() {;}

//	@Override
//	public void waitNow() {;}
	
	@Override
	public abstract void waitNow();
	
}
