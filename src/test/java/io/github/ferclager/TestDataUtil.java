package io.github.ferclager;

import io.github.ferclager.model.Author;
import io.github.ferclager.model.Book;

public final class TestDataUtil {

    private TestDataUtil(){
    }

    public static Author createTestAuthor() {
        return new Author(
                "Miguel",
                "de Cervantes",
                "ESP",
                false
        );
    }

    public static Book createTestBook() {
        return new Book(
                "Don Quijote de la Mancha",
                "Novela",
                1605,
                createTestAuthor());
    }
}

