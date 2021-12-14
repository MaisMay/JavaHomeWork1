package com.pb.tkachuk.hw11;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class PhoneBook {
    public static void main(String[] args) throws ParseException, IOException {


        SimpleDateFormat formatDate = new SimpleDateFormat("DD/MM/YYYY");
        Scanner scan = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Сергей", formatDate.parse("01/01/1900"), "09999999", "Днепропетровск"));
        persons.add(new Person("Иван", formatDate.parse("10/01/1900"), "09999999", "Днепропетровск"));
        persons.add(new Person("Петр", formatDate.parse("01/01/2000"), "09999999", "Днепропетровск"));


        boolean flag = true;

        do {
            String date;
            String number;
            String name;
            String town;

            System.out.println("Меню телефонной книги");
            System.out.println("Что вы хотите сделать? Выберете что-то из списка");
            System.out.println("Для выхода из приложения введите '0'");
            System.out.println("Дя просмотра всех контактов введите '8'");

            System.out.println( "1.Создать контакт");
            System.out.println( "2.Удалить контакт");
            System.out.println( "3.Найти контакт");
            System.out.println( "4.Отсортировать контакты");
            System.out.println( "5.Изменить контакт");
            System.out.println( "6.Экспорт контактов");
            System.out.println( "7.Импорт контактактов");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    /*
                        ФИО
                        дата рождения
                        телефоны (количество не ограничено)
                        адрес
                        дата и время редактирования
                     */
                    System.out.println("Введите имя в формате 'Имя'");
                    name = scan.next();
                    System.out.println("Введите дату рождения в формате день/месяц/год");
                    date = scan.next();
                    System.out.println("Введите телефон в формате +38-0**-*******");
                    number = scan.next();
                    System.out.println("Введите адрес в формате 'Город'");
                    town = scan.next();

                    Person ps = new Person();
                    ps.createContact(name, date, number, town);
                    persons.add(ps);
                    System.out.println("Сохраняем контакт:" + name + " : "+ number + "Подробности скрыты");
                    break;
                case 2:
                    System.out.println("Удалить контакт. Введите имя ");
                    name = scan.next();
                    persons.removeIf(ps1 -> ps1.getName().equals(name));
                    System.out.println("Контакт " + name + " удален.");
                    break;
                case 3:
                    System.out.println("Введите имя для поиска");
                    name = scan.next();
                    for (Person el : persons) {
                        if (el.getName().equals(name)) {
                            System.out.println(el.info());
                            for (String ph : el.getPhone()) {
                                System.out.println(ph);
                            }

                        }
                    }
                    break;
                case 4:
                    System.out.println("Выберете как отсортировать? \n" +
                            "1 - По имени\n" +
                            "2 - По дате рождения\n");
                    choice = scan.nextInt();
                    if (choice == 1) {
                        persons.sort(Comparator.comparing(Person::getName));
                        System.out.println(persons);
                    } else if (choice == 2) {
                        persons.sort(Comparator.comparing(Person::getDateBirthday));
                        System.out.println(persons);
                    }
                    break;
                case 5:
                    System.out.println("Введите имя для редактирования");
                    name = scan.next();
                    System.out.println("Выберете поле для редактирования \n" +
                            "1 - Имя\n" +
                            "2 - Дата рождения\n" +
                            "3 - Адрес\n" +
                            "4 - Добавить телефон\n");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Введите новое имя");
                            String newName = scan.next();
                            for (Person el : persons) {
                                if (el.getName().equals(name)) {
                                    String oldName = el.getName();
                                    el.setName(newName);
                                    el.setDateEdit(new Date());
                                    System.out.println("Изменено с " + oldName + " на " + newName);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Введите новую дату рождения");
                            date = scan.next();
                            for (Person el : persons) {
                                if (el.getName().equals(name)) {
                                    el.setDateBirthday(formatDate.parse(date));
                                    el.setDateEdit(new Date());
                                    System.out.println("Запись изменена");
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Введите новый адрес");
                            town = scan.next();
                            for (Person el : persons) {
                                if (el.getName().equals(name)) {
                                    el.setAddress(town);
                                    el.setDateEdit(new Date());
                                    System.out.println("Запись изменена");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Введите телефон");
                            number = scan.next();
                            for (Person el : persons) {
                                if (el.getName().equals(name)) {
                                    el.getPhone().add(number);
                                    el.setDateEdit(new Date());
                                    System.out.println("Телефон добавлен");
                                }
                            }
                            break;

                    }
                    break;
                case 6:
                    String personJson = mapper.writeValueAsString(persons);
                    System.out.println(personJson);
                    File file = Paths.get("./src/com/pb/tkachuk/hw11/person.json").toFile();
                    FileOutputStream outputStream = new FileOutputStream(file);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                    objectOutputStream.writeObject(personJson);
                    objectOutputStream.close();
                    System.out.println("Done");
                    break;
                case 7:
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    file = Paths.get("./src/com/pb/tkachuk/hw11/person.json").toFile();
                    List<Person> personsImport = Arrays.asList(mapper.readValue(file, Person[].class));
                    personsImport.forEach(System.out::println);
                    persons.addAll(personsImport);
                    System.out.println("Done");
                    break;
                case 8:
                    for (Person el : persons) {
                        System.out.println(el);
                    }
                    break;
                case 0:
                    flag = false;
                    break;


            }
        } while (flag);

    }
}