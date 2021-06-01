package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.List;


public class AmongusCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        event.getChannel().sendMessage("https://tenor.com/view/when-the-drip-is-sus-gif-19616035").queue();
        event.getChannel().sendMessage("sus").queue();

    }

    @Override
    public String getHelp() {
        return "unzor";
    }

    @Override
    public String getInvoke() {
        return "amongus";
    }
}