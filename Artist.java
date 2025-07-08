public class Artist {
    private String nama;
    private String genre;

    public Artist(String nama, String genre) {
        this.nama = nama;
        this.genre = genre;
    }

    public String getnama() {
        return nama;
    }

    public String getgenre() {
        return genre;
    }

    public void display(){
        System.out.println("Artist Name: " + nama + ", Genre: " + genre);
    }
}