package com.kaan_karahan.LibraryManagementSystem.Service;

import com.kaan_karahan.LibraryManagementSystem.Model.Book;
import com.kaan_karahan.LibraryManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    private final BookRepository bookRepository;

    @Autowired
    public LibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
    public Book getBookByISBN(String isbn) {
        return bookRepository.findById(isbn).orElse(null);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public List<Book> getAllBooksBySection(String section) {
        return bookRepository.findBySection(section);
    }

    public Book updateBookByISBN(String isbn, Book updatedBook) {
        return bookRepository.findById(isbn).map(existing -> {
            existing.setName(updatedBook.getName());
            existing.setAuthor(updatedBook.getAuthor());
            existing.setSection(updatedBook.getSection());
            existing.setShelf(updatedBook.getShelf());
            existing.setFirstPublishYear(updatedBook.getFirstPublishYear());
            existing.setState(updatedBook.getState());
            return bookRepository.save(existing);
        }).orElse(null);
    }

    public void deleteBookByISBN(String isbn) {
        bookRepository.deleteById(isbn);
    }
}
