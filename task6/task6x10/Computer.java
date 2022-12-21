package task6x10;

import java.util.Scanner;

class Computer implements CompInterface
{
    private enum namePC
    {
        Asus,
        Lenovo,
        HP,
        Acer
    }
    Memory memory = new Memory();
    Monitor monitor = new Monitor();
    Processor processor = new Processor();
    private Scanner sc = new Scanner(System.in);

    String name;
    public Computer(){}

    @Override
    public void addComputer()
    {
        System.out.print("Введите название процессора: ");
        processor.setName(sc.nextLine());
        System.out.print("Введите частоту процессора: ");
        processor.setRate(sc.nextDouble());
        sc.nextLine();

        System.out.print("Введите диагональ монитора: ");
        monitor.setSize(sc.nextDouble());
        System.out.print("Введите частоту обновления монитора: ");
        monitor.setRate(sc.nextInt());
        sc.nextLine();

        System.out.print("Введите объем оперативной памяти: ");
        memory.setCapacity(sc.nextInt());
        System.out.print("Введите частоту оперативной памяти: ");
        memory.setRate(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void chooseName()
    {
        int i = 1, c = 0;
        System.out.println("Выберите название компьютера:");
        for (namePC namepc : namePC.values()) {
            System.out.println(i + ". " + namepc.toString());
            i++;
        }
        c = sc.nextInt();

        i = 0;
        for (namePC namepc : namePC.values()) {
            i++;
            if(c == i) {
                name = namepc.toString();
                break;
            }
        }
    }

    @Override
    public String toString()
    {
        return "Компьютер: " + name + "\n" + processor.toString() + "\n" + memory.toString() + "\n" + monitor.toString();
    }
}
