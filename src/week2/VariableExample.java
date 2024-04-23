package week2;

public class VariableExample {
    // Step 3.1: Declare one instance and one static variable
    int instanceVariable = 10; // instance variable
    static int staticVariable = 20; // static variable

    // Step 3.2: Declare one instance method
    void instanceMethod() {
        // Step 3.4: Call both instance and static variables into the instance method
        System.out.println("Instance Method - Instance Variable: " + instanceVariable + ", Static Variable: " + staticVariable);
    }

    // Step 3.3: Declare one static method
    static void staticMethod() {
        // Step 3.4: Call both instance and static variables into the static method
        VariableExample obj = new VariableExample();
        System.out.println("Static Method - Instance Variable: " + obj.instanceVariable + ", Static Variable: " + staticVariable);
    }

    // Step 3.5: Declare the Main method
    public static void main(String[] args) {
        // Step 3.6: Call both instance and static methods into the Main method and run the program
        VariableExample obj = new VariableExample();
        obj.instanceMethod(); // calling instance method
        staticMethod(); // calling static method
    }
}

