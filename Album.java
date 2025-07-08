public class Album {
    private String judul;
    private int tahun;
    private Song[] songs;
    private int jumlahsong;

    public Album(String judul, int tahun) {
        this.judul = judul;
        this.tahun = tahun;
        this.songs = new Song[10];
        this.jumlahsong = 0;
    }

    public void addlagu(Song song) {
        if (jumlahsong < songs.length) {
            songs[jumlahsong++] = song;
        } else {
            System.out.println("list lagu sudah penuh.");
        }
    }

    public String getjudul() {
        return judul;
    }

    public int gettahun() {
        return tahun;
    }

    public void display() {
        System.out.println("Judul Album: " + judul);
        System.out.println("Tahun: " + tahun);
        System.out.println("Songs:");
        for (int i = 0; i < jumlahsong; i++) {
            System.out.print((i + 1) + ". ");
            songs[i].display();
        }
    }
}
