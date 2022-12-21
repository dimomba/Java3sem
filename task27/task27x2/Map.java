package task27x2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Map {
    java.util.Map<String, ArrayList<String>> map = new HashMap();


    public void add(String key, String value) {
        ArrayList tempList = null;
        if (this.map.containsKey(key)) {
            tempList = (ArrayList)this.map.get(key);
            if (tempList == null) {
                tempList = new ArrayList();
            }

            tempList.add(value);
        } else {
            tempList = new ArrayList();
            tempList.add(value);
        }

        this.map.put(key, tempList);
    }

    public HashMap<String, ArrayList<String>> createMap() {
        return (HashMap)this.map;
    }

    public int getSameFirstNameCount() {
        int count = 0;
        Iterator var2 = this.map.entrySet().iterator();

        while(var2.hasNext()) {
            java.util.Map.Entry<String, ArrayList<String>> item = (java.util.Map.Entry)var2.next();
            if (((ArrayList)item.getValue()).size() > 1) {
                count += ((ArrayList)item.getValue()).size();
            }
        }

        return count;
    }

    public int getSameLastNameCount() {
        java.util.Map<String, Integer> tmp = new HashMap();
        Iterator var2 = this.map.entrySet().iterator();

        while(var2.hasNext()) {
            java.util.Map.Entry<String, ArrayList<String>> item = (java.util.Map.Entry)var2.next();
            Iterator var4 = ((ArrayList)item.getValue()).iterator();

            while(var4.hasNext()) {
                String name = (String)var4.next();
                if (tmp.containsKey(name)) {
                    tmp.replace(name, (Integer)tmp.get(name) + 1);
                } else {
                    tmp.put(name, 1);
                }
            }
        }

        int count = 0;
        Iterator var7 = tmp.entrySet().iterator();

        while(var7.hasNext()) {
            java.util.Map.Entry<String, Integer> item = (java.util.Map.Entry)var7.next();
            if ((Integer)item.getValue() > 1) {
                count += (Integer)item.getValue();
            }
        }

        return count;
    }
}
