package Ex9;
//Usage
public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem=new ReportingSystem();
        System.out.println("Generating HTML report:");
        reportingSystem.generateHTMLReport();
        System.out.println("\nGenerating PDF report:");
        reportingSystem.generatePDFReport();
        System.out.println("\nGenerating plain text report:");
        reportingSystem.generateTextReport();
    }
}
