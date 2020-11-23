package org.itstep.command;

import org.itstep.command.Command;

public class ExitCommand implements Command {
    @Override
    public void execute(String... args) {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
