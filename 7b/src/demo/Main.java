package demo;
public class Main {
    public static void main(String[] args) {
    
        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
        intQueue.add(5);
        intQueue.add(1);
        intQueue.add(3);
        System.out.println("Integer PriorityQueue Peek: " + intQueue.peek());
        System.out.println("Integer PriorityQueue Remove: " + intQueue.remove());
        System.out.println("Integer PriorityQueue Is Empty: " + intQueue.isEmpty());

     
        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>();
        doubleQueue.add(5.5);
        doubleQueue.add(1.1);
        doubleQueue.add(3.3);
        System.out.println("Double PriorityQueue Peek: " + doubleQueue.peek());
        System.out.println("Double PriorityQueue Remove: " + doubleQueue.remove());
        System.out.println("Double PriorityQueue Is Empty: " + doubleQueue.isEmpty());
        
        GenericPriorityQueue<String> stringQueue = new GenericPriorityQueue<>();
        stringQueue.add("Banana");
        stringQueue.add("Apple");
        stringQueue.add("Cherry");
        System.out.println("String PriorityQueue Peek: " + stringQueue.peek());
        System.out.println("String PriorityQueue Remove: " + stringQueue.remove());
        System.out.println("String PriorityQueue Is Empty: " + stringQueue.isEmpty());
    }
}
