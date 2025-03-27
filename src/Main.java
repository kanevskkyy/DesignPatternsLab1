import behavioral.chain_of_responsibility.*;
import behavioral.command.*;
import behavioral.mediator.*;
import behavioral.memento.*;
import behavioral.iterator.*;
import behavioral.observer.*;
import behavioral.state.*;
import behavioral.strategy.*;
import behavioral.template_method.*;
import behavioral.visitor.*;

public class Main {
    public static void main(String[] args) {
        //ланцюжок залежностей
        SupportHandler operator = new Operator();
        SupportHandler manager = new Manager();
        SupportHandler director = new Director();

        operator.setNextHandler(manager);
        manager.setNextHandler(director);

        System.out.println("Запит: просте питання");
        operator.handleRequest(Question.EASY_QUESTION);
        //

        //команда
        Light light = new Light();
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);
        Button onButton = new Button(turnOn);
        Button offButton = new Button(turnOff);
        onButton.press();
        offButton.press();
        //

        //ітератор
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Design Patterns"));
        bookCollection.addBook(new Book("Clean Code"));
        bookCollection.addBook(new Book("Refactoring"));
        Iterator iterator = bookCollection.createIterator();

        System.out.println("Книги в колекції:");
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("- " + book.getTitle());
        }
        //

        //посередник
        ChatMediator chat = new ChatRoom();
        User user1 = new ChatUser(chat, "Олексій");
        User user2 = new ChatUser(chat, "Марія");
        User user3 = new ChatUser(chat, "Іван");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.send("Привіт, всім!");
        user2.send("Привіт, Олексій!");
        //

        //знімок
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Стан 1");
        originator.setState("Стан 2");

        caretaker.addMemento(originator.saveToMemento());

        originator.setState("Стан 3");
        caretaker.addMemento(originator.saveToMemento());
        originator.restoreFromMemento(caretaker.getMemento(0));
        System.out.println("Після відкату: " + originator.getState());
        originator.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Після ще одного відкату: " + originator.getState());
        //

        //спостерігач
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        //

        //стан
        CoffeeMachine machine = new CoffeeMachine();
        machine.action();
        machine.setState(new HasCoinState());
        machine.action();
        machine.setState(new MakingCoffeeState());
        machine.action();
        machine.setState(new CoffeeReadyState());
        machine.action();
        //

        //стратегія
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(500);
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(800);
        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(1200);
        //

        //шаблонний метод
        Beverage tea = new Tea();
        System.out.println("--- Готуємо чай ---");
        tea.prepareRecipe();
        Beverage coffee = new Coffee();
        System.out.println("--- Готуємо каву ---");
        coffee.prepareRecipe();
        //

        //відвідувач
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Visitor areaVisitor = new AreaVisitor();
        Visitor printVisitor = new PrintVisitor();

        System.out.println("--- Обчислення площі ---");
        circle.accept(areaVisitor);
        rectangle.accept(areaVisitor);

        System.out.println("\n--- Друк інформації ---");
        circle.accept(printVisitor);
        rectangle.accept(printVisitor);
        //
    }
}