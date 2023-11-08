//Jose Trevizo
//CS2050
//Part of Program 3
public class ArrayStackClass {
    private int maxSize, top;
    private char[] stackArray;
    public ArrayStackClass(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top = 0; //0 for an empty array
    }
    public boolean isNumber(char num){
       if(num >= '0' && num<='9')
           return true;
       else
           return false;
    }
    public boolean isOperator(char op){
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
    public static int operatorOrder(char operator){
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
    public void push(char x){ //push method
       stackArray[++top] = x;
    }
    public char pop(){
        return stackArray[top--];
    }
    public char peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }

}
