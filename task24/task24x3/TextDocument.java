package task24x3;

public class TextDocument extends IDocument {
    private String stContent;
    private int iTextLength;

    public TextDocument() {
        this.iSize = 80;
        this.stName = "Default";
        this.stContent = "";
        this.iTextLength = 0;
    }

    public TextDocument(String stName, int iSize) {
        this.stName = stName;
        this.iSize = iSize;
        this.stContent = "";
        this.iTextLength = 0;
    }

    public TextDocument(String stContent, String stName, int iSize) {
        this.stContent = stContent;
        this.iTextLength = stContent.length();
    }

    public String getContent() {
        return this.stContent;
    }

    public void setContent(String stContent) {
        this.stContent = stContent;
    }

    public int getTextLength() {
        return this.iTextLength;
    }

    public void setTextLength(int iTextLength) {
        this.iTextLength = iTextLength;
    }
}