package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.List;

public class HelpCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException{
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("Help for the CramBot");
        embed.setImage(event.getGuild().getIconUrl());
        embed.addField("Comandos misceláneos","Haz click en 💬 para mostrar la pagina de los comandos miscelaneos",false);
        embed.addField("Comandos divertidos", "Haz click en 😂 para mostrar la pagina de los comandos divertidos", false);
        embed.addField("Comandos de voice chat","Haz click en 🎧 para mostrar la pagina de los comandos de voice chat",false);
        embed.addField("Comandos de 2b2t","Haz click en 🎮 para mostrar la pagina de los comandos de 2b2t",false);
        embed.addField("Comandos de administracion","Haz click en 🔧 para mostrar la pagina de los comandos de administracion",false);
        embed.addField("Eliminar mensaje","Haz click en 🗑️ para eliminar el mensaje",false);
        embed.setFooter("La ayuda que necesitabas " + event.getAuthor().getName() + "!",event.getGuild().getIconUrl());
        embed.setColor(7279795);
        event.getChannel().sendMessage(embed.build()).queue(message -> {
            message.addReaction("💬").queue();
            message.addReaction("😂").queue();
            message.addReaction("🎧").queue();
            message.addReaction("🎮").queue();
            message.addReaction("🔧").queue();
            message.addReaction("🗑️").queue();
        });
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "help";
    }
}
