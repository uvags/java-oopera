import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Actor actor1 = new Actor("ИмяАктёра1", "ФамилияАктёра1", Gender.MALE, 1);
        Actor actor2 = new Actor("ИмяАктёра2", "ФамилияАктёра2", Gender.FEMALE, 2);
        Actor actor3 = new Actor("ИмяАктёра3", "ФамилияАктёра3", Gender.MALE, 3);

        Director director1 = new Director("ИмяРежиссёра1", "ФамилияРежиссёра1", Gender.FEMALE, 19);
        Director director2 = new Director("ИмяРежиссёра2", "ФамилияРежиссёра2", Gender.MALE, 30);

        Person musicAuthor1 = new Person("ИмяАвтораМузыки1", "ФамилияАвтораМузыки1", Gender.MALE);
        Person choreographer1 = new Person("ИмяХореографа1", "ФамилияХореографа1", Gender.FEMALE);


        Show show1 = new Show("Обычный1", 180, director2);
        Opera opera1 = new Opera("Опера1", 400, director2, musicAuthor1, "ЛибреттоОпера1",
                80);
        Ballet ballet1 = new Ballet("Балет1", 60, director1, musicAuthor1, "ЛибреттоБалет1",
                choreographer1);

        show1.addActor(actor1);
        show1.addActor(actor2);
        opera1.addActor(actor1);
        opera1.addActor(actor3);
        ballet1.addActor(actor2);
        ballet1.addActor(actor3);

        show1.printActors();
        opera1.printActors();
        ballet1.printActors();

        System.out.println("Заменим актёра3 в балете (ballet1) актёром1:");
        ballet1.replaceActor(actor1, actor3.getSurname());
        ballet1.printActors();

        System.out.println("Попробуем заменить актёром3 несуществующего актёра из обычного представления (show1):");
        show1.replaceActor(actor3, "НесуществующийАктёр");
        show1.printActors();

        System.out.println("Тексты либретто для оперного и балетного представлений:");
        opera1.printLibrettoText();
        ballet1.printLibrettoText();
    }
}
