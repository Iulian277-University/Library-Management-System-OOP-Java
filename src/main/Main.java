package main;
import fileio.ProcessInput;

/** This is class is the entry point of the program */
public class Main {
    public static void main(String[] args) {

        // Process all input files, create and link entities and store the data in objects
        ProcessInput.processInput();

        // Testcases
        Test.runTestCases();
    }
}
