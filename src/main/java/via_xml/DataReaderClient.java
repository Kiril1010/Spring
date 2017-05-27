package via_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataReaderClient {
    private ClassPathXmlApplicationContext context;
    private ReaderService readerService;

    public DataReaderClient() {
        context = new ClassPathXmlApplicationContext("application-context.xml");
        readerService = (ReaderService) context.getBean("readerService");
    }

    public void getData() {
        readerService.fetchData();
    }

    public void printList() {
        readerService.printList();
    }

    public void printSet() {
        readerService.printSet();
    }

    public void printMap() {
        readerService.printMap();
    }

    public ReaderService getReaderService() {
        return readerService;
    }

    public void setReaderService(ReaderService readerService) {
        this.readerService = readerService;
    }
}
