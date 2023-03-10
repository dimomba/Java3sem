package task24x3;

public abstract class IDocument {
    protected int iSize = 0;
    protected String stName = "";

    public IDocument() {
    }

    public abstract String getContent();

    public abstract void setContent(String var1);

    public int getSize() {
        return this.iSize;
    }

    public void setSize(int iSize) {
        this.iSize = iSize;
    }

    public String getName() {
        return this.stName;
    }

    public void setName(String stName) {
        this.stName = stName;
    }

}