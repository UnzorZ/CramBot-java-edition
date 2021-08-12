package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.MemberUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class SayCommand implements ICommand {
    boolean hasPerms = false;

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();

        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                hasPerms = true;

            }
        }
    if (hasPerms) {
            String msg = event.getMessage().getContentRaw();
            if (msg.startsWith("$say ".toLowerCase())) {
                event.getChannel().sendMessage(msg.replace("$say ", "")).queue();
            }
    } else {
        if (!event.getAuthor().getId().equals("758441764121608202")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setColor(Color.RED);
            embed.setTitle("No tienes permiso para ejecutar este comando");
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
        return "say";
    }

}
