package task4x4;

public class Tester {
    public static void main(String[] args) {
        Processor CPU1 = new Processor("Intel", 2.7, 4);
        Processor CPU2 = new Processor("AMD", 3.2, 6);
        Processor CPU3 = new Processor("Intel", 3.7, 4);
        Memory RAM1 = new Memory("Kingston", 8, 2400);
        Memory RAM2 = new Memory("Samsung", 16, 2666);
        Memory RAM3 = new Memory("Corsair", 8, 3200);
        Monitor monitor1 = new Monitor("LG", 21.5, "IPS");
        Monitor monitor2 = new Monitor("HP", 24, "TN");
        Monitor monitor3 = new Monitor("AOC", 21.5, "VA");
        Computer[] arr = new Computer[3];
        arr[0] = new Computer(Name.HP, CPU1, RAM1, monitor1);
        arr[1] = new Computer(Name.ASUS, CPU2, RAM2, monitor2);
        arr[2] = new Computer(Name.DELL, CPU3, RAM3, monitor3);
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " + arr[i].getName() + ":");
            System.out.println(arr[i].getCPU() + "\n" + arr[i].getRAM() + "\n" + arr[i].getMonitor());
        }
    }
}
