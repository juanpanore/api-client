package com.co.apiclient.domain.book;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "book_data")
public class Book {

    @Id
    private String code;
    private String ownerEmail;
    private String name;
    private String author;
    private String urlFrontPage;
    private Integer qualification;
    private String ownerName;
    private Boolean available;
    private String synopsis;

    public Book() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrlFrontPage() {
        return urlFrontPage;
    }

    public void setUrlFrontPage(String urlFrontPage) {
        this.urlFrontPage = urlFrontPage;
    }

    public Integer getQualification() {
        return qualification;
    }

    public void setQualification(Integer qualification) {
        this.qualification = qualification;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", ownerEmail='" + ownerEmail + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", urlFrontPage='" + urlFrontPage + '\'' +
                ", qualification='" + qualification + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", available='" + available + '\'' +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }
}