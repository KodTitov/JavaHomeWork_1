package org.itstep.command;

import org.itstep.command.Command;

public class NowCommand implements Command {
    @Override
    public void execute(String... args) {
        System.out.println(System.currentTimeMillis());
    }
}
