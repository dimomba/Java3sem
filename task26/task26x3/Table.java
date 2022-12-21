package task26x3;

public class Table {
    int realSize;
    int currentSize;
    Item[] table;


    public Table() {
    }
    private Integer hashtabHash(int iKey) {
        return iKey % this.currentSize;
    }

    public void Table1() {
        this.realSize = 0;
        this.currentSize = 8;
        this.table = new Item[this.currentSize];
    }

    public void add(int key, String value) {
        int iPlace = this.hashtabHash(key);
        ++this.realSize;
        if ((double)this.realSize > (double)this.currentSize * 0.75)
        {
            this.hashtabResize(this.currentSize * 2);
        }

        if (this.table[iPlace] == null)
        {
            this.table[iPlace] = new Item(key, value);
        }
        else
        {
            Item tmp;
            for(tmp = this.table[iPlace]; tmp.next != null; tmp = tmp.next) {
            }

            tmp.addNext(new Item(key, value));
        }

    }

    public void delete(int key) {
        --this.realSize;
        int iPlace = this.hashtabHash(key);
        if (this.table[iPlace].Key == key) {
            this.table[iPlace] = this.table[iPlace].next == null ? null : this.table[iPlace].next;
        }
        else if (this.table[iPlace] != null)
        {
            Item tmp;
            for(tmp = this.table[iPlace]; tmp.next != null && tmp.next.Key != key; tmp = tmp.next) {
            }

            tmp.next = null;
        }

    }

    public Item find(int key) {
        Item res = this.table[this.hashtabHash(key)];
        if (res == null) {
            return null;
        } else if (res.Key == key) {
            return res;
        } else {
            while(res != null && res.Key != key) {
                res = res.next;
            }

            return res;
        }
    }

    private void hashtabResize(int newSize) {
        Item[] newTable = new Item[newSize];
        this.currentSize = newSize;
        Item[] var3 = this.table;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Item elem = var3[var5];
            if (elem != null) {
                int iPlace = this.hashtabHash(elem.Key);
                if (newTable[iPlace] == null) {
                    newTable[iPlace] = elem;
                } else
                {
                    Item tmp;
                    for(tmp = newTable[iPlace]; tmp.next != null; tmp = tmp.next) {
                    }

                    tmp.addNext(elem);
                }
            }
        }

        this.table = newTable;
    }

    public void show() {
        for(int i = 0; i < currentSize; i++) {
            System.out.println(i + "  " + table[i]);
        }
    }
    public Item getI(int i) {
        return table[i];
    }
    public String getIvalue(int i) {
        return table[i].value;
    }
}
