package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.MemberUtil;
import org.zispanos.zbBot.Utils.RandomColorUtil;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class PreguntadeldiaCommand implements ICommand {
    boolean hasPerms = false;

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                hasPerms = true;

            }
        }
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        String msg = event.getMessage().getContentRaw().replace("$preguntadeldia ", "").replace("¿", "").replace("?", "");

        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("✨》Pregunta del dia《✨");
        embed.setDescription("¿" + msg + "?");
        embed.setColor(RandomColorUtil.getRandomColor());
        event.getChannel().sendMessage(embed.build()).queue();
    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "preguntadeldia";
    }

}
