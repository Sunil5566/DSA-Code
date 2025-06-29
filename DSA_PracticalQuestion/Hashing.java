public class Hashing {
    static int[] table = new int[10];

    static int hash(int key) {
        return key % table.length;
    }

    static void insert(int key) {
        int index = hash(key);
        while (table[index] != 0) {
            index = (index + 1) % table.length;
        }
        table[index] = key;
    }

    static void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < table.length; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }

    public static void main(String[] args) {
        insert(5);
        insert(15);
        insert(25);
        insert(35);
        display();
    }
}
