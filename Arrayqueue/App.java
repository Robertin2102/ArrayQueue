public class App {
    public static void main(String[] args ) throws Exception {
        ArrayQueue<Character> custonQueue= new ArrayQueue<>();

        custonQueue.println();
        custonQueue.offer('A');
        custonQueue.offer('B');
        custonQueue.poll();
        System.out.println("--------------");
        custonQueue.println();
        custonQueue.offer('C');
        custonQueue.offer('D');
        custonQueue.offer('E');
        custonQueue.offer('F');
        System.out.println("---------------");
        custonQueue.println();
    }
}