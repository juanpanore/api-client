package com.chefcompany.apiclient.controllers.book;

import com.chefcompany.apiclient.domain.book.Book;
import com.chefcompany.apiclient.domain.carro.Carro;
import com.chefcompany.apiclient.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/rest")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public Flux<Book> get() {

        return bookService.get();
    }

    @PostMapping("/books")
    public Mono<Book> create(@Valid @RequestBody Book book) {
        return bookService.save(book);
    }

    @DeleteMapping("/books")
    public Mono<ResponseEntity<Void>> delete (@RequestParam(required = true) String idBook){

        return bookService.delete(idBook).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)))
                .defaultIfEmpty(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));

    }
}

