package dev.unzor.crambot.Commands.Administration;

import dev.unzor.crambot.Utils.MemberUtil;
import dev.unzor.crambot.Utils.RandomColorUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Objects.Constants;
import dev.unzor.crambot.Objects.ICommand;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class KickCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        boolean kickeable = true;
        boolean hasPerms = false;
        String msg = event.getMessage().getContentRaw();
        String msg3 = "";
        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                hasPerms = true;

            }
        }
        if (hasPerms) {

            if (msg.startsWith("$kick ")) {
                String msg2 = event.getMessage().getContentRaw().replace("<", "").replace(">", "").replace("@", "").replace("!", "").replace("$kick ", "");

                if (msg2.equals("758441764121608202")) {    /*  Unzor   */
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setTitle("No tienes permiso para kickear a este usuario");
                    embed.setColor(Color.RED);
                    kickeable = false;
                    event.getChannel().sendMessage(embed.build()).queue();
                }
                if (msg2.equals("697040773203623976")) {    /*  Cobble  */
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setTitle("No tienes permiso para kickear a este usuario");
                    embed.setColor(Color.RED);
                    kickeable = false;
                    event.getChannel().sendMessage(embed.build()).queue();
                }
                if (msg2.equals("512347088210886659")) {    /*  Empa    */
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setTitle("No tienes permiso para kickear a este usuario");
                    embed.setColor(Color.RED);
                    kickeable = false;
                    event.getChannel().sendMessage(embed.build()).queue();
                }
                if (msg2.equals("315214772347863041")) {    /*  Omega   */
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setTitle("No tienes permiso para kickear a este usuario");
                    embed.setColor(Color.RED);
                    kickeable = false;
                    event.getChannel().sendMessage(embed.build()).queue();
                }
                if (msg2.equals("573138159391735819")) {     /*  0na */
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setTitle("No tienes permiso para kickear a este usuario");
                    embed.setColor(Color.RED);
                    kickeable = false;
                    event.getChannel().sendMessage(embed.build()).queue();
                }
                if (kickeable) {
                    event.getGuild().kick(msg3).queue();
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setTitle("Usuario kickeado");
                    embed.setDescription("Kickeado por: " + event.getMessage().getAuthor().getName());
                    embed.setImage("https://cdn.discordapp.com/attachments/540190819240378388/875434852135084043/logo-kick_1308-30806.jpg");
                    embed.setColor(RandomColorUtil.getRandomColor());
                    event.getChannel().sendMessage(embed.build()).queue();
                }
                kickeable = true;
            }
        }
    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "kick";
    }

}
