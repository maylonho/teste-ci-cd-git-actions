package br.com.oliveira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.oliveira.model.Book;
import br.com.oliveira.repositories.BookRepository;

@Service
public class BookServices {

	@Autowired
	BookRepository repository;
	
	public List<Book> findAll(){
		return repository.findAll();
	}
	
	public Book findById(Long id) {
		
		return repository.findById(id)
				.orElseThrow();
	}
	
	public Book create(Book book) {
		
		return repository.save(book);
	}
	
	public Book update(Book book) {
		
		var entity = repository.findById(book.getId())
				.orElseThrow();
		
		entity.setAuthor(book.getAuthor());
		entity.setPages(book.getPages());
		entity.setTitle(book.getTitle());
		
		return repository.save(book);
	}
	
	public void delete(Long id) {
		
		var entity = repository.findById(id)
				.orElseThrow();
		
		repository.delete(entity);
	}
	
}
