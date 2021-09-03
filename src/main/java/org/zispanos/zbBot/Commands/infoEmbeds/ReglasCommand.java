package org.zispanos.zbBot.Commands.infoEmbeds;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.List;


public class ReglasCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();

        if (event.getGuild().getId().equals("432645641441640448")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Reglas");
            embed.addField("1-Use el lenguaje y tema apropiado para cada canal.", "", true);
            embed.addField("2-No abuse de otros usuarios, haga amenazas, hostigue, intimide, invada la privacidad e inste a otros a cometer actos violentos.", "", true);
            embed.addField("3-No comparta contenido explícito, incluso si se trata de usted.", "", true);
            embed.addField("4-No comparta información personal de otras personas.", "", true);
            embed.addField("5-No hacer SPAM (repetir mensajes, uso de mayúsculas, taggear todo el rato a usuarios, tag masivo o admins, auto-promocion).", "", true);
            embed.addField("6-Cada canal tiene un fin determinado.", "", true);
            embed.addField("7-Todas las reglas, incluidas las de Chat, valen para los canales de voz, independientemente de si están presentes o no los Administradores.", "", true);
            embed.addField("8-Todo tipo de ip fuera de el canal de servidores anarquicos será motivo de baneo (las ips deben de ser de servidores anarquicos)", "", true);
            embed.addField("Disfrute de su estancia, si tiene algun problema no dude en contactar con algun moderador/admin", "", true);

            embed.setColor(7279795);
            event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
        }
    }

    @Override
    public String getHelp() {
        return "Reglas";
    }

    @Override
    public String getInvoke() {
        return "reglas";
    }
}