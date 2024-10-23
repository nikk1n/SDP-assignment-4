package Ex5;
//Concrete handler
public class TeamLead extends Approver{
    public TeamLead(){
        this.allowedExpenses=10000;
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("Team lead has approved expense request for "+request.getExpense()+"$ requesting: "+request.getDescription());
    }
}
