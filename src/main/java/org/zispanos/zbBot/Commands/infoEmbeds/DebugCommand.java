package org.zispanos.zbBot.Commands.infoEmbeds;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.List;

import static org.zispanos.zbBot.Objects.Constants.english;

public class DebugCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        if (english==false) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Esto es un test");
            embed.setDescription("Esto es otro test");
            event.getChannel().sendMessage(embed.build()).queue();
        }
        if (english==true) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("This is a test");
            embed.setDescription("This is another test");
            event.getChannel().sendMessage(embed.build()).queue();
        }
    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "test";
    }

}
