package Ex7;
//Originator
public class Document {
    private String name;
    private String text;

    public Document(String name,String text) {
        this.name=name;
        this.text = text;
    }
    public void update(String name, String text){
        this.name=name;
        this.text=text;
    }
    public void add(String text){
        this.text+=text;
    }
    public DocumentVersion save(){
        return new DocumentVersion(name,text);
    }
    public void restore(DocumentVersion version){
        this.name=version.getName();
        this.text=version.getText();
    }

    @Override
    public String toString() {
        return "Document name: "+name+" \nText: "+text;
    }
}
