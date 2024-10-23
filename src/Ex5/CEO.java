package Ex5;
//Concrete handler
public class CEO extends Approver {
    public CEO(){
        this.allowedExpenses=10000000;
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("CEO has approved expense request for "+request.getExpense()+"$ requesting: "+request.getDescription());
    }
}
