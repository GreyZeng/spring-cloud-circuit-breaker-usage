package git.snippet.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BookController {
    @RequestMapping(value = "/recommended")
    public Mono<String> readingList() {
        return Mono.just("book1,book2,book3");
    }
}
