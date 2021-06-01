package org.zispanos.zbBot.Commands.C2b2t;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.UrlReaderUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class SeenCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException{
        if (args.isEmpty()) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Seen command");
            embed.setDescription("No estas usando un nombre! Uso !seen {username}");
            embed.setFooter("Thanks to api.2b2t.dev");
            embed.setThumbnail("https://media.discordapp.net/attachments/536634684101361675/828792326612058202/2bcramfondo.png");
            event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
        } else {
            String username = String.join("", args);
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            String result = UrlReaderUtil.readStringFromURL("https://api.2b2t.dev/seen?username=" + username);
            if (result.equals("[]")) {
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Seen Command");
                embed.setDescription(username + " No es un nombre de usuario correcto o nunca ha jugado 2b2t");
                embed.setColor(Color.BLACK);
                embed.setFooter("Thanks to api.2b2t.dev");
                embed.setThumbnail("https://media.discordapp.net/attachments/536634684101361675/828792326612058202/2bcramfondo.png");
                event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
            } else {
                String replaced = result.replaceAll("\"[A-z]+\":", "");
                String repl = replaced.replace("{", "").replace("}", "");
                String repl3 = repl.replaceAll("\"", "");
                String seen = repl3.replace("]", "").replace("[","");

                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Seen command");
                embed.addField(username + " ha sido visto por ultima vez el: ", seen, false);
                embed.setFooter("Thanks to api.2b2t.dev");
                embed.setThumbnail("https://media.discordapp.net/attachments/536634684101361675/828792326612058202/2bcramfondo.png");
                event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());


            }
        }
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "seen";
    }
}
