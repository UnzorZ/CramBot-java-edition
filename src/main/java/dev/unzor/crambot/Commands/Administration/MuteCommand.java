package dev.unzor.crambot.Commands.Administration;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MuteCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException, ExecutionException {

        Member target = event.getMessage().getMentionedMembers().get(0);
        User author = event.getAuthor();




    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "mute";
    }
}
