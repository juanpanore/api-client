package com.co.apiclient.repository.book;

import com.co.apiclient.domain.book.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IBookRepository extends ReactiveCrudRepository<Book, String> {
}
