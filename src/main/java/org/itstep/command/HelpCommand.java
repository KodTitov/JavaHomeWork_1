package org.itstep.command;

import org.itstep.command.Command;

public class HelpCommand implements Command {

    @Override
    public void execute(String... args) {
        System.out.println("Help executed");
    }
}
