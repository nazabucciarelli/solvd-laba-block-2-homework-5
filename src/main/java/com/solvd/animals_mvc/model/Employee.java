package com.solvd.animals_mvc.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Date;
import java.util.Objects;

public class Employee extends Person {
    private Long id;
    private Date entryDate;
    private double salary;
    private Long personId;
    private Long employeeIdentifierId;

    public Employee() {
    }

    public Employee(int age, String firstName, String lastName, Long genderId,
                    Long countryId, Long id, Date entryDate, double salary,
                    Long personId, Long employeeIdentifierId,
                    String phoneNumber) {
        super(age, firstName, lastName, genderId, countryId, phoneNumber);
        this.id = id;
        this.entryDate = entryDate;
        this.salary = salary;
        this.personId = personId;
        this.employeeIdentifierId = employeeIdentifierId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getEmployeeIdentifierId() {
        return employeeIdentifierId;
    }

    public void setEmployeeIdentifierId(Long employeeIdentifierId) {
        this.employeeIdentifierId = employeeIdentifierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 &&
                Objects.equals(id, employee.id) &&
                Objects.equals(entryDate, employee.entryDate) &&
                Objects.equals(personId, employee.personId) &&
                Objects.equals(employeeIdentifierId,
                        employee.employeeIdentifierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, entryDate, salary, personId, employeeIdentifierId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", entryDate=" + entryDate +
                ", salary=" + salary +
                ", personId=" + personId +
                ", employeeIdentifierId=" + employeeIdentifierId +
                '}';
    }
}
