package dev.unzor.crambot.Commands.Misc;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Utils.FactsUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class PenisCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {
        EmbedBuilder embed = new EmbedBuilder();


        embed.setDescription(FactsUtil.getPenis());
        embed.setAuthor(event.getAuthor().getAsTag(), "https://www.youtube.com/watch?v=dQw4w9WgXcQ", event.getAuthor().getAvatarUrl());
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

