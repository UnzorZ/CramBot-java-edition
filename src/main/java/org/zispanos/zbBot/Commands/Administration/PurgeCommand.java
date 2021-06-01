package org.zispanos.zbBot.Commands.Administration;


import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.MemberUtil;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public class PurgeCommand implements ICommand {
    boolean hasPerms = false;


    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) {
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        String Args = args.toString();
        String replace1 = Args.replace("[", "");
        String numbers = replace1.replace("]", "");
        int number = Integer.parseInt(numbers);
        if (!numbers.matches("\\d+(d+)?")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No Apropiate Args provided");
            embed.setColor(Color.red);
            embed.addField("Error", "You didnt provide correct arguments to this command try using a number", false);
            embed.addField("Correct Usage", "!purge {number} , has to be less than 100", false);
            embed.setFooter("Looks like we had a error!");
            embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
            event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
        } else {




            for (String role : Constants.OProles) {
                if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                    hasPerms = true;

                }
            }

            if (number <= 100) {

                if (hasPerms) {

                    List<Message> messages = event.getChannel().getHistory().retrievePast(number).complete();
                    messages.forEach(m -> System.out.println("Deleting:" + m));
                    event.getChannel().deleteMessages(messages).complete();

                } else {

                    EmbedBuilder noperms = new EmbedBuilder();
                    noperms.setTitle("Looks like you dont have perms to do this");
                    noperms.setColor(Color.RED);
                    noperms.setFooter("Ooops, " + event.getAuthor().getName() + " doesent have perms to purge the channel");
                    noperms.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                    event.getChannel().sendMessage(noperms.build()).queue(message -> message.addReaction("🗑️").queue());

                }

            }else{
                EmbedBuilder embed2 = new EmbedBuilder();
                embed2.setTitle("Looks like we had a error");
                embed2.setColor(Color.RED);
                embed2.setDescription("Looks like you tried to purge more than 100 messages... try with less than 100 next time");
                embed2.setFooter("Looks like you forced a error bad boy...");
                embed2.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                event.getChannel().sendMessage(embed2.build()).queue(message -> message.addReaction("🗑️").queue());
            }
        }
    }




    @Override
    public String getHelp() {
        return "Purges last 50 chat messages if you have enough perms";
    }

    @Override
    public String getInvoke() {
        return "purge";
    }
}
