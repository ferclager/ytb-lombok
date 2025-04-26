package io.github.ferclager.model;

import org.junit.jupiter.api.Test;


import static io.github.ferclager.TestDataUtil.createTestAuthor;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link Author}.
 */
public class AuthorTests {

    @Test
    public void testCanCreateAuthorWithNoArgumentsConstructor() {
        final Author author = new Author();
        assertThat(author).isNotNull();
    }

    @Test
    public void shouldCreateAuthor_whenUsingAllArgumentsConstructor() {
        final Author author = createTestAuthor();
        assertAll(
                () -> assertThat(author.getName()).isEqualTo("Miguel"),
                () -> assertThat(author.getSurname()).isEqualTo("de Cervantes"),
                () -> assertThat(author.getCountryOfBirth()).isEqualTo("ESP"),
                () -> assertThat(author.isAlive()).isEqualTo(false)
        );
    }

    @Test
    public void shouldSetAndGetName() {
        final Author author = new Author();
        author.setName("Miguel");
        assertThat(author.getName()).isEqualTo("Miguel");
    }

    @Test
    public void shouldSetAndGetSurname() {
        final Author author = new Author();
        author.setSurname("de Cervantes");
        assertThat(author.getSurname()).isEqualTo("de Cervantes");
    }

    @Test
    public void shouldSetAndGetCountryOfBirth() {
        final Author author = new Author();
        author.setCountryOfBirth("ESP");
        assertThat(author.getCountryOfBirth()).isEqualTo("ESP");
    }

    @Test
    public void shouldSetAndGetIsAlive() {
        final Author author = new Author();
        author.setAlive(true);
        assertThat(author.isAlive()).isEqualTo(true);
    }

    @Test
    public void shouldEqual_whenAuthorsAreSame() {
        final Author authorA = createTestAuthor();
        final Author authorB = createTestAuthor();
        assertThat(authorA).isEqualTo(authorB);
    }

    @Test
    public void shouldReturnSameHashCode_whenCalledMultipleTimes() {
        Author authorA = createTestAuthor();
        Author authorB = createTestAuthor();
        int hashCode1 = authorA.hashCode();
        int hashCode2 = authorB.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void shouldReturnDifferentHashCode_whenBooksAreNotEqual() {
        Author authorA = createTestAuthor();
        Author authorB = createTestAuthor();
        authorB.setAlive(true);
        assertNotEquals(authorA.hashCode(), authorB.hashCode());
    }

    @Test
    public void shouldReturnCorrectString_whenToStringIsCalled() {
        final Author author = createTestAuthor();
        final String expected = "Author(name=Miguel, surname=de Cervantes, countryOfBirth=ESP, isAlive=false)";
        assertThat(author.toString()).isEqualTo(expected);
    }
}
