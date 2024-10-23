package Ex7;
//Caretaker

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> versions=new ArrayList<>();
    public void addVersion(DocumentVersion version){
        versions.add(version);
    }
    public DocumentVersion getVersion(int versionNumber){
        return versions.get(versionNumber-1);
    }
    public void versionList(){
        int versionCounter=1;
        for(DocumentVersion version: versions){
            System.out.println("Version "+versionCounter+"\nName: "+ version.getName()+"\nText: "+version.getText());
            versionCounter++;
        }
    }
}
