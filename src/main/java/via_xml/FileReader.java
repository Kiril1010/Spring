package via_xml;


public class FileReader implements Reader {

    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public FileReader() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void initMethod() {
        System.out.println("Inside init method Reader");
    }

    public void read() {
        System.out.println("Read from a file " + fileName);
    }

}
