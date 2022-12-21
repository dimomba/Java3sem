package task4x4;

public class Computer {
    private Name name;
    private Processor CPU;
    private Memory RAM;
    private Monitor monitor;
    public Computer(Name name, Processor CPU, Memory RAM, Monitor monitor)
    {
        this.name = name;
        this.CPU = CPU;
        this.RAM = RAM;
        this.monitor = monitor;
    }
    public Name getName() {
        return name;
    }

    public Memory getRAM() {
        return RAM;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getCPU() {
        return CPU;
    }
}
