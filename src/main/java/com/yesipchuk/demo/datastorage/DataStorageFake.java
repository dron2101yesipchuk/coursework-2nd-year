package com.yesipchuk.demo.datastorage;

import com.yesipchuk.demo.model.Buyer;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DataStorageFake {

    public List<Buyer> buyers = new ArrayList<>(
            Arrays.asList(
            new Buyer(1,"Єсипчук Андрій Євгенович", 19),
            new Buyer(2,"Осадчук Роман Романович", 18),
            new Buyer(3,"Іванюк Андрій Ігорович", 19),
            new Buyer(4,"Гуменюк Станіслав Ігорович", 19),
            new Buyer(5,"Абдул Салім Рауфович", 18),
            new Buyer(6,"Баб'юк Петро Юрійович", 18),
            new Buyer(7,"Базалюк Віталій Іванович", 18),
            new Buyer(8,"Бузілов Олексій Валентинович", 20),
            new Buyer(9,"Вишиван Валентин Анатолійович", 21),
            new Buyer(10,"Гаврилюк Богдан Віталійович", 18),
            new Buyer(11,"Горшовський Мартин Васильович", 19),
            new Buyer(12,"Долженко Валерія Юріївна", 19),
            new Buyer(13,"Гунько Віталій Сидорович", 19),
            new Buyer(14,"Дронь Віталій Віталійович", 19),
            new Buyer(15,"Лакуста Володимир Юрійович", 20)
    ));

    public List<Buyer> getBuyers(){
        return buyers;
    }


}
