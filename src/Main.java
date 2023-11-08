public class Main {
        public static void main(String[] args) {
        Author glukhovskyD = new Author("Дмитрий", "Глуховский");

        Author lindsayJ = new Author("Джеффри", "Линдсей");

        Book metro2033 = new Book("Метро 2033", glukhovskyD, 2005);

        Book darklyDreamingDexter = new Book("Дремлющий демон Декстера / Darkly Dreaming Dexter",
                lindsayJ, 2003);

//        Вывод в консоль, для проверки:

        System.out.println("Название книги: " + metro2033.getName() + "\n"
                + "Автор: " + metro2033.getAuthor() + "\n"
                + "Год издания: " + metro2033.getYear() + "\n");

        System.out.println("Название книги: " + darklyDreamingDexter.getName() + "\n"
                + "Автор: " + darklyDreamingDexter.getAuthor() + "\n"
                + "Год издания: " + darklyDreamingDexter.getYear() + "\n");

        darklyDreamingDexter.setYear(2004);

        System.out.println("Название книги: " + darklyDreamingDexter.getName() + "\n"
                + "Автор: " + darklyDreamingDexter.getAuthor() + "\n"
                + "Год издания: " + darklyDreamingDexter.getYear() + "\n");
    }
}