package demo;
public class Main {
    public static void main(String[] args) {
        // Test LinkedListStack with Integer
        Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("LinkedListStack (Integer) - Peek: " + linkedListStack.peek());
        System.out.println("LinkedListStack (Integer) - Pop: " + linkedListStack.pop());
        System.out.println("LinkedListStack (Integer) - IsEmpty: " + linkedListStack.isEmpty());

        // Test ArrayStack with String
        Stack<String> arrayStack = new ArrayStack<>(2);
        arrayStack.push("apple");
        arrayStack.push("banana");
        arrayStack.push("cherry");
        System.out.println("ArrayStack (String) - Peek: " + arrayStack.peek());
        System.out.println("ArrayStack (String) - Pop: " + arrayStack.pop());
        System.out.println("ArrayStack (String) - IsEmpty: " + arrayStack.isEmpty());

        // Test LinkedListStack with Character
        Stack<Character> linkedListStackChar = new LinkedListStack<>();
        linkedListStackChar.push('a');
        linkedListStackChar.push('b');
        linkedListStackChar.push('c');
        System.out.println("LinkedListStack (Character) - Peek: " + linkedListStackChar.peek());
        System.out.println("LinkedListStack (Character) - Pop: " + linkedListStackChar.pop());
        System.out.println("LinkedListStack (Character) - IsEmpty: " + linkedListStackChar.isEmpty());

        // Test ArrayStack with Float
        Stack<Float> arrayStackFloat = new ArrayStack<>(2);
        arrayStackFloat.push(1.1f);
        arrayStackFloat.push(2.2f);
        arrayStackFloat.push(3.3f);
        System.out.println("ArrayStack (Float) - Peek: " + arrayStackFloat.peek());
        System.out.println("ArrayStack (Float) - Pop: " + arrayStackFloat.pop());
        System.out.println("ArrayStack (Float) - IsEmpty: " + arrayStackFloat.isEmpty());
    }
}
