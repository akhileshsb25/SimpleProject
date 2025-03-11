package com;

import com.model.Book;

public class Main {
    public static void main(String[] args) {
        // Create a new Book object
        Book book = new Book();
        
        // Set the title and author of the book
        book.setTitle("Complete Java");
        book.setAuthor("Herbert Schildt");
        
        // Print the Book object to the console (calls the toString method)
        System.out.println(book);  // Output: Book [title=Complete Java, author=Herbert Schildt]
    }
}
