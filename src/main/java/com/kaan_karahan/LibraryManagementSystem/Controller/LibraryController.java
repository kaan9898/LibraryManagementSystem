package com.kaan_karahan.LibraryManagementSystem.Controller;

import com.kaan_karahan.LibraryManagementSystem.Model.Book;
import com.kaan_karahan.LibraryManagementSystem.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    private final LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return libraryService.getAllBooks();
    }

    @GetMapping("/getBookByISBN/{isbn}")
    public Book getBookByISBN(@RequestParam String isbn) {
        return libraryService.getBookByISBN(isbn);
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return libraryService.addBook(book);
    }

    @GetMapping("/getBookByAuthor/{author}")
    public List<Book> getBookByAuthor(@RequestParam String author) {
        return libraryService.getBooksByAuthor(author);
    }

    @GetMapping("/getAllBooksBySection/{section}")
    public List<Book> getAllBooksBySection(@RequestParam String section) {
        return libraryService.getAllBooksBySection(section);
    }

    @PutMapping("/updateBookByISBN/{isbn}")
    public Book updateBookByISBN(@PathVariable String isbn, @RequestBody Book book) {
        return libraryService.updateBookByISBN(isbn, book);
    }

    @DeleteMapping("/deleteBookByISBN/{isbn}")
    public void deleteBookByISBN(@PathVariable String isbn) {
        libraryService.deleteBookByISBN(isbn);
    }
}