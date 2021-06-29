package Queue;
public class mainQueue {
    public static void main (String[] args){
        Queue newQueue = new Queue(10);
        newQueue.enqueue(9);
        newQueue.show();
        newQueue.enqueue(8);
        newQueue.show();
        newQueue.enqueue(7);
        newQueue.show();
        newQueue.enqueue(6);
        newQueue.show();
        System.out.println("data yang diambil dari antrian " +newQueue.dequeue());
        newQueue.show();
        System.out.println("Nama saya adalah Ami Daelami Ichsana");
        System.out.println("data paling depan " +newQueue.dequeue());
        newQueue.show();
    }
}

