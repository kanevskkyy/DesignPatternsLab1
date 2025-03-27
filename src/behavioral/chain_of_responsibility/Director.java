package behavioral.chain_of_responsibility;

public class Director extends SupportHandler{
    @Override
    public void handleRequest(Question question) {
        System.out.println("Директор розглядає проблему: " + question);
    }
}
