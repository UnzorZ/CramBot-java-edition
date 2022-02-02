package dev.unzor.crambot.Commands.Misc;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.io.IOException;
import java.util.List;


public class UnzorCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        event.getChannel().sendMessage("https://cdn.discordapp.com/attachments/536833489744429057/837368104853307402/YouCut_20210305_232251525.mp4").queue();

    }

    @Override
    public String getHelp() {
        return "unzor";
    }

    @Override
    public String getInvoke() {
        return "unzor";
    }
}