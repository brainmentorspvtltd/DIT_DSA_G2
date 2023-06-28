package Arrays;

import java.util.Scanner;

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

    int search(int value) {
        // Linear search
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        System.out.println("Element not found...");
        return -1;
    }

    void update(int valueToSearch, int valueToUpdate) {
        int index = search(valueToSearch);
        if(index == -1) {
            return;
        }
        else {
            arr[index] = valueToUpdate;
            System.out.println("Value Updated...");
            print();
        }
    }

    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
    public static void main(String[] args) {
        ArrayCRUD obj = new ArrayCRUD(5);
        // obj.insert(0, 3);
        // obj.insert(1, 6);
        // obj.insert(2, 9);
        // obj.insert(1, 7);
        // obj.print();
        // obj.update(7, 17);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("1. Insert a new element");
            System.out.println("2. Print");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    // int element = scanner.nextInt();
                    obj.insert(0, 10);
                    obj.insert(1, 20);
                    obj.insert(2, 30);
                    obj.insert(3, 40);
                    obj.insert(4, 50);
                    break;
                case 2:
                    obj.print();
                    break;
                case 3:
                    obj.search(15);
                    break;
                case 4:
                    obj.update(10, 100);
                    break;
                case 5:
                    obj.delete(2);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Choice...");
            }
        }
    }
}
