/**
 * Created by CarlosSanchez on 1/28/17.
 */
public class SomeSingleton {

    //Lazy initialization
    private static SomeSingleton instance = null;

    private SomeSingleton(){}

    // Use synchronized for thread safety
    public static synchronized SomeSingleton getInstance(){
        if(instance == null){
            instance = new SomeSingleton();
        }
        return instance;
    }

    public void getConnection(){
        System.out.println("Connected");
    }
}
