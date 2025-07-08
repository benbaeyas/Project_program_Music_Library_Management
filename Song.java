
public class Song extends MusicItem {
    private Artist namaartist;
    private Band band;

    public Song(String judul, int tahun, Artist namaartist) {
        super(judul, tahun);
        this.namaartist = namaartist;
        this.band = null;
    }

    public Song(String judul, int tahun, Artist namaartist, Band band) {
        super(judul, tahun);
        this.namaartist = namaartist;
        this.band = band;
    }

    public Artist getnamaartist() {
        return namaartist;
    }

    public Band getband(){
        return band;
    }

    @Override
    public void display(){
        super.display();
        namaartist.display();
        if (band != null) {
            band.display();
        }
    }
}