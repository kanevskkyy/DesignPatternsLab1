package behavioral.chain_of_responsibility;

public class Manager extends SupportHandler{
    @Override
    public void handleRequest(Question question) {
        if (question.equals(Question.HARD_QUESTION))
        {
            System.out.println("Менеджер вирішив проблему.");
        }
        else if (nextHandler != null)
        {
            System.out.println("Менеджер передає запит директору...");
            nextHandler.handleRequest(question);
        }
    }
}
