public class MusicLibrary {
    private MusicItem[] items;
    private int jumlahitem;

    public MusicLibrary() {
        this.items = new MusicItem[50];
        this.jumlahitem = 0;
    }

    public void addmusicitem(MusicItem item) {
        if (jumlahitem < items.length) {
            items[jumlahitem++] = item;
        } else {
            System.out.println("Library Penuh.");
        }
    }

    public void display() {
        for (int i = 0; i < jumlahitem; i++) {
            items[i].display();
        }
    }
}
