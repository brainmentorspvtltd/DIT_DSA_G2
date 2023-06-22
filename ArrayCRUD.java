package Arrays;

public class ArrayCRUD {
    int arr[];
    int currentSize;

    ArrayCRUD(int n) {
        this.arr = new int[n];
        this.currentSize = 0;
    }

    void insert(int index, int item) {
        if(index > currentSize) {
            System.out.println("Index cannot be greater than current size...");
            return;
        }
        // Shift elements
        for(int i = currentSize-1; i >= index; i--) {
            arr[i+1] = arr[i];
        }

        arr[index] = item;
        currentSize++;
    }

    void delete(int index) {
        if(currentSize == 0) {
            System.out.println("Array is empty...Cannot delete elements");
            return;
        }
        for(int i = index; i < currentSize - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[currentSize-1] = 0;
        currentSize--;
    }

    void search() {

    }

    void update() {

    }

    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
    public static void main(String[] args) {
        ArrayCRUD obj = new ArrayCRUD(5);
        obj.insert(0, 3);
        obj.insert(1, 6);
        obj.insert(2, 9);
        obj.insert(1, 7);
        obj.print();
    }
}
