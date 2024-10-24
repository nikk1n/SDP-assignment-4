package Ex9;
//Control report generators
public class ReportingSystem {
    private final ReportGenerator PDFGenerator=new PDFReportGenerator();
    private final ReportGenerator HTMLGenerator=new HTMLReportGenerator();
    private final ReportGenerator TextGenerator=new TextReportGenerator();

    public void generatePDFReport(){
        PDFGenerator.generateReport();
    }
    public void generateHTMLReport(){
        HTMLGenerator.generateReport();
    }
    public void generateTextReport(){
        TextGenerator.generateReport();
    }
}
