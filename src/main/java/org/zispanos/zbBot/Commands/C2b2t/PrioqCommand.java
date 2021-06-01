package org.zispanos.zbBot.Commands.C2b2t;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.PrioqUtil;

import java.io.IOException;
import java.util.List;

public class PrioqCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException{

        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();


            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Prio Queue status");
            embed.addField("Cola:", PrioqUtil.getPrioqNumber(),true);
            embed.addField("Tiempo estimado:",PrioqUtil.getPrioqTime(),true);
            embed.setFooter("Thanks to api.2b2t.dev");
            embed.setThumbnail("https://media.discordapp.net/attachments/536634684101361675/828792326612058202/2bcramfondo.png");
            event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());



    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "prioq";
    }
}
