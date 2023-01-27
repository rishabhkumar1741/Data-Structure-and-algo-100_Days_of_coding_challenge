import java.util.*;;
public class App {
  
    public static void main(String args[]) {
        HashMap<Character,Character> obj = new HashMap<>();
        obj.put('a', 'b');
        System.out.println(obj.containsKey('a'));System.out.println(obj);
        System.out.println(obj.get('a'));
        
    }

} 