package structural.decorator;

abstract class MessageDecorator implements Message {
    protected Message wrappedMessage;

    public MessageDecorator(Message message) {
        this.wrappedMessage = message;
    }

    @Override
    public String getContent() {
        return wrappedMessage.getContent();
    }
}