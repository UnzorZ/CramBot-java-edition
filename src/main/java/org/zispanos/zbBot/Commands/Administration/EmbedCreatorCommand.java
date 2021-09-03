package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;

import java.awt.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class EmbedCreatorCommand implements ICommand {
    String contenido;
    String titulo;
    String thumbnail;
    String color;


    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        EmbedBuilder embed = new EmbedBuilder();
        embed.setTimestamp(new Date().toInstant());


        String msg = event.getMessage().getContentRaw();
        if (msg.equals("$embed info")) {
            EmbedBuilder embed2 = new EmbedBuilder();
            embed2.setTitle("Información");
            embed2.addField("Pasos para crear tu propio embed: ", "", true);
            embed2.addField("1. $embed title", "Este es el primer comando que deberás ejecutar. Aqui va el titulo del embed. Ejemplo: $embed title Información", true);
            embed2.addField("2. $embed content", "Este es el siguiente comando que deberás ejecutar. Aqui va el contenido que tendrá el embed. Ejemplo: $embed content Esto es un test", true);
            embed2.addField("3. $embed color", "Este es el ultimo comando que deberás ejecutar. En el va el codigo hexadecimal para poner de color. Con $embed colorhelp puedes acceder a una lista de codigos.", true);
            embed2.addField("Para generar el embed en el mismo canal en el que estas simplemente deberas de usar $embed build", "", true);
            embed2.setColor(Color.CYAN);
            event.getChannel().sendMessage(embed2.build()).queue();
        }

        if (msg.startsWith("$embed title ")) {
            String titulo2 = msg.replace("$embed title ", "");
            titulo = titulo2;
            embed.setTitle(titulo2);
            System.out.println("Titulo");
        }
        if (msg.startsWith("$embed content ")) {
            String contenido2 = msg.replace("$embed content ", "");
            contenido = contenido2;
            System.out.println("contenido");
            embed.setDescription(contenido2);
        }
        if (msg.startsWith("$embed color ")) {
            String color2 = msg.replace("$embed color ", "");
            color = color2;
            System.out.println("color");
            embed.setColor(Color.decode(color2));
        }
        if (msg.startsWith("$embed build")) {

            event.getChannel().sendMessage(embed.build()).queue();

        }
    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "embed";
    }

}
