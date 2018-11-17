package com.wlanboy.logbacktester;

import java.util.logging.Logger;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ShellCommands {
    
    private static final Logger logger = Logger.getLogger(ShellCommands.class.getCanonicalName());

    @ShellMethod("Log a String")
    public String log(
      @ShellOption(defaultValue = "Hello") String logtext
    ) {
      logger.info(logtext);
      return logtext;
    }    
}
