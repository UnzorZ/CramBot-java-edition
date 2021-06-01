package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.List;


public class CramCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        event.getChannel().sendMessage("https://cdn.discordapp.com/attachments/536833489744429057/837367910979600384/ASI_SIGUE_SIENDO_MRCRAM_2_1.mp4").queue();

    }

    @Override
    public String getHelp() {
        return "unzor";
    }

    @Override
    public String getInvoke() {
        return "cram";
    }
}