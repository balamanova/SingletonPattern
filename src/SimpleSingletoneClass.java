
public class SimpleSingletoneClass {
	
	private static SimpleSingletoneClass instance;
	
	private SimpleSingletoneClass(){
		
	}
	
	public static SimpleSingletoneClass getInstance(){
	if(instance == null){
		System.out.println("Returned new instance");
		instance  = new SimpleSingletoneClass();
		return instance;
	}
	//the second condition just for checking, we can do it without else
	else{
		System.out.println("Returned existed instance");
		return instance;
	}
	}
	
	}
