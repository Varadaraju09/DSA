import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExmaple {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(2);
        maxHeap.offer(9);
        maxHeap.offer(6);
        maxHeap.offer(8);
        maxHeap.offer(4);
        maxHeap.offer(3);
        maxHeap.offer(1);
        maxHeap.offer(0);

        System.out.println("Min heap: "+maxHeap);
        System.out.println(maxHeap.poll());
        }
}
