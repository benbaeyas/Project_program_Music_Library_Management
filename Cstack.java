public class Cstack {
    private Song[] stackArray;
    private int top;

    public Cstack(int kapasitas) {
        stackArray = new Song[kapasitas];
    }

    public void push(Song song) {
        if (top < stackArray.length - 1) {
            stackArray[++top] = song;
        } else {
            System.out.println("Stack Penuh.");
        }
    }

    public Song pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack Kosong.");
            return null;
        }
    }
}
