package dev.unzor.crambot.Commands.Administration;

import dev.unzor.crambot.Objects.ICommand;
import dev.unzor.crambot.Utils.SQLite;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;
import java.util.List;

public class ShutdownCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) {
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        boolean permissions = false;

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

        if (permissions == false) {
            EmbedBuilder noperms = new EmbedBuilder();
            noperms.setTitle("Looks like you dont have perms to do this");
            noperms.setColor(Color.RED);
            noperms.setFooter("Ooops " + event.getAuthor().getName() + " Doesent have perms to shutdown the bot");
            noperms.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
            event.getChannel().sendMessage(noperms.build()).queue(message -> message.addReaction("🗑️").queue());

        } else {
            if (event.getGuild().getId().equals("432645641441640448")) {
                EmbedBuilder ShutdownEB = new EmbedBuilder();
                ShutdownEB.setTitle("Shutting down ");
                ShutdownEB.setColor(Color.orange);
                ShutdownEB.setFooter("The bot got Backdoored", event.getAuthor().getAvatarUrl());
                ShutdownEB.setDescription("Looks like " + event.getAuthor().getName() + " ended the party for today \uD83D\uDE2D");
                event.getChannel().sendMessage(ShutdownEB.build()).queue(message -> message.addReaction("").queue());
                shutdown(event.getJDA());
            }
        }
    }

    private void shutdown(JDA jda) {
        jda.shutdown();
        SQLite.close();
        System.exit(0);
    }

    @Override
    public String getHelp() {
        return "Stops the bot";
    }

    @Override
    public String getInvoke() {
        return "shutdown";
    }
}
