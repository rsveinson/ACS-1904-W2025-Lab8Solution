import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class WriteDataToXML {
    public static void main(String[] args)throws IOException{
      // constant
      final int N = 10;     // how many numbers to write
        
      XMLEncoder encoder = new XMLEncoder(new FileOutputStream("lab8.xml"));
      Random r = new Random();
    
      /* note the use of the constant N
       * this is so that changing the size
       * of the target array is simplified.
       */
      for (int i = 0; i < N; i++) 
          encoder.writeObject((r.nextInt(100) + 1));
      
      System.out.println("data written to file.");
      
      //encoder.writeObject(myData);    
      encoder.close();
      
      System.out.println("end of program");
    }
}
