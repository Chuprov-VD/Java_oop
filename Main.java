import Task1.Cat;
import Task1.Owner;
import Task2.Rectangle;
import Task3.Book;
import Task3.Library;

public class Main {
    public static void main(String[] args) {
//        Task1();
//        Task2();
        Task3();

    }

    /*
        Задача 1.
        Создайте класс "Кот" (Cat) со следующими свойствами:
        Приватное поле "имя" (name) типа String для хранения имени кота.
        Приватное поле "возраст" (age) типа int для хранения возраста кота.
        Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
        Публичный метод "приветствие" (greet), который выводит на консоль
        приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
        Дополнительное задание:
        Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String.
        Добавьте соответствующее поле в классе "Кот" и методы доступа для него.
        Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида
        "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
     */

    static void Task1() {
        Cat cat = new Cat();
        cat.setName("Васька");
        cat.setAge(2);
        cat.greet();
        Owner owner = new Owner();
        owner.setName("Иван Иванович");
        cat.setOwner(owner);
        cat.greet();
    }

    /*
        Задача 2:
        Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
        Класс должен обладать следующими методами:
        Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
        Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
        Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
        Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
        Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
     */

    static void Task2() {
        Rectangle rect = new Rectangle(10,10);
        System.out.printf("Прямоугольник %.2f x %.2f имеет площадь %.2f и  периметр %.2f",
                rect.getHeight(), rect.getWidth(), rect.calculateArea(), rect.calculatePerimeter());
    }

    /*
        Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
        Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library)
        со следующими свойствами и методами:
        Класс "Книга" (Book):
        Приватные поля "название" (title) и "автор" (author) типа String для хранения
        названия и автора книги соответственно.
        Приватное поле "доступность" (available) типа boolean для указания доступности книги.
        Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
        Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
        Публичный метод "показать информацию" (displayInfo), который выводит на консоль
        информацию о книге (название, автор, доступность).
        Класс "Библиотека" (Library):
        Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
        Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
        Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
        Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию
        о доступных книгах в библиотеке.
        Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра
        и выводит на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
     */

    static void Task3() {
        Library library = new Library();
        Book book1 = new Book("Война и мир. Том 1","Л.Н.Толстой",true);
        Book book2 = new Book("Война и мир. Том 2","Л.Н.Толстой",true);
        Book book3 = new Book("Война и мир. Том 3","Л.Н.Толстой",false);
        Book book4 = new Book("Война и мир. Том 4","Л.Н.Толстой",true);
        Book book5 = new Book("Мастер и Маргарита","М.А.Булгаков",false);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.displayAvailableBooks();
        library.searchByAuthor("Л.Н.Толстой");
        library.searchByAuthor("М.А.Булгаков");
    }

}