import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T data){
        stack.addFirst(data);
    }
    public T pop(){
        if(isEmpty()) throw new EmptyStackException();
        return stack.removeFirst();
    }
    public int size(){
        return  stack.size();
    }
    public Boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }else return false;
    }
}

