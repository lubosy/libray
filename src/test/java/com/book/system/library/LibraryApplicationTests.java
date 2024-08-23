package com.book.system.library;

import com.book.system.library.Service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class LibraryApplicationTests {

	@Autowired
	private BookService bookService;

	@Test
	void contextLoads() {
	}

	@Test
	void viewBook(Long id){
		bookService.viewBook
	}

	@Test
	void rentBook(Long id){
		bookService.rentBook
	}


}
