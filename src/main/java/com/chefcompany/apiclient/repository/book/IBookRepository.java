package com.chefcompany.apiclient.repository.book;

import com.chefcompany.apiclient.domain.book.Book;
import com.chefcompany.apiclient.domain.carro.Carro;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IBookRepository extends ReactiveCrudRepository<Book, String> {
}
