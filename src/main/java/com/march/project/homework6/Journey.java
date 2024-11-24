package com.march.project.homework6;

import com.march.project.homework6.area.Area;
import com.march.project.homework6.area.Forest;
import com.march.project.homework6.area.Plain;
import com.march.project.homework6.area.Swamp;
import com.march.project.homework6.people.Human;
import com.march.project.homework6.transport.Car;
import com.march.project.homework6.transport.Transport;

public class Journey {
    public static void main(String[] args) {
        Human human = new Human("Boris");
        System.out.println(human);

        Area forest = new Forest("gh");
        Area plain = new Plain("je");
        Area swamp = new Swamp("hj");

        Car car = new Car("BMV");
        car.setPetrol(100);
        System.out.println(car);
        human.getOnTransport(car);
        human.run(plain, 100);  // собрались поехать на равнину
    }
}
