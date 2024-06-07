package Ejercicio3;

import java.util.Objects;

public class Persona {
    int id;
    String firstName;
    String lastName;
    String email;
    Genero gender;

    public Persona(int id, String firstName, String lastName, String email, Genero gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Genero getGender() {
        return gender;
    }

    public void setGender(Genero gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("id: %d%nfirst name: %s%nlast name: %s%nemail: %s%ngender: %s%n",id, firstName,lastName,email,gender.toString().toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
