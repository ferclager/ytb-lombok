package io.github.ferclager;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ferclager.model.Book;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
@Slf4j
public class LombokApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(LombokApplication.class, args);
        getData("data.json");
    }

    @SneakyThrows
    protected static void getData(String fileName) {
        if (fileName == null) {
            throw new RuntimeException("File must not be null");
        }

        final ObjectMapper objectMapper = new ObjectMapper();

        final URL booksAuthorsFile = LombokApplication.class.getClassLoader().getResource(fileName);
        final Book[] books = objectMapper.readValue(booksAuthorsFile, Book[].class);
        final AtomicInteger counter = new AtomicInteger(1);
        Arrays.stream(books).forEach(book ->
                log.info(counter.getAndIncrement() + ": " + book)
        );
    }
}
