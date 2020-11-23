package org.itstep.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        HelpCommand help = new HelpCommand();
        NowCommand now = new NowCommand();
        EchoCommand echo = new EchoCommand();
        ExitCommand exit = new ExitCommand();

        Map<String, Command> map = new HashMap<String,Command>();

        map.put("help",help);
        map.put("now",now);
        map.put("echo",echo);
        map.put("exit",exit);

        Scanner in = new Scanner(System.in);
        String command = in.nextLine();

        if(command.contains("echo")) {
            map.get("echo").execute(command);
        }
        else {
            for(Map.Entry<String, Command> item : map.entrySet()){
                if(item.getKey().equals(command)) {
                    item.getValue().execute();
                }
            }
        }
    }
}
