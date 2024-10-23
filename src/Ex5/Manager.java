package Ex5;
//Concrete handler
public class Manager extends Approver{
    public Manager(){
        this.allowedExpenses=100000;
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("Manager has approved expense request for "+request.getExpense()+"$ requesting: "+request.getDescription());
    }
}
