package org.zispanos.zbBot.Commands.infoEmbeds;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.RandomColorUtil;

import java.io.IOException;
import java.util.List;

public class PreguntaDelDiaEmbedCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("Rol de la pregunta del dia");
        embed.setDescription("Para obtener el rol <@&874046265082675241>, reacciona a este mensaje con ❓");
        embed.setColor(RandomColorUtil.getRandomColor());
        event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("").queue());

    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "preguntadeldiaembed";
    }

}
