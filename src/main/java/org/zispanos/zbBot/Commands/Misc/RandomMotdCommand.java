package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.FactsUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class RandomMotdCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {
        EmbedBuilder embed = new EmbedBuilder();

        embed.setTitle("Random motd");
        embed.setDescription(FactsUtil.getrandommotd());
        embed.setColor(Color.GRAY);
        event.getChannel().sendMessage(embed.build()).queue();
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "asd";
    }
}
