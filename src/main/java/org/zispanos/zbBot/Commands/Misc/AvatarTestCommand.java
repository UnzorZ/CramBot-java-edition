package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Locale;


public class AvatarTestCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        User author = event.getAuthor();
        String msg = event.getMessage().getContentRaw();

        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        if (msg.contains("av".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed22 = new EmbedBuilder();
            embed22.setTitle("Avatar from " + author.getName());
            embed22.setImage(event.getAuthor().getEffectiveAvatarUrl());
            embed22.setColor(Color.RED);
            event.getChannel().sendMessage(embed22.build()).queue();
            return;
        }
    }

    @Override
    public String getHelp() {
        return "unzor";
    }

    @Override
    public String getInvoke() {
        return "av";
    }
}