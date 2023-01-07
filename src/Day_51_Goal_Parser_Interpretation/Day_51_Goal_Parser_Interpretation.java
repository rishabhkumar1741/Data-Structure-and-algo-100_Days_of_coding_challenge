package Day_51_Goal_Parser_Interpretation;
class Solution {
    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
        
        
    }
}

public class Day_51_Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String name = "Rishabh Kumar";
        System.out.println(name.replace("is","oo"));
    }

    
}
