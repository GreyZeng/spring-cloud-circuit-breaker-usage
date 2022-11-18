package git.snippet.client.controller;

import git.snippet.client.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ReadingController {

    private final BookService bookService;

    public ReadingController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/to-read")
    public Mono<String> toRead() {
        return bookService.readingList();
    }
}
