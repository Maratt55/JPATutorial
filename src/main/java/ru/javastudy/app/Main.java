package ru.javastudy.app;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import ru.javastudy.entities.ContactEntity;
import ru.javastudy.intf.ContactService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        /*GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring-config.xml"); //move from src.main.java to src.main.resources
        context.refresh();*/

        ContactService service = context.getBean("jpaContactService", ContactService.class);

        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setFirstName("Vaxo");
        contactEntity.setLastName("Panyan");
        contactEntity.setVersion(1);
        service.save(contactEntity);

        List<ContactEntity> contacts = service.findAll();
        printAll(contacts);

        contacts = service.findByFirstName("Name1");
        printAll(contacts);

        contacts = service.findByFirstNameAndLastName("Name1", "LastName1");
        printAll(contacts);
        //service.deleteContactEntityByFirstName("Vaxo");
    }

    private static void printAll(List<ContactEntity> contacts) {
        System.out.println("printAll: ");
        for (ContactEntity contact : contacts) {
            System.out.println(contact);
        }
    }
}
