import java.io.IOException;
public class Throws {

	public static void main(String[] args) throws IOException {
		/*throws keyword is required only checked exceptions
		 * throws keyword can only be used for constructors and methods not classes
		 */
		ProcessBuilder obj = new ProcessBuilder("notepad");
		obj.start();//checked exception
		/*	
		 * 
		 * try{
		 * 
		 * 	ProcessBuilder obj = new ProcessBuilder("calc1");
            obj.start();
            }
            catch(Error e){
            System.out.println("Error");//Output: Error
            }
*/
		

	}

}
