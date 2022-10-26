public class Object {
    public static void main(String[] args) {
        Author authorForLearn = new Author("John", "Schewitche");
        Book learnScada = new Book("Scada-system", authorForLearn, 2013);
        Author authorForRead = new Author("Karl", "Sagan");
        Book roman = new Book("Contact", authorForRead, 1985);
        roman.setPublishingYear(2018);
        System.out.println("Книга 1. Название: " + learnScada.getBookName() + ". Автор: " + authorForLearn.getAuthorName() + " " + authorForLearn.getAuthorSurname() + ". Год издания: " + learnScada.getPublishingYear());
        System.out.println("Книга 2. Название: " + roman.getBookName() + ". Автор: " + authorForRead.getAuthorName() + " " + authorForRead.getAuthorSurname() + ". Год издания: " + roman.getPublishingYear());
    }
}
