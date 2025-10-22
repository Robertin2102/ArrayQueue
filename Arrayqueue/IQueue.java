public interface IQueue<T> {
    T poll();
    void offer(T data);
    T peek();
    void println();
    boolean isEmpy();
    int size();
    boolean isEmpty();
    void print();

}