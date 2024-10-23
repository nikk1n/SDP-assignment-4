package Ex7;
//Memento
public class DocumentVersion {
    private final String name;
    private final String text;

    public DocumentVersion(String name, String text) {
        this.name=name;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }
}
