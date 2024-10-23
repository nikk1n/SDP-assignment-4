package Ex5;
//Concrete handler
public class Director extends Approver{
    public Director(){
        this.allowedExpenses=1000000;
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("Director has approved expense request for "+request.getExpense()+"$ requesting: "+request.getDescription());
    }
}
