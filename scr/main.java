public class Main{
    public static void main(String[] args){
        var __version__ = "0.0.01";
        System.out.println("Starting Dsa Terminal. . .");
        System.out.println("(C) 2020 Dsa Terminal v" + __version__);
        while (true){
            var cmd = "";
            if (cmd == "exit"){
                System.out.println("Exiting Dsa Terminal. . . .");
                break;
            }
            else if (cmd == "help"){
                System.out.println("Dsa Terminal Help:");
                System.out.println("Command:           Description:");
                System.out.println("exit               Exit of Dsa Terminal");
                System.out.println("help               Help");
            }
            else{
                System.out.println(cmd + ": Command not found!");
            }
        }
    }
}
