public class Band {
    private String nama;
    private String genre;

    public Band(String nama, String genre) {
        this.nama = nama;
        this.genre = genre;
    }

    public String getnamaband() {
        return nama;
    }

    public String getgenre() {
        return genre;
    }

    public void display() {
        System.out.println("Nama Band: " + nama);
        System.out.println("Genre: " + genre);
    }
}
