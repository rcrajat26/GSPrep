package dataStructures;

import dataStructures.utility.Entity;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

public class HashMap {

    int capacity = 16;
    LinkedList<Entity>[] buckets;
    public HashMap() {
        buckets = new LinkedList[capacity];
    }

    public boolean containsKey(String key) {
        boolean hasKey = false;
        int bucket = key.hashCode()%(capacity-1);
        LinkedList<Entity> list = buckets[bucket];
        if(list == null){
            return false;
        }
        for(Entity e:list) {
            if (e.getKey() == key) {
                hasKey =true;
            }
        }
        return hasKey;
    }

    public void put(String key, String value) {
        int hash = key.hashCode();
        int bucket = hash%(capacity-1);

        Entity entity = new Entity(key,value);
        if(buckets[bucket] == null) {
            buckets[bucket] = new LinkedList<>();
        }

        if(containsKey(key)) {
            for(Entity e:buckets[bucket]) {
                if(e.getKey()==key) {
                    e.setValue(value);
                    return;
                }
            }
        }
        buckets[bucket].add(entity);
    }
    public String get(String key) {
        int hash = key.hashCode();
        int bucket = hash%(capacity-1);

        String val=null;

        for(Entity e:buckets[bucket]) {
            if(e.getKey()==key) {
                val = e.getValue();
            }
        }

        return val;
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("A","init A");
        System.out.println(map.get("A"));
        map.put("B","init B");
        System.out.println(map.get("B"));
        map.put("A","update A");
        System.out.println(map.get("A"));
        map.put("C","init C");
        System.out.println(map.get("C"));
    }
}
