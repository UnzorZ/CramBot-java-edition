package dev.unzor.crambot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Objects.Constants;
import dev.unzor.crambot.Objects.ICommand;
import dev.unzor.crambot.Utils.MemberUtil;
import dev.unzor.crambot.Utils.RandomColorUtil;

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
