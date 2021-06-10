package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.List;


public class FurryCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        event.getChannel().sendMessage("https://tenor.com/view/jeramy-boyd-boyd-jeramy-bear-funny-gif-13137533").queue();

    }

    @Override
    public String getHelp() {
        return "furry";
    }

    @Override
    public String getInvoke() {
        return "furry";
    }
}