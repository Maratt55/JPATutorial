package ru.javastudy.intf;


import ru.javastudy.entities.ContactEntity;

import java.util.List;

public interface ContactService  {

    List<ContactEntity> findAll();

    List<ContactEntity> findByFirstName(String firstName);

    List<ContactEntity> findByFirstNameAndLastName(String firstName, String lastName);

    void save(ContactEntity contactEntity);
    void deleteContactEntityByFirstName(String firstName);
}
