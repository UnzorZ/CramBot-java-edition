package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.FactsUtil;
import org.zispanos.zbBot.Utils.RandomColorUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class CramfagCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {
        EmbedBuilder embed = new EmbedBuilder();

        embed.setDescription(FactsUtil.getPorcentajes() + " Cramfag.");
        embed.setAuthor(event.getAuthor().getAsTag(), "https://www.youtube.com/watch?v=dQw4w9WgXcQ", event.getAuthor().getAvatarUrl());
        embed.setColor(RandomColorUtil.getRandomColor());
        event.getChannel().sendMessage(embed.build()).queue();
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "cramfag";
    }
}