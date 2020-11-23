package com.ielts.institute.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "institute")
public class Institute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String contact;
    private String email;
    private String dateOfCreation;
    private String address;
    private String remarks;  // Will be removed if not required

    public Institute() {
    }

    public Institute(long id, String name, String contact, String email, String dateOfCreation, String address, String remarks) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.dateOfCreation = dateOfCreation;
        this.address = address;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", address='" + address + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
