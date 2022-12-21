package task2x9;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Card[] pack = new Card[54];
        for(int i = 1; i < 14; i++)
        {
            if ((i > 1) && (i < 11))
                pack[i] = new Card(String.valueOf(i), "Черви");
            else if (i == 1)
                pack[i] = new Card("Туз", "Черви");
            else if (i == 11)
                pack[i] = new Card("Валет", "Черви");
            else if (i == 12)
                pack[i] = new Card("Дама", "Черви");
            else if (i == 13)
                pack[i] = new Card("Король", "Черви");
        }
        for(int i = 1; i < 14; i++)
        {
            if ((i > 1) && (i < 11))
                pack[i + 13] = new Card(String.valueOf(i), "Бубны");
            else if (i == 1)
                pack[i + 13] = new Card("Туз", "Бубны");
            else if (i == 11)
                pack[i + 13] = new Card("Валет", "Бубны");
            else if (i == 12)
                pack[i + 13] = new Card("Дама", "Бубны");
            else if (i == 13)
                pack[i + 13] = new Card("Король", "Бубны");
        }
        for(int i = 1; i < 14; i++)
        {
            if ((i > 1) && (i < 11))
                pack[i + 26] = new Card(String.valueOf(i), "Крести");
            else if (i == 1)
                pack[i + 26] = new Card("Туз", "Крести");
            else if (i == 11)
                pack[i + 26] = new Card("Валет", "Крести");
            else if (i == 12)
                pack[i + 26] = new Card("Дама", "Крести");
            else if (i == 13)
                pack[i + 26] = new Card("Король", "Крести");
        }
        for(int i = 1; i < 14; i++)
        {
            if ((i > 1) && (i < 11))
                pack[i + 39] = new Card(String.valueOf(i), "Пики");
            else if (i == 1)
                pack[i + 39] = new Card("Туз", "Пики");
            else if (i == 11)
                pack[i + 39] = new Card("Валет", "Пики");
            else if (i == 12)
                pack[i + 39] = new Card("Дама", "Пики");
            else if (i == 13)
                pack[i + 39] = new Card("Король", "Пики");
        }
        pack[0] = new Card("Joker", "Красный");
        pack[53] = new Card("Joker", "Черный");

        Random random = new Random();
        for (int i = pack.length - 1; i > 0; --i) { //перетасовывание колоды
            int j = random.nextInt(i);
            Card tmp = pack[i];
            pack[i] = pack[j];
            pack[j] = tmp;
        }

        /*for(int i = 0; i < 54; i++) //вывод расположения карт в колоде
        {
            System.out.println(pack[i].getRank() + "  " + pack[i].getSuit());
        }*/

        Scanner source = new Scanner(System.in);
        System.out.println("Введите количество игроков");
        int n = source.nextInt();
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++)
                System.out.println(pack[i * 5 + j].getRank() + "  " + pack[i * 5 + j].getSuit());
            System.out.println("         ");
        }
    }
}
