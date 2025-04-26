package io.github.ferclager.model;

import lombok.*;

import java.util.Objects;

/**
 * An Author of one or more {@link Book books}.
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Author {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String surname;

    @Getter
    @Setter
    private String countryOfBirth;

    @Getter
    @Setter
    private boolean isAlive;
}
