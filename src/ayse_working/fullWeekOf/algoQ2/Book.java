package ayse_working.fullWeekOf.algoQ2;

public class Book {

        private String name;
        private int pages;

        public Book(String name, int pages) {
            setName(name);
            setPages(pages);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }



}
/*
Question: You are given a list of books with their titles and the number of pages. Write a Java program to filter the books based on the reader's preference for the number of pages. The program should return a list of books whose page count meets or exceeds the reader's specified minimum page requirement.

Tips:

Each book's title and page count will be stored in an ArrayList.
Define a class to represent a book with attributes for the title and page count.
Write a method that takes this ArrayList and a minimum page requirement as input and returns a list of books whose page counts meet or exceed the reader's specified requirement.
Example:

vbnet
Copy code
Input:
List of books:
- Book1 with 200 pages
- Book2 with 350 pages
- Book3 with 150 pages
- Book4 with 400 pages
- Book5 with 250 pages

Customer request: Books with at least 300 pages.

Output:
[Book2, Book4]

 */