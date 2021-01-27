package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<Book> Books = new ArrayList<>();

    public static void main(String[] args) {

        int select = -1;

        while (select != 0){
            System.out.println("1. Create book");
            System.out.println("2. Search book");
            System.out.println("3. Delete book");
            System.out.println("0. Exit");

            select = scan.nextInt();

            if (select == 1){
                createBook();
            }else if (select == 2){
                searchBook();
            }else if (select == 3){
                deleteBook();
            }


        }


    }

    private static void deleteBook() {

    }

    private static void searchBook() {
        System.out.println("1. Search by title");
        System.out.println("2. Search by categories");
        int method = scan.nextInt();
        if (method == 1){
            System.out.println("Enter book title: ");
            String title = scan.next();
            boolean check = false;
            for (int i=0;i<Books.size(); i++){
                if (Books.get(i).title.equals(title)){
                    check = true;
                    System.out.println("Book id: " + Books.get(i).ID );
                    System.out.println("Book title: " + Books.get(i).title );
                    System.out.println("Book author: " + Books.get(i).author );
                    System.out.println("Book date: " + Books.get(i).date );
                    System.out.println("Book category: " + Books.get(i).category);
                }
            }
            if (check == false){
                System.out.println("Book not found!");
            }

        }
    }

    private static void createBook() {
        System.out.print("Enter id: ");
        int id = scan.nextInt();
        System.out.print("Enter book name: ");
        String name = scan.next();
        System.out.print("Enter book author: ");
        String author = scan.next();
        System.out.print("Enter publish date: ");
        String date = scan.next();
        System.out.print("Enter category: ");
        String category = scan.next();

        Book newBook = new Book(id,name,author,date,category);
        Books.add(newBook);

        System.out.println("Book created!");
    }
}
