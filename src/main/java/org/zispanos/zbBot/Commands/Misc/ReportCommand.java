package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.List;


public class ReportCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Instrucciones para reportar a alguien");
            embed.addField("$nuevoticket <razon>", "Sirve para crear un ticket", true);
            embed.addField("", "", true);
            embed.addField("$cerrarticket", "Sirve para cerrar tu ticket", true);
            embed.addField("Para poder crear un chat privado con los staff, escriba en este canal el comando para crear un ticket y especifique una razón, acto seguido dentro del ticket exponga sus pruebas y argumentos", "Tenga en cuenta que un mal uso de este servicio puede llevar a consecuencias", true);
            embed.setColor(7279795);
            event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("").queue());
        }

    @Override
    public String getHelp() {
        return "Reglas";
    }

    @Override
    public String getInvoke() {
        return "report";
    }
}