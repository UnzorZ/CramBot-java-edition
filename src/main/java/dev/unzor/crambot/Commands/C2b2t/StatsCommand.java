package dev.unzor.crambot.Commands.C2b2t;

import dev.unzor.crambot.Utils.UrlReaderUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Objects.ICommand;

import java.io.IOException;
import java.util.List;

public class StatsCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException{
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        if (args.isEmpty()) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Stats command");
            embed.setDescription("No estas dando un nombre de usuario correcto! Uso !stats {username}");
            embed.setFooter("Thanks to api.2b2t.dev");
            embed.setThumbnail("https://media.discordapp.net/attachments/536634684101361675/828792326612058202/2bcramfondo.png");
            event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
        } else {
            String username = String.join("", args);
            String result = UrlReaderUtil.readStringFromURL("https://api.2b2t.dev/stats?username=" + username);
            if (result.equals("[]")) {
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("2b2t Stats");
                embed.setDescription(username + " Nombre de usuario no valido o nunca ha jugado 2b2t");
                embed.setFooter("Thanks to api.2b2t.dev");
                embed.setThumbnail("https://media.discordapp.net/attachments/536634684101361675/828792326612058202/2bcramfondo.png");
                event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
            } else {
                String seenresult = UrlReaderUtil.readStringFromURL("https://api.2b2t.dev/seen?username=" + username);
                String sreplaced = seenresult.replaceAll("\"[A-z]+\":", "");
                String srepl = sreplaced.replace("{", "");
                String srepl2 = srepl.replace("}", "");
                String srepl3 = srepl2.replaceAll("\"", "");
                String srepl4 = srepl3.replace("[", "");
                String seen = srepl4.replace("]", "");

                String replaced = result.replaceAll("\"[A-z]+\"", "");
                String replacedf = replaced.replace(":", "");
                String repl = replacedf.replace("{", "");
                String repl2 = repl.replace("}", "");
                String[] array = UrlReaderUtil.StringArrayToArray(repl2);
                String deaths = array[array.length - 4];
                String kills = array[array.length - 5];
                String joins = array[array.length - 3];
                String leaves = array[array.length - 2];
                String uuid = array[array.length - 6];
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle(username + " 2b2t Stats");
                embed.addField("Muertes:", deaths, true);
                embed.addField("Asesinatos:", kills, true);
                embed.addBlankField(false);
                embed.addField("Veces que ha entrado:", joins, true);
                embed.addField("Veces que ha salido:", leaves, true);
                embed.addField("UUID: ", uuid, false);
                embed.addField("Ultima vez visto:",seen,false);
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
        return "stats";
    }
}
