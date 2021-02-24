package pl.sdacademy.podstawy;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private final String firstname;
    private final String lastname;
    private final LocalDate birthDate;
    private double salary;

    public Employee(String firstname, String lastname, LocalDate birthDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return firstname +" "+lastname;
    }

    public boolean isRetired(LocalDate referenceDate, Country country) {
        Period agePeriod = Period.between(birthDate,referenceDate);
        int age = agePeriod.getYears();
        int retireAge = country.getRetirementAge();

        return age >= retireAge;
    }
}
