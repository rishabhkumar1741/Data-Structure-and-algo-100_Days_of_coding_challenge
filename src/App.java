
import java.util.Arrays;

public class App {
 
    
    public static void main(String[] args) {     
        String sc = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        String[] arr = sc.split("[!,?._' @]+");  
        System.out.println(arr.length);   
        for (String string : arr) {
            System.out.println(string);
        }
        
    }
}





