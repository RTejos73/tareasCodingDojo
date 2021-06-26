
public class Human extends Mammal {
	
	public void goToWork(){
        System.out.println("Voy a trabajar, algo que solo los humanos hacen.");
    }

	public void startSleeping() {
		System.out.println("Toser y voltear");	
		super.startSleeping();
	}
	
}
