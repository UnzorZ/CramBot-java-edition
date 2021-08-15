package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.FactsUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class FurryNSFWCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {

        if (event.getChannel().isNSFW()) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setImage(FactsUtil.getFurrynsfw());
            embed.setAuthor(event.getAuthor().getAsTag(), "https://www.youtube.com/watch?v=dQw4w9WgXcQ", event.getAuthor().getAvatarUrl());
            embed.setColor(Color.pink);
            event.getChannel().sendMessage(embed.build()).queue();
        }else {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Solo puedes ejecutar este comando en un canal nsfw");
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
        }



    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "furrynsfw";
    }
}

