package dev.unzor.crambot.Commands.Administration;

import dev.unzor.crambot.Objects.Constants;
import dev.unzor.crambot.Objects.ICommand;
import dev.unzor.crambot.Utils.MemberUtil;
import dev.unzor.crambot.Utils.RandomColorUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class BanCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        boolean baneable = true;
        boolean hasPerms = false;
        String msg = event.getMessage().getContentRaw();

        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                hasPerms = true;

            }
        }
        if (hasPerms) {
            if (event.getGuild().getId().equals("432645641441640448")) {

                if (msg.startsWith("$ban ")) {

                    String msg2 = event.getMessage().getContentRaw().replace("<", "").replace(">", "").replace("@", "").replace("!", "").replace("$ban ", "");

                    if (msg2.equals("758441764121608202")) {    /*  Unzor   */
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("No tienes permiso para banear a este usuario");
                        embed.setColor(Color.RED);
                        baneable = false;
                        event.getChannel().sendMessage(embed.build()).queue();
                    }
                    if (msg2.equals("697040773203623976")) {    /*  Cobble  */
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("No tienes permiso para banear a este usuario");
                        embed.setColor(Color.RED);
                        baneable = false;
                        event.getChannel().sendMessage(embed.build()).queue();
                    }
                    if (msg2.equals("512347088210886659")) {    /*  Empa    */
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("No tienes permiso para banear a este usuario");
                        embed.setColor(Color.RED);
                        baneable = false;
                        event.getChannel().sendMessage(embed.build()).queue();
                    }
                    if (msg2.equals("315214772347863041")) {    /*  Omega   */
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("No tienes permiso para banear a este usuario");
                        embed.setColor(Color.RED);
                        baneable = false;
                        event.getChannel().sendMessage(embed.build()).queue();
                    }
                    if (msg2.equals("573138159391735819")) {     /*  0na */
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("No tienes permiso para banear a este usuario");
                        embed.setColor(Color.RED);
                        baneable = false;
                        event.getChannel().sendMessage(embed.build()).queue();
                    }
                    if (baneable) {
                        event.getGuild().ban(msg2, 0, "ban command").queue();
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("Usuario baneado");
                        embed.setDescription("Baneado por: " + event.getMessage().getAuthor().getName());
                        embed.setImage("https://cdn.discordapp.com/attachments/537614559784206340/875420303075966996/depositphotos_11528485-stock-photo-red-ban-button-and-hand.jpg");
                        embed.setColor(RandomColorUtil.getRandomColor());
                        event.getChannel().sendMessage(embed.build()).queue();
                    }
                    baneable = true;
                }
            }
        }
    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "ban";
    }

}
