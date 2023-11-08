//Jose Trevizo 
//CS2050
//Program 5
import java.io.*;
import java.util.Stack;
public class Program5 {
    public boolean isOperator(char op) { // method for checking op (from my program 3)
        if (op == '+')
            return true;
        if (op == '-')
            return true;
        if (op == '*')
            return true;
        if (op == '/')
            return true;
        if (op == '%')
            return true;
        if (op == '(')
            return true;
        if (op == ')')
            return true;
        else
            return false;
    }

    public boolean isNumber(char num) { //method to check if the character a number (from my program 3)
        if (num >= '0' && num <= '9')
            return true;
        else
            return false;
    }

    public static String InfixToPostfixLL(String s) {
        Stack<Character> stack = new Stack<>();
        String sWithOutSpaces = s.replace(" ", "");
        Program5 constructor = new Program5();
        char c = '0';
        char[] postFix = new char[32];
        int i;
        for (i = 0; i < sWithOutSpaces.length(); i++) {
            c = sWithOutSpaces.charAt(i);
            if (constructor.isNumber(c)) {
                postFix[i] = c;
            } else if (constructor.isOperator(c)) {
                stack.push(c);
            } else {
                postFix[i] = c;
            }
        }
        i++;
        while(!stack.empty()){
            postFix[i] = stack.pop();
            i++;
            postFix[i] = ' ';
            i++;
        }
        String postFixString = new String(postFix);
        return postFixString;
    }
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Program3.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Program5.out"));
            writer.write("Jose Trevizo\nCS2050\nProject 5\n");
            String line;
            while((line = reader.readLine())!= null){
                String infix = line;
                String postfix = InfixToPostfixLL(line);
                writer.write("Infix: " + infix + "\nPostFix: " + postfix );
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
