package Ex5;
//Usage
public class Main {
    public static void main(String[] args) {
        Approver teamLead=new TeamLead();
        Approver manager=new Manager();
        Approver director=new Director();
        Approver CEO=new CEO();
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(CEO);
        ExpenseRequest lowRequest=new ExpenseRequest(5467.7f,"100 coffee machines");
        ExpenseRequest mediumRequest=new ExpenseRequest(34525.7f,"New equipment");
        ExpenseRequest highRequest=new ExpenseRequest(654788.6f,"New mouse");
        ExpenseRequest veryHighRequest=new ExpenseRequest(5435655.5f,"New office for coffee machines");
        ExpenseRequest tooHighRequest=new ExpenseRequest(87345654.6f,"Coffee");
        teamLead.handleRequest(lowRequest);
        teamLead.handleRequest(mediumRequest);
        teamLead.handleRequest(highRequest);
        teamLead.handleRequest(veryHighRequest);
        teamLead.handleRequest(tooHighRequest);
    }
}
