package task24x3;

import java.util.ArrayList;

public class CreateTextDocument implements ICreateDocument {
    ArrayList<IDocument> fabricFiles = new ArrayList();

    public CreateTextDocument() {
    }

    public IDocument CreateNew(String stName, int iSize) {
        IDocument newDocument = new TextDocument(stName, iSize);
        this.fabricFiles.add(newDocument);
        return newDocument;
    }

    public IDocument CreateOpen(String stName) {
        return (IDocument)this.fabricFiles.stream().filter((IDocument) -> {
            return stName.equals(IDocument.getName());
        }).findFirst().orElse(new TextDocument());
    }
}