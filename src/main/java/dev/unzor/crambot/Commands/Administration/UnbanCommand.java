package dev.unzor.crambot.Commands.Administration;

import dev.unzor.crambot.Utils.MemberUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Objects.Constants;
import dev.unzor.crambot.Objects.ICommand;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class UnbanCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException, ExecutionException {

        String msg = event.getMessage().getContentRaw().replace(Constants.PREFIX + "unban", "");

        boolean hasPerms = false;
        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {
                hasPerms = true;
            }
        }
        if (hasPerms) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Usuario desbaneado");
            embed.setColor(Color.GREEN);
            event.getChannel().sendMessage(embed.build()).queue();
            event.getGuild().unban(msg).queue();

        } else {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No tienes permiso para ejecutar este comando");
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
        }
    }
    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "unban";
    }
}
