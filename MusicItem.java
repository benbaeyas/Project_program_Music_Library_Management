
public class MusicItem {
    private String judul;
    private int tahun;

    public MusicItem(String judul, int tahun) {
        this.judul = judul;
        this.tahun = tahun;
    }

    public String getjudul() {
        return judul;
    }

    public int gettahun() {
        return tahun;
    }

    public void display(){
        System.out.println("Judul: " + judul + ", Tahun: " + tahun);
    }
}