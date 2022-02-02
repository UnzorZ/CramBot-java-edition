package dev.unzor.crambot.Commands.Misc;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class getHelpCommand implements ICommand {
    String ayuda;
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        int colorrole = Objects.requireNonNull(event.getMember()).getColorRaw();
        //System.out.println("command working");
        String msg = event.getMessage().getContentRaw().replace("$gethelp ", "");
        //System.out.println(msg);

        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("Ayuda");

        if (msg.contentEquals("debug")) {
            ayuda="This is a test";
        }
        if (msg.contentEquals("help")) {
            ayuda="Envia el panel de ayuda";
        }
        if (msg.contentEquals("purge")) {
            ayuda="Uso solo disponible para administradores. Este elimina un numero determinado de mensajes. Uso: $purge [numero de mensajes] (maximo 100)";
        }
        if (msg.contentEquals("shutdown")) {
            ayuda="Uso solo disponible a un numero limitado de administradores. Este comando apaga el bot";
        }
        if (msg.contentEquals("prefix")) {
            ayuda="Uso solo disponible para administradores. Este comando cambia el prefix predeterminado del bot";
        }
        if (msg.contentEquals("saveconfig")) {
            ayuda="Uso solo disponible para Unzor#6969. Este comando es un debug para situaciones muy concretas";
        }
        if (msg.contentEquals("botinfo")) {
            ayuda="Muestra información sobre el bot";
        }
        if (msg.contentEquals("queuepeek")) {
            ayuda="Uso solo disponible para administradores. Este transforma la actividad del bot a la cola en directo de 2b2t";
        }
        if (msg.contentEquals("getemote")) {
            ayuda="Este comando roba emoticonos que tu le envies. Uso: $getemote :pepecry:. El bot respondera con una imagen/gif del emoticono";
        }
        if (msg.contentEquals("seen")) {
            ayuda="Este comando muestra la ultima vez que se ha visto a un jugador en 2b2t. Uso: $seen Unzor_Z";
        }
        if (msg.contentEquals("prioq")) {
            ayuda="Este comando muestra la cola que hay en ese momento en 2b2t (prio)";
        }
        if (msg.contentEquals("stats")) {
            ayuda="Este comando muestra las estadisticas de un jugador en 2b2t. Uso: $stats Unzor_Z";
        }
        if (msg.contentEquals("tab")) {
            ayuda="Este comando muestra una imagen en directo del tab de 2b2t";
        }
        if (msg.contentEquals("ranks")) {
            ayuda="Este comando manda una lista con todos los roles disponibles en el servidor de discord de MrCramYT. Usarlo en otro servidor no enviará nada";
        }
        if (msg.contentEquals("unzor")) {
            ayuda="Este comando envia un meme famoso en el servidor de discord de MrCramYT";
        }
        if (msg.contentEquals("cram")) {
            ayuda="Este comando envia un meme famoso en el servidor de discord de MrCramYT";
        }
        if (msg.contentEquals("amongus")) {
            ayuda="Este comando envia un meme famoso en el servidor de discord de MrCramYT";
        }
        if (msg.contentEquals("furry")) {
            ayuda="Este comando envia un meme famoso en el servidor de discord de MrCramYT";
        }
        if (msg.contentEquals("dadjoke")) {
            ayuda="Este comando manda una broma de humor blanco (broma de cuñao)";
        }
        if (msg.contentEquals("verify")) {
            ayuda="Comando con unico proposito de debug. Este solo esta disponible para admins";
        }
        if (msg.contentEquals("penis")) {
            ayuda="Mido tu nepe y lo expongo para que todos lo vean";
        }
        if (msg.contentEquals("cope")) {
            ayuda="Mido el % de cope que eres";
        }
        if (msg.contentEquals("based")) {
            ayuda="Mido el % de based que eres";
        }
        if (msg.contentEquals("cramfag")) {
            ayuda="Mido el % de cramfag que eres";
        }
        if (msg.contentEquals("virgin")) {
            ayuda="Mido el % de virgen que eres";
        }
        if (msg.contentEquals("uwunzorfag")) {
            ayuda="Mido el % de uwunzorfag que eres";
        }
        if (msg.contentEquals("invite")) {
            ayuda="Envia un link para que me invites a tu propio servidor";
        }
        if (msg.contentEquals("gethelp")) {
            ayuda="Creo que no necesitas ayuda para usar este comando";
        }
        embed.setColor(colorrole);
        embed.addField(msg.toUpperCase(Locale.ROOT), ayuda, true);
        event.getChannel().sendMessage(embed.build()).queue();
    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "gethelp";
    }

}
