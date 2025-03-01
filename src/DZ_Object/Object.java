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

        Author author_1 = new Author("Лев Николаевич Толстой");
        Author author_2 = new Author("Александр Сергеевич Пушкин");
        Author author_3 = new Author(nameAuthor[0]);
        Author author_4 = new Author(nameAuthor[1]);

//          Создание книг
        Book book_1 = new Book(author_1.getAuthor(), "Война и Мир", 1726);
        Book book_2 = new Book(author_2.getAuthor(), "Евгений Онегин", 1832);
        Book book_3 = new Book(author_3.getAuthor(), nameBook[0], year[0]);
        Book book_4 = new Book(author_4.getAuthor(), nameBook[1], year[1]);

//        Распечатка полного списка книг

        System.out.printf("\n1. Книга %s, автор %s, изд. %d года. ", book_1.getBook(), author_1.getAuthor(),
                book_1.getYear());
        System.out.printf("\n2. Книга %s, автор %s, изд. %d года. ", book_2.getBook(), author_2.getAuthor(),
                book_2.getYear());
        System.out.printf("\n3. Книга %s, автор %s, изд. %d года. ", book_3.getBook(), author_3.getAuthor(),
                book_3.getYear());
        System.out.printf("\n4. Книга %s, автор %s, изд. %d года. ", book_4.getBook(), author_4.getAuthor(),
                book_4.getYear());

//                Запрос на изменение года изания книги

        System.out.print("\n У какой книги поменять год издания? - ");
        int num = inNum.nextInt();
        System.out.print("Введите правильный год: ");
        i = inNum.nextInt();

//        Сеттер по изменению года

        switch (num) {
            case 1 -> {
                book_1.setYear(i);
                System.out.printf("В книге %s год издания исправлен. ", num);
                System.out.printf("\n1. Книга %s, автор %s, изд. %d года. ", book_1.getBook(), author_1.getAuthor(),
                        book_1.getYear());
            }
            case 2 -> {
                book_2.setYear(i);
                System.out.printf("В книге %s год издания исправлен. ", num);
                System.out.printf("\n1. Книга %s, автор %s, изд. %d года. ", book_2.getBook(), author_2.getAuthor(),
                        book_2.getYear());
            }
            case 3 -> {
                book_3.setYear(i);
                System.out.printf("В книге %s год издания исправлен. ", num);
                System.out.printf("\n3. Книга %s, автор %s, изд. %d года. ", book_3.getBook(), author_3.getAuthor(),
                        book_3.getYear());
            }
            case 4 -> {
                book_4.setYear(i);
                System.out.printf("В книге %s год издания исправлен. ", num);
                System.out.printf("\n4. Книга %s, автор %s, изд. %d года. ", book_4.getBook(), author_4.getAuthor(),
                        book_4.getYear());
            }
            default -> throw new IllegalStateException("Такой книги нет: " + num);
        }


    }


}


