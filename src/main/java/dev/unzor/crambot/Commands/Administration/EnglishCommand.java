package dev.unzor.crambot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Objects.ICommand;

import java.io.IOException;
import java.util.List;

import static dev.unzor.crambot.Objects.Constants.english;

public class EnglishCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {



        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("The bot is now in english");
        english=true;
        event.getChannel().sendMessage(embed.build()).queue();
    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "english";
    }

}
