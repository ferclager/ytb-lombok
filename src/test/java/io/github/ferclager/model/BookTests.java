package io.github.ferclager.model;


import org.junit.jupiter.api.Test;

import static io.github.ferclager.TestDataUtil.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link Book}.
 */
public class BookTests {

    @Test
    public void testCanCreateABookWithNoArgumentsConstructor() {
        final Book book = new Book();
        assertThat(book).isNotNull();
    }

    @Test
    public void shouldCreateBook_whenUsingAllArgumentsConstructor() {
        final Book book = createTestBook();
        assertAll(
                () -> assertThat(book.getTitle()).isEqualTo("Don Quijote de la Mancha"),
                () -> assertThat(book.getYearPublished()).isEqualTo(1605),
                () -> assertThat(book.getAuthor()).isEqualTo(createTestAuthor()),
                () -> assertThat(book.getGenre()).isEqualTo("Novela")
        );
    }

    @Test
    public void shouldSetAndGetTitle() {
        final Book book = new Book();
        book.setTitle("Don Quijote de la Mancha");
        assertThat(book.getTitle()).isEqualTo("Don Quijote de la Mancha");
    }

    @Test
    public void shouldSetAndGetYearPublished() {
        final Book book = new Book();
        book.setYearPublished(1605);
        assertThat(book.getYearPublished()).isEqualTo(1605);
    }

    @Test
    public void shouldSetAndGetAuthor() {
        final Author author = createTestAuthor();
        final Book book = new Book();
        book.setAuthor(author);
        assertThat(book.getAuthor()).isEqualTo(author);
    }

    @Test
    public void shouldEqual_whenBooksAreSame() {
        final Book bookA = createTestBook();
        final Book bookB = createTestBook();
        assertThat(bookA).isEqualTo(bookB);
    }

    @Test
    public void shouldReturnSameHashCode_whenCalledMultipleTimes() {
        Book book = createTestBook();
        Book book2 = createTestBook();
        int hashCode1 = book.hashCode();
        int hashCode2 = book2.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void shouldReturnDifferentHashCode_whenBooksAreNotEqual() {
        Book book1 = createTestBook();
        Book book2 = createTestBook();
        book2.setGenre("Cuento");
        assertNotEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void shouldReturnCorrectString_whenToStringIsCalled() {
        final Book book = createTestBook();
        final String expected = "Book(title=Don Quijote de la Mancha, genre=Novela, yearPublished=1605, author=Author(name=Miguel, surname=de Cervantes, countryOfBirth=ESP, isAlive=false))";
        assertThat(book.toString()).isEqualTo(expected);
    }
}
