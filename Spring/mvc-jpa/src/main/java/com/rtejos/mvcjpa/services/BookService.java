package com.rtejos.mvcjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rtejos.mvcjpa.models.Book;
import com.rtejos.mvcjpa.repositories.BookRepositoryInterfaces;

@Service
public class BookService {
	
	private final BookRepositoryInterfaces bookRepoInterface;
	
	public BookService(BookRepositoryInterfaces bookrepository) {
		this.bookRepoInterface = bookrepository;
	}

	//Devolviendo todos los libros.
    public List<Book> allBooks() {
        return bookRepoInterface.findAll();
    }
    
    
    //Creando un libro.
    public Book createBook(Book b) {
        return bookRepoInterface.save(b);
    }
    
    
    //Obteniendo la información de un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepoInterface.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    	
	public void deleteBook(Long id) {
		 Optional<Book> optionalBook = bookRepoInterface.findById(id);
	        if(optionalBook.isPresent()) {
	            bookRepoInterface.deleteById(id);
	        }
		
	}

	public Book updateBooks(Long id, String title, String desc, String lang, Integer numOfPages) {
		Book libro = new Book();
		libro.setId(id);
		libro.setTitle(title);
		libro.setNumberOfPages(numOfPages);
		libro.setDescription(desc);
		libro.setLanguage(lang);		
		bookRepoInterface.save(libro);
		return null;
	}
	
	public Book updateBook(Book libro) {
		bookRepoInterface.save(libro);
		return null;
	}
	
	
}
