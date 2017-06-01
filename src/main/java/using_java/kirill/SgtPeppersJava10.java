package using_java.kirill;

import org.springframework.stereotype.Component;

//@Component
@Component("SgtPeppersJava10")
//@Qualifier("sgtPeppersJava")
public class SgtPeppersJava10 implements CompactDiscJava10 {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
