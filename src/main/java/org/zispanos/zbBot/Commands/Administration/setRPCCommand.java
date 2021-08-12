package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.PrioqUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class setRPCCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        int colorrole = Objects.requireNonNull(event.getMember()).getColorRaw();
        JDA jda = event.getJDA();
        boolean permissions = false;
        String msg = event.getMessage().getContentRaw();

        if (event.getMember().getId().equals("758441764121608202")) {       /*  Unzor   */
            permissions = true;
        }
        if (event.getMember().getId().equals("697040773203623976")) {       /*  Cobble   */
            permissions = true;
        }
        if (event.getMember().getId().equals("512347088210886659")) {       /*  Empa    */
            permissions = true;
        }
        if (event.getMember().getId().equals("315214772347863041")) {       /*  Omega   */
            permissions = true;
        }

        if (permissions==false) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No tienes permiso para ejecutar este comando");
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
        }


        if (permissions==true) {

            if (msg.startsWith("$rpc ")) {
                String contenido = msg.replace("$rpc ", "");
                //System.out.println(contenido);
                jda.getPresence().setActivity(Activity.playing(contenido));

                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Mi rpc ha cambiado");
                embed.setDescription("Ahora mi rpc es: " + contenido);
                embed.setFooter(event.getAuthor().getName() + " me ha obligado a cambiar mi rpc 😭", event.getAuthor().getAvatarUrl());
                embed.setColor(colorrole);
                event.getChannel().sendMessage(embed.build()).queue();
            }


        }
    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "rpc";
    }

}
