package org.itstep.command;

import org.itstep.command.Command;

public class EchoCommand implements Command {

    @Override
    public void execute(String... args) {
        for(String str: args) {
            System.out.print(str + ' ');
        }
    }
}
