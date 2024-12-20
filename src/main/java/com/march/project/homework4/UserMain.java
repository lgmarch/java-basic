package com.march.project.homework4;

import java.time.Year;
import java.util.*;

public class UserMain {
    public static void main(String[] args) {
        Year yearOfBirth = Year.of(1984);

        int numOfUser = 10;
        User[] userArray = generateUserArray(numOfUser);
        printUsers(userArray);

        System.out.println("-------");

        User[] olderUsers = usersOlderSpecifiedAge(userArray, yearOfBirth.getValue());
        printUsers(olderUsers);

        /* Box */
        Box box = new Box(23, 34, 23, "red", 3);
        box.open();
        box.getItem();
        box.setItem();
        box.setItem();
        box.setItem();
        box.setItem();
        box.getNumberOfItems();
        box.close();
        System.out.println(box);
    }

    private static User[] generateUserArray(int count) {
        User[] users = new User[count];

        for(int i=0; i < users.length; i++) {
            String firstName = "Ivanov" + i;
            String lastName = "Ivan" + i;
            String patronymic = "Jovanovich" + i;
            int yearRandom = 2024 - getRandomNumber(80);
            Year year = Year.of(yearRandom);
            String email = "ivanov" + i + "@gmail.com";

            users[i] = new User(firstName, lastName, patronymic, year, email);
        }
        return users;
    }

    private static User[] usersOlderSpecifiedAge(User[] users, int year) {
        List<User> userList = new ArrayList<>();

        for (User user : users) {
            if (user.getYearOfBirth() < year) {
                userList.add(user);
            }
        }
        return userList.toArray(new User[userList.size()]);
    }

    private static int getRandomNumber(int range) {
        Random r = new Random();

        return r.nextInt(range) + 1;
    }

    private static void printUsers(User[] users) {
        for(User user : users) {
            System.out.println(user);
        }
    }
}
