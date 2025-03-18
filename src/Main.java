import structural.adapter.*;
import structural.bridge.*;
import structural.companion.*;
import structural.facade.*;
import structural.flyweight.*;
import structural.decorator.*;
import structural.proxy.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Адаптер
        CsvData csvData = new CsvData();
        JsonData jsonData = new CsvToJsonAdapter(csvData);
        jsonData.displayJson();
        //


        //Міст
        Color red = new RedColor();
        Color blue = new BlueColor();
        Shape circle = new Circle(red);
        Shape square = new Square(blue);
        circle.draw();
        square.draw();
        //

        //Компанувальник
        Graphic triangle1 = new Triangle();
        Graphic triangle2 = new Triangle();
        Drawing drawing = new Drawing();
        drawing.add(triangle1);
        drawing.add(triangle2);
        drawing.draw();
        //


        //декоратор
        Message simpleMessage = new SimpleMessage("Hello, World!");
        Message boldMessage = new BoldMessageDecorator(simpleMessage);
        Message italicMessage = new ItalicMessageDecorator(simpleMessage);

        System.out.println("Original Message: " + simpleMessage.getContent());
        System.out.println("Bold Message: " + boldMessage.getContent());
        System.out.println("Italic Message: " + italicMessage.getContent());
        //

        //фасад
        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, audio, dvd);
        homeTheater.startMovie("Програмування на джава < 3");
        homeTheater.stopMovie();
        //

        //легковаговик
        List<Tree> forest = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            TreeType type = TreeFactory.getTreeType("Дуб", "Зелений", "Груба кора");
            forest.add(new Tree(i, i * 2, type));
        }

        for (Tree tree : forest) {
            tree.draw();
        }

        //proxy
        Image image1 = new ProxyImage("photo1.jpg");

        image1.display();
        System.out.println("Друге відображення:");
        image1.display();
        //
    }
}