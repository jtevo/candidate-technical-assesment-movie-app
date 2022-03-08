package net.gaggle.challenge.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

/**
 * A single person.
 */
public class Person {

    /**
     * Unique key for the person.
     */
    @Id
    private long id;
    /**
     * Who is this miserable person?
     */
    private String name;

    // override equals and hashCode so that
    // we can get a set of distinct persons avoiding duplicates
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
