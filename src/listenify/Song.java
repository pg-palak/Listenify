package listenify;

public class Song {
    public String title;
    public double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String toString() {
        return "Printing Song{title='" + this.title + '\'' + ", duration=" + this.duration + '}';
    }
}
