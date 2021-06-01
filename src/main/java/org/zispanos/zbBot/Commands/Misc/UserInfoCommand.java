package org.zispanos.zbBot.Commands.Misc;

import com.jagrosh.jdautilities.commons.utils.FinderUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Objects.ICommand;

import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class UserInfoCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) {
        EmbedBuilder embed1 = new EmbedBuilder();
        embed1.setTitle("User Info:");
        embed1.setColor(Color.blue);
        if (args.isEmpty()) {
            embed1.setDescription("Missing arguments, check " + Constants.PREFIX + "help ");
            event.getChannel().sendMessage(embed1.build()).queue(message -> message.addReaction("🗑️").queue());
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            return;
        }

        String joined = String.join("", args);
        List<User> foundUsers = FinderUtil.findUsers(joined, event.getJDA());

        if (foundUsers.isEmpty()) {

            List<Member> foundMembers = FinderUtil.findMembers(joined, event.getGuild());

            if (foundMembers.isEmpty()) {
                embed1.setDescription("No users found for `" + joined + "`");
                event.getChannel().sendMessage(embed1.build()).queue(message -> message.addReaction("🗑️").queue());
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                return;
            }

            foundUsers = foundMembers.stream().map(Member::getUser).collect(Collectors.toList());

        }

        User user = foundUsers.get(0);
        Member member = event.getGuild().getMember(user);

       EmbedBuilder embed = new EmbedBuilder();
       embed.setColor(Color.blue);
       embed.setTitle("UserInfo");
        embed.setThumbnail(user.getEffectiveAvatarUrl());
        embed.addField("Username", String.format("%#s", user), false);
        embed.addField("Display Name", member.getEffectiveName(), false);
        embed.addField("User Id + Mention", String.format("%s (%s)", user.getId(), member.getAsMention()), false);
        embed.addField("Account Created", user.getTimeCreated().format(DateTimeFormatter.RFC_1123_DATE_TIME), false);
        embed.addField("Time Joined", member.getTimeJoined().format(DateTimeFormatter.RFC_1123_DATE_TIME), false);
        embed.addField("Online Status", member.getOnlineStatus().name().toLowerCase().replaceAll("_", " "), false);
        embed.addField("Bot Account", user.isBot() ? "Yes" : "No", false);
        event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();




    }

    @Override
    public String getHelp() {
        return "returns user info";
    }

    @Override
    public String getInvoke() {
        return "ui";
    }
}

