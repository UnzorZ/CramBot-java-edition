package dev.unzor.crambot.Commands.C2b2t;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Objects.ICommand;

import java.io.IOException;
import java.util.List;

public class TabCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException{
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        EmbedBuilder embed = new EmbedBuilder();
        embed.setImage("https://tab.2b2t.dev/");
        embed.setTitle("2b2t Tab");
        embed.setFooter("Thanks to 2b2t.dev","https://media.discordapp.net/attachments/536634684101361675/828792326612058202/2bcramfondo.png");
        event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());

    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "tab";
    }
}
