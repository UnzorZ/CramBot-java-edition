package dev.unzor.crambot.Commands.Misc;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Locale;


public class AvatarCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        User author = event.getAuthor();
        String msg = event.getMessage().getContentRaw();
        Member target = event.getMessage().getMentionedMembers().get(0);
        System.out.println("test");

        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
         if (msg.contains("av".toLowerCase(Locale.ROOT))) {
             event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
             EmbedBuilder embed22 = new EmbedBuilder();
             embed22.setTitle("Avatar from " + target.getEffectiveName());
             embed22.setDescription(target.getUser().getAsMention());
             embed22.setThumbnail(target.getUser().getAvatarUrl());
             embed22.setColor(Color.RED);
             event.getChannel().sendMessage(embed22.build()).queue();
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
