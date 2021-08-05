package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.List;

public class SayCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        String msg = event.getMessage().getContentRaw();
        if (msg.startsWith("$say ".toLowerCase())) {
            event.getChannel().sendMessage(msg.replace("$say ", "")).queue();
        }

    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "say";
    }

}
