package task26x3;

public class Item {
    int Key;
    String value;
    Item next = null;

    Item(int iKey, String value) {
        this.Key = iKey;
        this.value = value;
    }

    public void addNext(Item next) {
        this.next = next;
    }

    public String toString() {
        return "Item: " + this.Key + " " + this.value;
    }
}
