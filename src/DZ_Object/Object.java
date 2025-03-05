package DZ_Object;

import java.util.Scanner;


public class Object {

    public static void main(String[] args) {

        Scanner inText = new Scanner(System.in);        //  Инициализируем сканеры
        Scanner inNum = new Scanner(System.in);
        int i = 0;
        String[] nameBook = new String[2];              // Массивы для хранения вводимых данных
        String[] nameAuthor = new String[2];
        int[] year = new int[2];
        while (i < 2) {                                 // Заполняем массив данными из консоли
            System.out.print("Введите название книги : ");
            nameBook[i] = inText.nextLine();

            System.out.print("Введите автора книги : ");
            nameAuthor[i] = inText.nextLine();

            System.out.print("Введите год издания книги : ");
            year[i] = inNum.nextInt();
            i++;
        }
//        Создание авторов

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Александр", "Пушкин");
        Author author3 = new Author(nameAuthor[0], "");        // Пока сделано так без разделения имени и фамилии
        Author author4 = new Author(nameAuthor[1], "");        // потом можно сделать разбивку и передавать их двумя
                                                                // полями

//          Создание книг
        Book book1 = new Book(author1, "Война и Мир", 1726);
        Book book2 = new Book(author2, "Евгений Онегин", 1832);
        Book book3 = new Book(author3, nameBook[0], year[0]);
        Book book4 = new Book(author4, nameBook[1], year[1]);

//        Распечатка полного списка книг
        // Через переопределенный метод toString
        System.out.println("%n Распечатка полного списка книг");
        System.out.printf("%n1. %s", book1);
        System.out.printf("%n2. %s", book2);
        System.out.printf("%n3. %s", book3);
        System.out.printf("%n4. %s", book4);

//                Запрос на изменение года издания книги

        System.out.printf("%n У какой книги поменять год издания? - ");
        int num = inNum.nextInt();
        System.out.print("Введите правильный год: ");
        i = inNum.nextInt();

//        Сеттер по изменению года

        switch (num) {
            case 1 -> {
                book1.setYear(i);
                System.out.printf("В книге %s год издания исправлен. ", num);
                System.out.printf("%n1. %s", book1);
            }
            case 2 -> {
                book2.setYear(i);
                System.out.printf("В книге %s год издания исправлен. ", num);
                System.out.printf("%n2. %s", book2);
            }
            case 3 -> {
                book3.setYear(i);
                System.out.printf("В книге %s год издания исправлен. ", num);
                System.out.printf("%n3. %s", book3);
            }
            case 4 -> {
                book4.setYear(i);
                System.out.printf("В книге %s год издания исправлен. ", num);
                System.out.printf("%n4. %s", book4);
            }
            default -> throw new IllegalStateException("Такой книги нет: " + num);
        }


    }


}


