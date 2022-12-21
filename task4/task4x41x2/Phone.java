package task4x41x2;

import java.util.Scanner;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(){}
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public int getWeight() {
        return weight;
    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ", номер телефона: " + number);
    }
    public void sendMessage(String s) {
        String list = "";
        while(!s.equals("send"))
        {
            list = list + " " + s;
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
        }
        System.out.println("Номера телефонов, которым будет отправлено сообщение:" + list);
    }
    @Override
    public String toString() {
        return "Phone {Number: " + getNumber() + ", Model: " + getModel() + ", Weight: " + getWeight() + "}";
    }
}
