package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Arrays;
import java.util.List;

public class BanCommand extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String msg = e.getMessage().getContentRaw();
            TextChannel channel = e.getChannel();
            Member member = e.getMember();
            List<Member> mentionedMembers = e.getMessage().getMentionedMembers();

            List<String> args = Arrays.asList(msg.split(" "));
            if (mentionedMembers.isEmpty() || args.size() < 2) {
                channel.sendMessage("Missing Arguments").queue();
                return;
            }

            Member target = mentionedMembers.get(0);
            String reason = String.join(" ", args.subList(1, args.size()));

            if (!member.hasPermission(Permission.BAN_MEMBERS) && !member.canInteract(target)) {
                channel.sendMessage("You dont have pmerission to run this command").queue();
                return;
            }
        target.ban(1)
                    .reason(String.format("Baneado por: %#s, Razón: %s", e.getAuthor(), reason)).queue();
        EmbedBuilder embed=new EmbedBuilder();
        embed.setTitle("Usuario baneado");
        embed.addField(member + " ha sido baneado por: ", reason, false);
        embed.setColor(7279795);
        embed.build();
        }

    public String getHelp() {
        return "";
    }

    public String getInvoke() {
        return "ban";
    }
}