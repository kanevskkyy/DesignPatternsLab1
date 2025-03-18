package structural.decorator;

public class BoldMessageDecorator extends MessageDecorator {

    public BoldMessageDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "<b>" + wrappedMessage.getContent() + "</b>";
    }
}