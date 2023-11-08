import java.io.*;
//Jose Trevizo
//CS 2050
//Program 3
public class Program3 {
    public static String InfixToPostfix(String s) {
        ArrayStackClass S1 = new ArrayStackClass(s.length());
        char c = 0;
        int order = 0;
        char[] postFix = new char[32];
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (S1.isNumber(c)) {
                postFix[i] = c;
            } else if (S1.isOperator(c) && S1.isEmpty()) {
                S1.push(c);
            } else if (S1.isOperator(c) && S1.operatorOrder(S1.peek()) < S1.operatorOrder(c)) {
                S1.push(c);
            } else if (S1.isOperator(c)&& S1.operatorOrder(S1.peek()) > S1.operatorOrder(c)) {
                while(S1.operatorOrder(S1.peek()) > S1.operatorOrder(c)) {
                    S1.pop();
                }
                S1.push(c);
            }

        }
        String postFixString = new String(postFix);
        return postFixString; //will print postfix statement after the loop is done

    }
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Program3.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Program3.out"));
            writer.write("Jose Trevizo\n");
            String line;
            while((line = reader.readLine())!= null){
                String infix = line;
                String postfix = InfixToPostfix(line);
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
