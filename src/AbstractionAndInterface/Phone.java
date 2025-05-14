package AbstractionAndInterface;

public abstract class Phone {
	
	//implemented methods bc they have a body, some implementation logic
	//defined methods
	//50% - cannot create an object if class is incomplete/undefined
	
	public void makeCall() {
		System.out.println("Make call");
	}
	public void sendText() {
		System.out.println("Send text");
	}
	//method header, no body - unimplemented - undefined method
	public abstract void takePictures(); //unimplemented method bc no logic, no body
	
	public abstract void playGames();
	
}
//concrete class - class is defined - 100%
class iPhone extends Phone{

	@Override
	public void takePictures() {
		System.out.println("iPhone takes pics");
		
	}

	@Override
	public void playGames() {
		System.out.println("iPhone plays games");
		
	}
	
}
//concrete class - everything is defined - 100%
class Samsung extends Phone{

	@Override
	public void takePictures() {
		System.out.println("Samsung takes pics");
		
	}

	@Override
	public void playGames() {
		System.out.println("Samsung plays games");
		
	}
	
}