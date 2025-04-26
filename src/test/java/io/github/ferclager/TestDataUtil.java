package io.github.ferclager;

import io.github.ferclager.model.Author;
import io.github.ferclager.model.Book;

public final class TestDataUtil {

    private TestDataUtil(){
    }

    public static Author createTestAuthor() {
        return Author.builder()
                .name("Miguel")
                .surname("de Cervantes")
                .isAlive(false)
                .countryOfBirth("ESP")
                .build();
    }

    public static Book createTestBook() {
        return Book.builder()
                .title("Don Quijote de la Mancha")
                .genre("Novela").
                yearPublished(1605)
                .author(createTestAuthor())
                .build();

    }
}

