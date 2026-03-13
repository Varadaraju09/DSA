public class IntegerQueue {
    private static final int MAXSIZE = 10;
    private int[] arr = new int[MAXSIZE];

    private int front;
    private int rear;

    public IntegerQueue() {
        front = rear = -1; // The queue is empty initially
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == MAXSIZE - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Can't add more elements");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }

        arr[rear] = data;
        System.out.println("Enqueued: " + data + " into the queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Can't remove data.");
            return -1;
        }
        int data = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        System.out.println("Dequeued: " + data);
        return data;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Can't get front.");
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Can't get rear.");
            return -1;
        }
        return arr[rear];
    }

    public int getSize() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntegerQueue queue = new IntegerQueue();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int x : arr) {
            queue.enqueue(x);
        }

        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println("Front: " + queue.getFront());
        System.out.println("Rear: " + queue.getRear());
        System.out.println("Size: " + queue.getSize());
    }
}
