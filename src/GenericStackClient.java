public class GenericStackClient {
    private static  void  stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Size of stack after pushed operation: " + stack.size());
        System.out.println("Pop element for stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n Size of stack after popped: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of String : ");
        stackOfIStrings();
        System.out.println("========");
        System.out.println("Stack of integer: ");
        stackOfIntegers();
    }
}
