package task2x4;

public class TestShop {
    public static void main(String[] args) {
        Shop PCs = new Shop();
        PCs.print();
        PCs.addPC();
        PCs.print();
        PCs.deletePC();
        PCs.print();
        PCs.searchPC();
    }
}
