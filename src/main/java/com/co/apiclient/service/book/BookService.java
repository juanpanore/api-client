package com.co.apiclient.service.book;

import com.co.apiclient.domain.book.Book;
import com.co.apiclient.repository.book.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    @Autowired
    private IBookRepository iBookRepository;

    public Flux<Book> get() {
        return iBookRepository.findAll();
    }

    public Mono<Book> save(Book book) {

        return iBookRepository.save(book);
    }

    public Mono<Void> delete(String idBook) {
        return iBookRepository.findById(idBook).flatMap(existingBook -> iBookRepository.deleteById(idBook));
    }

}
