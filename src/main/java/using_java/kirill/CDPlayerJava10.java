package using_java.kirill;

public class CDPlayerJava10 {

    private CompactDiscJava10 compactDiscJava10;


    public CDPlayerJava10(CompactDiscJava10 compactDisc) {
        this.compactDiscJava10 = compactDisc;
    }

   /* @Autowired
    public void setCompactDiscJava(@Qualifier("sgtPeppersJava") CompactDiscJava10 compactDiscJava10) {
        this.compactDiscJava10 = compactDiscJava10;
    }*/

    public void turnOnMusic() {
        compactDiscJava10.play();
    }
}
