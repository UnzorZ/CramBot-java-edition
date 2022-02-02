package dev.unzor.crambot.Commands.Misc;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ServerInfoCommand implements ICommand {


    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        Date time = new Date();
        int colorrole = Objects.requireNonNull(event.getMember()).getColorRaw();


        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("**SERVER INFO**");
        embed.setAuthor(event.getGuild().getName(), event.getGuild().getVanityUrl(), event.getGuild().getIconUrl());
        embed.addField("Fecha de creación", String.valueOf(event.getGuild().getTimeCreated()), true);
        embed.addField("Región", String.valueOf(event.getGuild().getRegion()), true);
        embed.addField("Dueño", "<@" + String.valueOf(event.getGuild().getOwnerId() + ">"), true);
        embed.addField("Miembros", String.valueOf(event.getGuild().getMemberCount()), true);
        embed.addField("Boosts", String.valueOf(event.getGuild().getBoostCount()),true);
        embed.addField("Nivel de verificación", String.valueOf(event.getGuild().getVerificationLevel()), true);
        embed.setFooter("Crambot • Server ID: " + event.getGuild().getId() + " • " + time, event.getGuild().getIconUrl());
        embed.setColor(colorrole);
        event.getChannel().sendMessage(embed.build()).queue();
        //debug
        //System.out.println(role);
    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "si";
    }
}
