package EqualsHashCode;

import java.util.Objects;

public class Person {
    private int Identity;
    private String Name;
    private String Surname ;
    Person(int Identity,String Name,String Surname){
        this.Identity=Identity;
        this.Name=Name;
        this.Surname=Surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Identity == person.Identity && Objects.equals(Name, person.Name) && Objects.equals(Surname, person.Surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Identity);
    }
}
