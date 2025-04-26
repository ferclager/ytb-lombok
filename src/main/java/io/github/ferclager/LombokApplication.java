package io.github.ferclager;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ferclager.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class LombokApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(LombokApplication.class, args);
        getData("data.json");
    }

    protected static void getData(String fileName) throws IllegalArgumentException, IOException {
        if (fileName == null) {
            throw new RuntimeException("File must not be null");
        }

        final ObjectMapper objectMapper = new ObjectMapper();

        final URL booksAuthorsFile = LombokApplication.class.getClassLoader().getResource(fileName);
        final Book[] books = objectMapper.readValue(booksAuthorsFile, Book[].class);
        final AtomicInteger counter = new AtomicInteger(1);
        Arrays.stream(books).forEach(book ->
                System.out.println(counter.getAndIncrement() + ": " + book)
        );
    }
}
