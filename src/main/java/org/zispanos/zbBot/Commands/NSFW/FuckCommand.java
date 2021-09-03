package org.zispanos.zbBot.Commands.NSFW;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.FactsUtil;
import org.zispanos.zbBot.Utils.RandomColorUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class FuckCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {

        Member name = event.getMessage().getMentionedMembers().get(0);


        if (event.getChannel().isNSFW()) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setDescription("**" + event.getAuthor().getName() + "** se folló a **" + name.getUser().getName() + "**...");
            embed.setImage(FactsUtil.getFuck());
            embed.setAuthor(event.getAuthor().getAsTag(), "https://www.youtube.com/watch?v=dQw4w9WgXcQ", event.getAuthor().getAvatarUrl());
            embed.setColor(RandomColorUtil.getRandomColor());
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
        return "fuck";
    }
}

