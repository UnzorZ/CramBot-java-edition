package dev.unzor.crambot.Commands.Administration;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Objects.Constants;
import dev.unzor.crambot.Objects.ICommand;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class PinCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException, ExecutionException {
        Long msg = Long.valueOf(event.getMessage().getContentRaw().replace(Constants.PREFIX + "pin", ""));
        System.out.println(msg);
        event.getChannel().pinMessageById(msg).queue();

    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "pin";
    }
}
