package ru.javastudy.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "contact")
public class ContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "first_name", nullable = false, insertable = true, updatable = true, length = 60)
    private String firstName;

    @Basic
    @Column(name = "last_name", nullable = false, insertable = true, updatable = true, length = 40)
    private String lastName;

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date", nullable = true, insertable = true, updatable = true)
    private Date birthDate;

    @Basic
    @Column(name = "version", nullable = false, insertable = true, updatable = true)
    private int version;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}
