
public class Main {
    public static void main(String[] args) {
        Author authorOfWorkbook = new Author("Muslimov", "Ruslan");
        Book workbook = new Book("Workbook", 2022, authorOfWorkbook);
        System.out.println(workbook);
        workbook.setBookYear(2000);
        System.out.printf("Set year of book is - " + workbook.getBookYear());

        System.out.println("\n====================");

        Author authorOfSecondBook = new Author("Muslimova", "Elvira");
        Book secondWorkbook = new  Book("Second Workbook", 2001, authorOfSecondBook);
        System.out.println(secondWorkbook);
        secondWorkbook.setBookYear(2020);
        System.out.println("Set year of book is -  " + secondWorkbook.getBookYear());
    }
}