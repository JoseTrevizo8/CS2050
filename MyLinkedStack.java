//Jose Trevizo
//CS2050
//Part of Program 4
public class MyLinkedStack {
    private Node top; // node that's the top of the stack
    private char data; // data is the character for the infix statment
    public void push(char data){ //push method
        Node infix = new Node(data);
        if(top == null)
            top = infix;
        else
            infix.next = top;
            top = infix;
    }
    public char pop(){ //pop method
        data =top.data;
        top = top.next;
        return data;
    }
    public boolean isEmpty(){ // boolean that will return true if the stack is empty
        if(top == null)
            return true;
            else
                return false;
    }
    public Node peek(){
        return top;
    }
    public boolean isOperator(char op){ // method for checking op (from my program 3)
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
    public boolean isNumber(char num){ //method to check if the character a number (from my program 3)
        if(num >= '0' && num<='9')
            return true;
        else
            return false;
    }
    public static int operatorOrder(char operator){ //method to check the order of the operator
        if(operator == '(')
            return 1;
        if(operator == ')')
            return 2;
        if(operator == '*')
            return 3;
        if(operator == '/')
            return 4;
        if(operator == '%')
            return 5;
        if(operator == '+')
            return 6;
        if(operator == '-')
            return 7;
        return 0;
    }

    class Node{
        private char data;
        private Node next;
        public Node(char data){ //sets up a node
            this.data = data;
            this.next = null; //null initializes next for now
        }

    }

}
