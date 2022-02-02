package dev.unzor.crambot.Commands.Administration;

import dev.unzor.crambot.Objects.Constants;
import dev.unzor.crambot.Objects.ICommand;
import dev.unzor.crambot.Utils.MemberUtil;
import dev.unzor.crambot.Utils.PrioqUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class QueuePeekCommand implements ICommand {

    boolean active = false;
    boolean hasPerms;
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                hasPerms = true;

            }
        }
        if (hasPerms) {
            JDA jda = event.getJDA();
            Thread t1 = new Thread() {
                {
                    Timer timer = new Timer();
                    TimerTask updateTask = new TimerTask() {

                        @Override
                        public void run() {

                            try {
                                if (active) {
                                    jda.getPresence().setActivity(Activity.playing("PrioQ peek: " + PrioqUtil.getPrioqNumber()));
                                    System.out.println("Updated " + PrioqUtil.getPrioqNumber());
                                } else {
                                    jda.getPresence().setActivity(Activity.playing("PrioQ peek is disabled"));
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    timer.schedule(updateTask, 0, 10000);

                }
            };

            if (active) {
                EmbedBuilder embed = new EmbedBuilder();
                active = false;
                embed.setTitle("PrioQ updater");
                embed.setDescription("You just disabled the prioq updater on bot status!");
                embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                embed.setColor(Color.BLACK);
                event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());


            } else {
                EmbedBuilder embed = new EmbedBuilder();
                active = true;
                jda.getPresence().setActivity(Activity.playing("PrioQ peek is disabled"));
                embed.setTitle("PrioQ updater");
                embed.setDescription("You just enabled the prioq updater on bot status!");
                embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                embed.setColor(Color.BLACK);
                event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
            }


        } else{
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("PrioQ updater");
            embed.setDescription("You dont have perms to do this!");
            embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
            embed.setColor(Color.BLACK);
            event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
        }

    }



    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "priopeek";
    }
}
