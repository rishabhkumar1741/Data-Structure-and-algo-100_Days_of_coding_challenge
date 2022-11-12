package DAY_23_Infix_to_prefix;

class Stack {
    char arr[];
    int index = -1;

    Stack(int n) {
        arr = new char[n];
    }

    void push(char c) {
        if (index < arr.length) {
            index++;
            arr[index] = c;
        } else {
            System.out.println("Index out of range");
        }
    }

    char top() {
        return arr[index];
    }

    void pop() {
        if (index >= 0) {
            index--;
        } else {
            System.out.println("stack is empty ");
        }
    }

    boolean empty() {
        if (index == -1) {
            return true;
        } else {
            return false;
        }
    }
}

public class DAY_23_Infix_to_prefix {
    int prec(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '/' || c == '*') {
            return 2;
        } else if (c == '-' || c == '+') {
            return 1;
        } else {
            return -1;
        }
    }

    public static String revercString(String s) {
        String rString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rString = rString + s.charAt(i);
        }
        return rString;
    }

    public String infixtoprefix(String s) {
        String r = revercString(s);
        System.out.println(r);
        Stack stack_obj = new Stack(s.length());
        String ans = "";
        for (int i = 0; i < r.length(); i++) {
            if (r.charAt(i) >= 'a' && r.charAt(i) <= 'z' || r.charAt(i) >= 'A' &&
                    r.charAt(i) <= 'Z') {
                ans = ans + r.charAt(i);
            } else if (r.charAt(i) == ')') {
                stack_obj.push(r.charAt(i));
            } else if (r.charAt(i) == '(') {
                while (stack_obj.top() != ')') {
                    ans += stack_obj.top();
                    stack_obj.pop();
                }
                if (!stack_obj.empty()) {
                    stack_obj.pop();
                }
            } else {
                while (!stack_obj.empty() && prec(stack_obj.top()) >= prec(r.charAt(i))) {
                    ans += stack_obj.top();
                    stack_obj.pop();
                }
                stack_obj.push(r.charAt(i));
            }

        }
        while (!stack_obj.empty()) {
            ans += stack_obj.top();
            stack_obj.pop();
        }
        return revercString(ans);

    }

    public static void main(String[] args) {
        String prefix = "(a-b/c)*(a/k-l)";
        DAY_23_Infix_to_prefix obj = new DAY_23_Infix_to_prefix();
        System.out.println(obj.infixtoprefix(prefix));

    }

}
