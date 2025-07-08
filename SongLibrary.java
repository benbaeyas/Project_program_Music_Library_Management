public class SongLibrary {
    private Song[] laguitems;
    private Album[] albums;
    private int jumlahalbum;
    private int jumlahitem;
    private Cstack stack;
    private Cqueue queue;

    public SongLibrary() {
        this.laguitems = new Song[50];
        this.jumlahitem = 0;
        this.albums = new Album[20];
        this.jumlahalbum = 0;
        this.stack = new Cstack(50);
        this.queue = new Cqueue(50);
    }

    public void addlagu(Song song) {
        if (jumlahitem < laguitems.length) {
            laguitems[jumlahitem++] = song;
        } else {
            System.out.println("Lagu Library Penuh.");
        }
    }

    public void display() {
        for (int i = 0; i < jumlahitem; i++) {
            System.out.println((i + 1) + ". Lagu:");
            laguitems[i].display();
        }
    }

    public void addalbum(Album album) {
        if (jumlahalbum < albums.length) {
            albums[jumlahalbum++] = album;
        } else {
            System.out.println("Album Library Penuh.");
        }
    }

    public void displayalbums() {
        for (int i = 0; i < jumlahalbum; i++) {
            System.out.println((i + 1) + ". ");
            albums[i].display();
        }
    }

    public void displayalbumlengkap(int albumIndex) {
        Album album = getAlbumByIndex(albumIndex);
        if (album != null) {
            album.display();
        }
    }

    public Song getSongByIndex(int index) {
        if (index >= 0 && index < jumlahitem) {
            return laguitems[index];
        } else {
            System.out.println("Perintah Tidak Sesuai.");
            return null;
        }
    }

    public Album getAlbumByIndex(int index) {
        if (index >= 0 && index < jumlahalbum) {
            return albums[index];
        } else {
            System.out.println("Invalid index.");
            return null;
        }
    }

    public void linkSongToBand(int songIndex, Band band) {
        Song song = getSongByIndex(songIndex);
        if (song != null) {
            song = new Song(song.getjudul(), song.gettahun(), song.getnamaartist(), band);
            laguitems[songIndex] = song;
        }
    }

    public void addSongToAlbum(int songIndex, int albumIndex) {
        Song song = getSongByIndex(songIndex);
        Album album = getAlbumByIndex(albumIndex);
        if (song != null && album != null) {
            album.addlagu(song);
        }
    }

    public void push(int index) {
        Song song = getSongByIndex(index);
        if (song != null) {
            stack.push(song);
        }
    }

    public Song pop() {
        return stack.pop();
    }

    public void enqueue(int index) {
        Song song = getSongByIndex(index);
        if (song != null) {
            queue.enqueue(song);
        }
    }

    public Song dequeue() {
        return queue.dequeue();
    }
}
