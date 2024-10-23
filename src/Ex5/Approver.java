package Ex5;
//Handler
abstract class Approver {
    protected Approver nextApprover;
    protected float allowedExpenses;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
    public void handleRequest(ExpenseRequest request){
        if(request.getExpense()<allowedExpenses){
            approve(request);
        } else if (nextApprover!=null) {
            nextApprover.handleRequest(request);
        } else{
            System.out.println("This request cannot be accepted. Too high expenses require escalating to the owner");
        }
    }
    protected abstract void approve(ExpenseRequest request);
}
