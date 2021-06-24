package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.FactsUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class DadJokeCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {
        EmbedBuilder embed = new EmbedBuilder();

        embed.setTitle("Dad Joke");
        embed.setDescription(FactsUtil.getDadJoke());
        embed.setFooter("Preguntado por: " + event.getAuthor().getName(), event.getGuild().getIconUrl());
        embed.setColor(Color.orange);
        event.getChannel().sendMessage(embed.build()).queue();
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "dadjoke";
    }
}