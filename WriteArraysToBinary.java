import java.io.ObjectOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class WriteArraysToBinary{
    public static void main(String[] args)throws FileNotFoundException, IOException {
        char[] initials = {'W', 'J', 'B', 'D'};
        String[] name = {"Yeats", "Joyce", "Behan", "Brudair"};
        int[] age = {74, 59, 41, 25};

        ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream("Lab8.ser"));
        
        
      oOut.writeObject(initials);
      oOut.writeObject(name);
      oOut.writeObject(age);
      
      oOut.close();


        System.out.println("end of program");
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
