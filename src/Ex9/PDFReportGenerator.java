package Ex9;
//Concrete generator
public class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting header in PDF....");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting body in PDF....");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting footer in PDF....");
    }
}
