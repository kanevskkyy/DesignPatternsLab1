package structural.decorator;

public class ItalicMessageDecorator extends MessageDecorator {

    public ItalicMessageDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "<i>" + wrappedMessage.getContent() + "</i>";
    }
}