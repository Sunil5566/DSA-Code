import java.util.Scanner;

class DataItem {
    int key, data;
    DataItem(int key, int data) {
        this.key = key;
        this.data = data;
    }
}

public class LinearProbingHashTable {
    private static final int SIZE = 7;
    private DataItem[] table = new DataItem[SIZE];
    private final DataItem DUMMY = new DataItem(-1, -1);

    private int hash(int key) {
        return key % SIZE;
    }

    public void insert(int key, int data) {
        int i = hash(key), start = i;
        while (table[i] != null && table[i].key != -1) {
            i = (i + 1) % SIZE;
            if (i == start) {
                System.out.println("Table full. Cannot insert key " + key);
                return;
            }
        }
        table[i] = new DataItem(key, data);
    }

    public DataItem search(int key) {
        int i = hash(key), start = i;
        while (table[i] != null) {
            if (table[i].key == key) return table[i];
            i = (i + 1) % SIZE;
            if (i == start) break;
        }
        return null;
    }

    public DataItem delete(int key) {
        int i = hash(key), start = i;
        while (table[i] != null) {
            if (table[i].key == key) {
                DataItem temp = table[i];
                table[i] = DUMMY;
                return temp;
            }
            i = (i + 1) % SIZE;
            if (i == start) break;
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            if (table[i] == null) System.out.println("Index " + i + ": Empty");
            else if (table[i].key == -1) System.out.println("Index " + i + ": Deleted");
            else System.out.println("Index " + i + ": (" + table[i].key + ", " + table[i].data + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearProbingHashTable ht = new LinearProbingHashTable();

        int[] keys = {1, 8, 15, 22, 2};  // Keys chosen to show collisions
        int[] values = {10, 20, 30, 40, 50};
        for (int i = 0; i < keys.length; i++) ht.insert(keys[i], values[i]);

        ht.display();

        System.out.print("\nSearch key: ");
        int sKey = sc.nextInt();
        DataItem found = ht.search(sKey);
        System.out.println(found != null ? "Found: " + found.data : "Not found");

        System.out.print("Delete key: ");
        int dKey = sc.nextInt();
        DataItem deleted = ht.delete(dKey);
        System.out.println(deleted != null ? "Deleted: " + deleted.data : "Not found");

        ht.display();
        sc.close();
    }
}
