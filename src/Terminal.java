// Dsa Terminal for Android
// (C) 2020 Dsa Software Fundation | Mit Licence
// Author: Felipe Souza Pereira Lima | Product Licensed
import bin.Database;

public interface Terminal {
    // Dsa Terminal Setup
    static void main(String[] args) {
        System.out.println("Starting Dsa Terminal. . .");
        System.out.println("(C) 2020 Dsa Terminal v0.0.1 Android");
        System.out.println("===========Dsa Terminal=============");
        // Command System
        while (true){
            try {
                // Prompt command
                var cmd = "1";
                // Exit System Dsa Terminal
                if (cmd == "exit") {
                    System.out.println("Exiting Dsa Terminal System. . .");
                    break;
                }
                // Help
                else if (cmd == "help") {
                    System.out.println("Dsa Terminal Help");
                    System.out.println("Command:             Function:");
                    System.out.println("help                 Call Help Function");
                    System.out.println("exit                 Exit System Dsa Terminal");
                }
                // Command not found Error
                else {
                    System.out.println(cmd + ": Command not found!");
                }
            } finally {
               continue;
            }
        }
    }
}
