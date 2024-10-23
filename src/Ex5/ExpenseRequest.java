package Ex5;
//Expense requests
public class ExpenseRequest {
    private final float expense;
    private final String description;

    public ExpenseRequest(float expense, String description) {
        this.expense = expense;
        this.description = description;
    }

    public float getExpense() {
        return expense;
    }

    public String getDescription() {
        return description;
    }
}
