package io.github.ferclager.model;

import java.util.Objects;

/**
 * An Author of one or more {@link Book books}.
 */

public class Author {

    private String name;

    private String surname;

    private String countryOfBirth;

    private boolean isAlive;

    public Author() {
    }

    public Author(final String name, final String surname, final String countryOfBirth, final boolean isAlive) {
        this.name = name;
        this.surname = surname;
        this.countryOfBirth = countryOfBirth;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(surname, author.surname) &&
                Objects.equals(countryOfBirth, author.countryOfBirth) &&
                isAlive == author.isAlive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, countryOfBirth, isAlive);
    }

    @Override
    public String toString() {
        return "Author(" +
                "name=" + name +
                ", surname=" + surname +
                ", countryOfBirth=" + countryOfBirth +
                ", isAlive=" + isAlive +
                ')';
    }
}
