package Ex7;
//Usage
public class Main {
    public static void main(String[] args) {
        Document document=new Document("Letter","Hello");
        VersionControl versionControl=new VersionControl();
        System.out.println("Initial version:\n"+ document);
        versionControl.addVersion(document.save());
        document.update("Simple Letter","Hello! How are you?");
        System.out.println("Updated version:\n"+ document);
        versionControl.addVersion(document.save());
        document.add(" I'm fine!");
        System.out.println("Added text:\n"+document);
        versionControl.addVersion(document.save());
        versionControl.versionList();
        document.restore(versionControl.getVersion(2));
        System.out.println("Restored version 2:\n"+document);

    }
}
