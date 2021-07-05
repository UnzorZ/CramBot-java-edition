package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.FactsUtil;

import javax.management.relation.Role;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class PenisCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {
        EmbedBuilder embed = new EmbedBuilder();

        embed.setTitle("Penis");
        embed.setDescription(FactsUtil.getPenis());
        embed.setFooter("Preguntado por: " + event.getAuthor().getName(), event.getGuild().getIconUrl());
        embed.setColor(Color.pink);
        event.getChannel().sendMessage(embed.build()).queue();
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "penis";
    }
}

