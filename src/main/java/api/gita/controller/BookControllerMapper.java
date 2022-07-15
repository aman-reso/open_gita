package api.gita.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import api.gita.dto.response.BookListResponse;
import api.gita.entity.Book;

@Component
public class BookControllerMapper {

	public List<BookListResponse> buildBookListResponse(List<Book> book) {
		return List.of(BookListResponse.of(book));
	}
}
