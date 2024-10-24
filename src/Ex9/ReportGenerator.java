package Ex9;
//Abstract class with generator template method
abstract class ReportGenerator {
    //Template method
    public final void generateReport(){
        createFile();
        openFile();
        formatHeader();
        formatBody();
        formatFooter();
        saveFile();
        closeFile();
    }

    private void saveFile() {
        System.out.println("Saving file....");
    }

    private void createFile() {
        System.out.println("Creating file....");
    }
    private void openFile(){
        System.out.println("Opening file....");
    }
    private void closeFile(){
        System.out.println("Closing file....");
    }
    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();

}
