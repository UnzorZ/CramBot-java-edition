package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class InviteCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        int colorrole = Objects.requireNonNull(event.getMember()).getColorRaw();
        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("¡Invitame a tu servidor!");
        embed.setDescription("https://discord.com/api/oauth2/authorize?client_id=812711414212722719&permissions=8&scope=bot");
        embed.setFooter("Asked by: " + event.getAuthor().getName());
        embed.setThumbnail(event.getGuild().getIconUrl());
        embed.setColor(colorrole);
        event.getChannel().sendMessage(embed.build()).queue();

    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "invite";
    }

}
