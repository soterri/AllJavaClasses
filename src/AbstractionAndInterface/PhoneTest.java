package AbstractionAndInterface;

public class PhoneTest {
	
	public static void main(String[] args) {
		//you cannot create directly an object of a abstract class
		//Phone phone = new Phone(); CE, can't instantiate bc its incompleted
		
		//how to create the object of Phone type? create indirectly
		//create an object of child class and give reference to parent class
		
		Phone phone=new iPhone(); //built an object of phone type
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playGames();
		
	}

}
