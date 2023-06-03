package Recursion;

public class CallStack {

    void func_1() {
        System.out.println("This is function_1");
    }

    void func_2() {
        func_1();
        System.out.println("This is function_2");
    }

    void func_3() {
        func_2();
        System.out.println("This is function_3");
    }

    public static void main(String[] args) {
        CallStack obj = new CallStack();
        obj.func_3();
    }
}