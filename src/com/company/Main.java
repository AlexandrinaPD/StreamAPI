package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Car car = new Car("Car_" + cars.size(), "Red", 50 + (int) (Math.random() * 100));
            cars.add(car);

        }
        for (int i = 0; i < 20; i++) {
            Car car = new Car("Car_" + cars.size(), "Blue", 50 + (int) (Math.random() * 100));
            cars.add(car);

        }

        for (int i = 0; i < 20; i++) {
            Car car = new Car("Car_" + cars.size(), "Yellow", 50 + (int) (Math.random() * 100));
            cars.add(car);

        }
        for (int i = 0; i < 20; i++) {
            Car car = new Car("Car_" + cars.size(), "Black", 50 + (int) (Math.random() * 100));
            cars.add(car);

        }
        for (int i = 0; i < 20; i++) {
            Car car = new Car("Car_" + cars.size(), "White", 50 + (int) (Math.random() * 100));
            cars.add(car);

        }


        for (Car car : cars) {
            System.out.println(car);
        }


        Optional<Car> MAXSPEEDCAR = cars.stream().filter((c) -> "red".equalsIgnoreCase(c.getColor()))
                .max((car1, car2) -> Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed()));

        if (MAXSPEEDCAR.isPresent())
            System.out.println(MAXSPEEDCAR.get());
        else
            System.out.println("Not examples");
        System.out.println(MAXSPEEDCAR);


        List<Student> students = new ArrayList<>();
        String[] fios = {"Балашова Марина Ивановна",
                "Баранов Артём Даниилович",
                "Беликов Тихон Александрович",
                "Болдырев Максим Александрович",
                "Бородин Александр Фёдорович",
                "Булатов Александр Вячеславович",
                "Васильев Михаил Никитич",
                "Виноградов Тихон Арсеньевич",
                "Горбунов Алексей Александрович",
                "Горбунов Алексей Максимович",
                "Грачев Максим Андреевич",
                "Григорьева Арина Львовна",
                "Гусева Александра Тимофеевна",
                "Денисов Константин Константинович",
                "Дубровина Таисия Владиславовна",
                "Дьяконова Диана Львовна",
                "Егорова Анастасия Данииловна",
                "Емельянова Василиса Егоровна",
                "Еремина Мария Михайловна",
                "Ефимова Александра Глебовна",
                "Жданова Вероника Антоновна",
                "Зайцев Александр Матвеевич",
                "Захарова Мирослава Руслановна",
                "Зотов Семён Артёмович",
                "Зубков Макар Дмитриевич",
                "Иванов Владислав Платонович",
                "Иванов Александр Глебович",
                "Иванов Игорь Макарович",
                "Иванова Елизавета Дмитриевна",
                "Игнатова София Романовна",
                "Исакова Алёна Фёдоровна",
                "Калачев Лука Львович",
                "Калашников Георгий Артёмович",
                "Калашников Семён Артемьевич",
                "Калинина София Кирилловна",
                "Карпов Илья Елисеевич",
                "Ковалева Татьяна Максимовна",
                "Козлова Варвара Михайловна",
                "Колесников Михаил Маркович",
                "Королева Полина Никитична",
                "Котов Ярослав Иванович",
                "Кузина Виктория Павловна",
                "Кузнецова Анна Степановна",
                "Кузнецова Варвара Мироновна",
                "Кукушкина Ульяна Руслановна",
                "Курочкина Мария Германовна",
                "Лаврова Ева Дмитриевна",
                "Лаврова Анна Фёдоровна",
                "Лебедев Марк Тимофеевич",
                "Лукьянов Матвей Александрович",
                "Макарова Василиса Львовна",
                "Матвеева Вероника Тимофеевна",
                "Меркулов Михаил Платонович",
                "Мешков Георгий Денисович",
                "Михайлова Анна Ивановна",
                "Михеева Анастасия Максимовна",
                "Нестеров Захар Семёнович",
                "Олейникова Алиса Сергеевна",
                "Павлов Виктор Максимович",
                "Павлов Максим Павлович",
                "Пантелеев Тимур Денисович",
                "Пахомова Мария Матвеевна",
                "Петров Максим Кириллович",
                "Пономарев Владислав Константинович",
                "Пономарева Арина Кирилловна",
                "Пономарева Мария Сергеевна",
                "Попова Яна Романовна",
                "Попова Марина Мирославовна",
                "Попова Маргарита Максимовна",
                "Прохоров Глеб Леонидович",
                "Савин Роман Янович",
                "Савина Валерия Артёмовна",
                "Савина Мария Львовна",
                "Семенов Марк Андреевич",
                "Семин Николай Ильич",
                "Смирнов Руслан Александрович",
                "Смирнов Андрей Егорович",
                "Смирнова Мирослава Александровна",
                "Смирнова Дарина Тихоновна",
                "Соколов Григорий Егорович",
                "Соловьев Игорь Григорьевич",
                "Сорокина Валерия Матвеевна",
                "Толкачев Сергей Даниилович",
                "Ульянов Тимофей Романович",
                "Усов Александр Александрович",
                "Усова Дарья Матвеевна",
                "Фадеева Екатерина Данииловна",
                "Филатов Даниил Григорьевич",
                "Фролов Михаил Филиппович",
                "Фролова Ксения Ивановна",
                "Фролова Екатерина Олеговна",
                "Харитонов Александр Кириллович",
                "Хохлова Мария Львовна",
                "Худяков Матвей Андреевич",
                "Черкасова Василиса Всеволодовна",
                "Черных Андрей Савельевич",
                "Шаповалова Алёна Кирилловна",
                "Широков Артём Никитич",
                "Яковлева Елизавета Сергеевна",
                "Яковлева Ксения Евгеньевна"};

        for (int i = 0; i < 20; i++) {
            Student student = new Student(fios[i], 11 + (int) (Math.random() * 55), "First", 5 + (int) (Math.random()*100));
            students.add(student);
        }
        for (int i = 20; i < 40; i++) {
            Student student = new Student(fios[i], 11 + (int) (Math.random() * 55), "Second", 5 + (int) (Math.random()*100));
            students.add(student);
        }
        for (int i = 40; i < 60; i++) {
            Student student = new Student(fios[i], 11 + (int) (Math.random() * 55), "Third", 5 + (int) (Math.random()*100));
            students.add(student);
        }
        for (int i = 60; i < 80; i++) {
            Student student = new Student(fios[i], 11 + (int) (Math.random() * 55), "Fourth", 5 + (int) (Math.random()*100));
            students.add(student);
        }
        for (int i = 80; i < 100; i++) {
            Student student = new Student(fios[i], 11 + (int) (Math.random() * 55), "Fifth", 5 + (int) (Math.random()*100));
            students.add(student);
        }

        for (Student student : students) {

            System.out.println(student);
        }

        List<String> newList = students.stream().filter((a) -> a.getAge()<16).map((s)-> s.getFullName().split(" ")[0]).collect(Collectors.toList());
        System.out.println(newList);


        List<OptionalDouble> ocen = Collections.singletonList(students.stream().mapToInt(Student::getPoints).average());
        System.out.println(ocen);




    }
}
