package ayse_working.GroupMeeting.week9.memory_management_example;


public class MemoryManagementExample {
    public static void main(String[] args) {
        // Stack memory example
        int x = 5; // Variable 'x' is stored on the stack

        // Heap memory example
        MyClass obj = new MyClass(); // An object of MyClass is created in the heap
        obj.setData(10);

        // The 'obj' reference variable is stored on the stack, pointing to the object in the heap

        // ... rest of the program ...

        // The garbage collector will automatically reclaim memory when 'obj' is no longer reachable
    }
}

