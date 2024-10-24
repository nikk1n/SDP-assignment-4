package Ex9;
//Concrete generator
public class HTMLReportGenerator extends ReportGenerator{
    @Override
    protected void formatHeader() {
        System.out.println("Formatting header in HTML....");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting body in HTML....");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting footer in HTML....");
    }
}
