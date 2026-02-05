package com.kaan_karahan.LibraryManagementSystem.Repository;

import com.kaan_karahan.LibraryManagementSystem.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    List<Book> findByAuthor(String author);

    List<Book> findBySection(String section);

}
