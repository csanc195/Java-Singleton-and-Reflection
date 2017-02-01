import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.Arrays;


/**
 * Created by CarlosSanchez on 1/28/17.
 */
public class Main {
    public static void main(String[] args) {


        SomeSingleton myVariable = SomeSingleton.getInstance();
      //  myVariable.getConnection();
       // SomeSingleton anotherVariable = SomeSingleton.getInstance();

        Class thisClass = SomeSingleton.class;
        Method [] theseMethods = thisClass.getMethods();
        //Arrays.stream(theseMethods).forEach(System.out::println);

        for(Method m: theseMethods){
            System.out.println(m);
        }

        // First attempt will fail since the constructor in SomeSingleton is not publicly accessible.
        try {
            Object someObject = Class.forName("SomeSingleton").newInstance();
        } catch(Exception e){
            System.out.println("Error when loading class" + e);
        }

        // Second Attempt using reflection will succeed and the class will be instantiated again.
        Constructor[] constructors = thisClass.getDeclaredConstructors();
        Arrays.stream(constructors).forEach((cons)-> cons.setAccessible(true));

        SomeSingleton myInstance = null;
        try {
            myInstance = (SomeSingleton) constructors[0].newInstance();
        }
        catch(Exception e){
            System.out.println("Error when using constructor" + e);
        }
        myInstance.getConnection();
    }


}
