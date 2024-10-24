package Ex9;
//Concrete generator
public class TextReportGenerator extends ReportGenerator{
    @Override
    protected void formatHeader() {
        System.out.println("Formatting header in plain text....");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting body in plain text....");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting footer in plain text....");
    }
}
