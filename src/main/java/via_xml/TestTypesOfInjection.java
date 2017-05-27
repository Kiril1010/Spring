package via_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
*
* Inversion of Control (IOC) and Dependency Injection (DI) are used interchangeably.
 * IOC is achieved through DI. DI is the process of providing the dependencies and IOC is the end result of DI
 * (Note: DI is not the only way to achieve IOC, there are other ways as well).
By DI the responsibility of creating objects is shifted from our application code to Spring container hence the phenomenon is called IOC.

*
Внедрение зависимостей (DI, Dependency Injection) – это механизм передачи классу его зависимостей.
Spring Framework works on one single mantra:  Dependency Injection. This is sometimes interchangeable with the  Inversion of Control
(IoC) principle. When a standalone program starts, it starts the main program, creates the dependencies, and then proceeds to execute
the appropriate methods. However, this is exactly the reverse if IoC is applied. That is, all the dependencies and relationships are created by the IoC
container and then they are injected into the main program as properties. The program is then ready for action.
This is essentially the reverse of usual program creation and hence is called Inversion of Control principle. The DI and IoC are often used interchangeably.

Injection Types
Spring allows us to inject the properties via constructors or setters. While both types are equally valid and simple,
 it’s a matter of personal choice in choosing one over the other. One advantage to using constructor types over setters is that we do not have to write additional setter code. Having said that, it is not ideal to create constructors with lots of properties as arguments. I detest writing a class with a constructor that has more than a couple of arguments!

* */

public class TestTypesOfInjection {
    public static void main(String[] args) {
       /* DataReaderClient client = new DataReaderClient();
        client.getData();*/
       /* client.printList();
        client.printSet();
        client.printMap();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        /*FileReader fileReader = (FileReader) context.getBean("fileReader");
        fileReader.read();*/
        ReaderService service = (ReaderService) context.getBean("readerService");
        service.getFileReader().setFileName("AnotherFile");

        ReaderService service1 = (ReaderService) context.getBean("readerService");

        System.out.println(service1.getFileReader().getFileName());

        /*service.fetchData();
        service.printMap();*/
    }
}
