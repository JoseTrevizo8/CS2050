import java.io.*;
//Jose Trevizo
//CS 2050
//Program 4
public class Program4 {
    public static String InfixToPostfixLL (String s){
        MyLinkedStack stack = new MyLinkedStack();
        String sWithOutSpaces = s.replace(" ", "");
        char c = 0;
        int order = 0;
        char[] postFix = new char[32];
        int i;
        for (i = 0; i < sWithOutSpaces.length(); i++) {
            c = sWithOutSpaces.charAt(i);
            if(stack.isNumber(c)){
                postFix[i] = c;
            }else if (stack.isOperator(c)){
                stack.push(c);
            }
        }
        i++;
        while(stack.peek()!= null){
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
            BufferedWriter writer = new BufferedWriter(new FileWriter("Program4.out"));
            writer.write("Jose Trevizo\nCS2050\nProject 4\n");
            String line;
            while((line = reader.readLine())!= null){
                String infix = line;
                String postfix = InfixToPostfixLL(line);
                writer.write("Infix: " + infix + "\nPostFix: " + postfix );
                writer.newLine();
                //System.out.println("Infix: " + infix + "\nPostFix: " + postfix );
            }
            reader.close();
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
