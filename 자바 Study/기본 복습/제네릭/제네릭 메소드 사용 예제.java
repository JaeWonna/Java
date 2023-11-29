package java_package;

class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public K getKey(){
        return key;
    }

    public void setValue(V value){
        this.value = value;
    }

    public V getValue(){
        return value;
    }
}

class Util {
    public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
        boolean keyCompare, valueCompare;

        keyCompare = p1.getKey().equals(p2.getKey());
        valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}

public class practice {
    public static void main(String[] args){
        Pair<String, Integer> p1 = new Pair<String, Integer>("coco",26);
        Pair<String, Integer> p2 = new Pair<>("coco",26);
        boolean result = Util.compare(p1,p2);
        System.out.println(result);
    }
}







