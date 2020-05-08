public class Song {
    private String artist;
    private String title;

    public Song() {
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String display(){
        String retval = "Artist: " + getArtist() + "\nTitle: " + getTitle();
        return retval;
    }
}
