package com.march.project.homework4;

import java.time.Year;

public class User {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Year yearOfBirth;
    private String email;

    public User(String firstName, String lastName, String patronymic, Year year, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = year;
        this.email = email;
    }

    public int getYearOfBirth() {
        return yearOfBirth.getValue();
    }

    public void setYearOfBirth(int year) throws Exception {
        Year yearNow = Year.now();
        Year yearOfBirth = Year.of(year);
        Year yearMin = Year.of(1900);

        if (yearNow.compareTo(yearOfBirth) < 0 || yearOfBirth.compareTo(yearMin) < 0) {
            throw new Exception("Введена не корректная дата года рождения: " + year);
        }
        this.yearOfBirth = Year.of(year);
    }

    @Override
    public String toString() {
        return "ФИО: " + firstName + " " + lastName + " " + patronymic + "\n" +
                "Дата рождения: " + yearOfBirth.getValue() + "\n" +
                "email: " + email + "\n";
    }
}
