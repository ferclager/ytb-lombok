package io.github.ferclager.model;

import lombok.*;

import java.util.Objects;

/**
 * A Book written by an {@link Author}.
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = "anotherOne")
@Builder
public class Book {

    private String title;

    private String genre;

    private Integer yearPublished;

    private Author author;

    private String anotherOne;
}