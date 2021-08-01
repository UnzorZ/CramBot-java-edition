package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.MemberUtil;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public class ShutdownCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event){
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();

        boolean hasPerms = false;
        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {
                hasPerms = true;
            }
        }

                if (!hasPerms){
                    EmbedBuilder noperms = new EmbedBuilder();
                    noperms.setTitle("Looks like you dont have perms to do this");
                    noperms.setColor(Color.RED);
                    noperms.setFooter("Ooops " + event.getAuthor().getName() + " Doesent have perms to shutdown the bot");
                    noperms.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                    event.getChannel().sendMessage(noperms.build()).queue(message -> message.addReaction("🗑️").queue());

                }else{
                    Float id= 432645641441640448;
                    if (event.getGuild().getIdLong(equals(id)))
                    EmbedBuilder ShutdownEB = new EmbedBuilder();
                    ShutdownEB.setTitle("Shutting down ");
                    ShutdownEB.setColor(Color.orange);
                    ShutdownEB.setFooter("The bot got Backdoored", event.getAuthor().getAvatarUrl());
                    ShutdownEB.setDescription("Looks like " + event.getAuthor().getName() + " ended the party for today \uD83D\uDE2D");
                    event.getChannel().sendMessage(ShutdownEB.build()).queue(message -> message.addReaction("🗑️").queue());
                    shutdown(event.getJDA());


                }
            }






    private void shutdown(JDA jda) {
        jda.shutdown();
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
