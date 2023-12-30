package com.solvd.animals_mvc.model;

import java.util.Objects;

public class Customer extends Person {
    private Long id;
    private int timesVisitingZoo;
    private Long personId;

    public Customer() {
    }

    public Customer(int age, String firstName, String lastName, Long genderId,
                    Long countryId, Long id, int timesVisitingZoo, Long personId, String
                            phoneNumber) {
        super(age, firstName, lastName, genderId, countryId, phoneNumber);
        this.id = id;
        this.timesVisitingZoo = timesVisitingZoo;
        this.personId = personId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTimesVisitingZoo() {
        return timesVisitingZoo;
    }

    public void setTimesVisitingZoo(int timesVisitingZoo) {
        this.timesVisitingZoo = timesVisitingZoo;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return timesVisitingZoo == customer.timesVisitingZoo &&
                Objects.equals(id, customer.id) && Objects.equals(personId, customer.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timesVisitingZoo, personId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", timesVisitingZoo=" + timesVisitingZoo +
                ", personId=" + personId +
                '}';
    }
}
