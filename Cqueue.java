public class Cqueue {
    private Song[] queueArray;
    private int front;
    private int rear;
    private int size;

    public Cqueue(int kapasitas) {
        queueArray = new Song[kapasitas];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Song song) {
        if (size < queueArray.length) {
            rear = (rear + 1) % queueArray.length;
            queueArray[rear] = song;
            size++;
        } else {
            System.out.println("Antrian Telah Penuh.");
        }
    }

    public Song dequeue() {
        if (size > 0) {
            Song song = queueArray[front];
            front = (front + 1) % queueArray.length;
            size--;
            return song;
        } else {
            System.out.println("Antrian Kosong.");
            return null;
        }
    }
}
