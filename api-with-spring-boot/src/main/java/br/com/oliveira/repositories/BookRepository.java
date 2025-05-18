package br.com.oliveira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oliveira.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
