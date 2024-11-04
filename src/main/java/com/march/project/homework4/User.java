package com.march.project.homework4;

import java.util.Calendar;

public class User {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Calendar dateOfBirth;
    private String email;

    public User(String firstName, String lastName, String patronymic, Calendar dateOfBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public int getYearOfBirth() {
        return dateOfBirth.get(Calendar.YEAR);
    }

    public void setYearOfBirth(int year) throws Exception {
        if (year < 0 || year > 200) {
            throw new Exception("Введена не корректная дата года рождения: " + year);
        }
        this.dateOfBirth.set(Calendar.YEAR, year);
    }

    @Override
    public String toString() {
        return "ФИО: " + firstName + " " + lastName + " " + patronymic + "\n" +
                "Дата рождения: " + dateOfBirth.getTime() + "\n" +
                "email: " + email + "\n";
    }
}
