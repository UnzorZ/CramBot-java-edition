package org.zispanos.zbBot.Objects;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public interface ICommand {

    //Interface used in all bot commands

    void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException, ExecutionException;

    /*
    Used in org.zispanos.zbBot.Commands.Misc
    Describe command functionality
    */

    String getHelp();

    /*
    Invoke is the command itself.
    Make sure invoke's return is on lowercase
    */

    String getInvoke();

}
