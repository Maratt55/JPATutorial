package ru.javastudy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javastudy.entities.ContactEntity;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {

    List<ContactEntity> findByFirstName(String firstName);

    List<ContactEntity> findByFirstNameAndLastName(String firstName, String lastName);

    void deleteContactEntityByFirstName(String firstName);
}
