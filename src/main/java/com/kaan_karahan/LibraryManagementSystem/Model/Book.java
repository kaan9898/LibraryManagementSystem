package com.kaan_karahan.LibraryManagementSystem.Model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "books")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    @Id
    @Column(name = "ISBN", length = 20)
    private String isbn;

    @Column(name = "title", nullable = false, length = 500)
    private String name;

    @Column(name = "author", nullable = false, length = 250)
    private String author;

    @Column(name = "first_publish_year")
    private Integer firstPublishYear;

    @Column(name = "state", length = 50)
    private String state = "In stock";

    @Column(name = "section", length = 100)
    private String section = "Fantasy";

    @Column(name = "shelf", length = 50)
    private String shelf = "A1";

    @Column(name = "created_at")
    private Date createdAt = new Date();

    public Book(String isbn, String name, String author,
                Integer firstPublishYear) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.firstPublishYear = firstPublishYear;
    }
}