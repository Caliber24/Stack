package stack;

public class StackWithArray {
    public int top , array[] , capacity;

    public StackWithArray(int capacity) {
        this.capacity = capacity;
        this.top =-1;
        array = new int [capacity];
    }

    public boolean isFuLL(StackWithArray stack){
        return (stack.top==stack.capacity-1);
    }

    public boolean isEmpty(StackWithArray stack){
        return (top==-1);
    }

    public void push(StackWithArray stack , int x){
        if(isFuLL(stack)){
            System.out.println("stack is FULL");
            return;
        }
        top++;
        this.array[top] = x;
    }

    public int pop(StackWithArray stack){
        if(isEmpty(stack)){
            System.out.println("stack is EMPTY");
            return -1;
        }
        int x = this.array[top];
        this.array[top]=0;
        top--;
        return x;
    }

    public static void main(String[] args) {

        StackWithArray stack = new StackWithArray(5);

        stack.push(stack , 12);
        stack.push(stack , 123);
        stack.push(stack , 11);
        stack.push(stack , 10);
        stack.push(stack , 2);
        stack.push(stack , 132);

        System.out.println(stack.pop(stack));
        System.out.println(stack.pop(stack));
        System.out.println(stack.pop(stack));
        System.out.println(stack.pop(stack));
        System.out.println(stack.pop(stack));


    }
}
