package via_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReaderService {

//    private ApplicationContext context;

    private FileReader fileReader;
    private InjectionCollections injectionCollection;

//    public ReaderService (Reader reader, String file) {
    public ReaderService (FileReader reader, InjectionCollections injectionCollection) {
    /*    ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        this.fileReader = (FileReaderJava) context.getBean("fileReader");*/
        this.fileReader = reader;
        this.injectionCollection = injectionCollection;
//        System.out.println(file);
    }

    public ReaderService() {
    }

    public FileReader getFileReader() {
        return fileReader;
    }
    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public InjectionCollections getInjectionCollection() {
        return injectionCollection;
    }

    public void setInjectionCollection(InjectionCollections injectionCollection) {
        this.injectionCollection = injectionCollection;
    }

    public void fetchData() {
        fileReader.read();
    }

    public void printList() {
        System.out.println(injectionCollection.getIntegerList());
    }

    public void printSet() {
        System.out.println(injectionCollection.getIntegerSet());
    }

    public void printMap() {
        System.out.println(injectionCollection.getIntegerMap());
    }

    public void initMethod() {
        System.out.println("Inside init method ReaderService");
    }

    public void cleanUp() {
        System.out.println("Inside destroy method");
    }
}
