/*
    Dsa Terminal Android v0.0.01
    (C) 2020 Dsa Software Fundation, all directs reserved | Mit License
*/
public class main{
    // terminal Code
    public static void main(String[], args){
        // Version of Dsa Terminal
        var __version__ = "0.0.01";
        // Start of Dsa Terminal
        System.out.println("Starting Dsa Terminal. . .");
        System.out.println("(C) 2020 Dsa Terminal v" + __version__);
        // System of Terminal
        while (true)
        {
            // Command Prompt
            var cmd = "";
            // Exit of Dsa Terminal
            else if (cmd == "exit"){
                System.out.println("Exiting Dsa Terminal. . . .");
                break;
            }
            // Help
            if (cmd == "help"){
                System.out.println("Dsa Terminal Help:");
                System.out.println("Command:           Description:");
                System.out.println("exit               Exit of Dsa Terminal");
                System.out.println("help               Help");
            }
            // Command not found
            else{
                System.out.println(cmd + ": Command not found!");
            }
        }
    }
}
