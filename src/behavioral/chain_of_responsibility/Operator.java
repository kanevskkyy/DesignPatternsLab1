package behavioral.chain_of_responsibility;

public class Operator extends SupportHandler {
    @Override
    public void handleRequest(Question question) {
        if (question.equals(Question.EASY_QUESTION))
        {
            System.out.println("Оператор вирішив проблему.");
        }
        else if (nextHandler != null)
        {
            System.out.println("Оператор передає запит менеджеру...");
            nextHandler.handleRequest(question);
        }
    }
}