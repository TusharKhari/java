package com.company;
  class Library{
      String [] books;
      int no_of_books ;
      Library(){
          this.books = new String[100];
          this.no_of_books = 0;
      }
      void addBook(String book){
          this.books[no_of_books] = book;
          no_of_books++;
          System.out.println(book+ "has been added!");
      }
      void  showAvailableBooks(){
          System.out.println("available books are: ");
          for(String book : this.books){
              if (book == null){
                  continue;
              }
              System.out.println("* "+ book);
          }
      }
      void issueBook(String book){
          for (int i = 0; i < this.books.length ; i++) {
              if (this.books[i].equals(book)){
                  System.out.println("the book has been issued!");
                  this.books[i] = null;
                  return;
              }
          }
          System.out.println("this book does not exist");
      }
      void returnBookS(String book){
          addBook(book);
      }
  }
public class cwh_61_ex4sol {
    public static void main(String[] args) {
        // you have to implement a library using java class library
        // methods issue book, rerurn book,  show avl books, add book
        //properties : array to store the available books , and issued books

        Library lib = new Library();
        lib.addBook("think and grow rich");
        lib.addBook("algo");
        lib.addBook("cpp");
        lib.addBook("java");
        lib.showAvailableBooks();
        lib.issueBook("cpp");
        lib.returnBookS("cpp");
        lib.showAvailableBooks();
    }
}
