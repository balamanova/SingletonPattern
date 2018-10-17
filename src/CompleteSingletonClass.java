
public class CompleteSingletonClass {
private static volatile CompleteSingletonClass instance;
//volatile used for condition be two threads they will not influence to esch other

public static CompleteSingletonClass getInstance(){
	if(instance == null){
		synchronized (CompleteSingletonClass.class) {
			if(instance==null){
				instance = new CompleteSingletonClass();
			}
		}
	}
	return instance;
}

}
