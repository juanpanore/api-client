package com.co.apiclient.domain.employer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "employer_data")
public class Employer {

    @Id
    private String id;
    private String documentType;
    private String documentNumber;
    private String firstName;
    private String secondName;
    private String lastName;
    private String secondSurname;
    private String email;
    private Number cellphone;

    public Employer(String id, String documentType, String documentNumber, String firstName, String secondName, String lastName, String secondSurname, String email, Number cellphone) {
        this.id = id;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.secondSurname = secondSurname;
        this.email = email;
        this.cellphone = cellphone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Number getCellphone() {
        return cellphone;
    }

    public void setCellphone(Number cellphone) {
        this.cellphone = cellphone;
    }
}
