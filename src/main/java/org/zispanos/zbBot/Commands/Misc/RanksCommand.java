package org.zispanos.zbBot.Commands.Misc;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.ConfigUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;


public class RanksCommand implements ICommand{
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        if (event.getGuild().getId().equals("432645641441640448")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Rangos");
            embed.addField("Hola! :hand_splayed: ¿Estas interesado en obtener Rango Youtuber o Rango Vip?:thinking:", "", true);
            embed.addField("Los requisitos para obtener estos rangos son los siguientes!  :tada:", "", true);
            embed.addField("", "", true);
            embed.addField("Rango [YOUTUBER/STREAMER]! Requisitos:", "-Tener un canal de youtube o twitch.\n" +
                    "-Ser activo en el servidor.\n" +
                    "-Publicar vídeos o streams al menos 1 vez cada semana.\n" +
                    "-Tener 100 suscriptores o seguidores!", true);
            embed.addField("Rango [2B2T PLAYER]! Requisitos:", "-Mandar foto de ti en 2b2t.org con el tabulador abierto en <#536833489744429057>", true);
            embed.addField("", "", true);
            embed.addField("Rango [HISPARQUIA PLAYER]! Requisitos:", "-Mandar foto de ti en hisparquia.org con el tabulador abierto en <#536833489744429057>", true);
            embed.addField("Rango [MINECRAFT PS4]! Requisitos:", "-Mandar foto de tu consola con el juego abierto", true);
            embed.addField("", "", true);
            embed.addField("Rango [MEME LORD]! Requisitos:", "-Mandar 10 memes en <#540849300029177877>", true);
            embed.addField("Rango [DJ]! Requisitos:", "-Ninguno, solo pidelo :laughing:", true);
            embed.addField("", "", true);
            embed.addField("Tenga en cuenta de que no se puede pedir ningun rol que no esté en esta lista", "Esto resultará en una amonestacion con consecuencias", true);
            embed.setColor(7279795);
            event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());

            EmbedBuilder embed2 = new EmbedBuilder();

            embed2.setTitle("Niveles");
            embed2.addField("Los niveles son automaticos, ¡yay!", "Los otorga automaticamente <@437808476106784770>", true);
            embed2.addField("Estos son sus comandos:", " -a!rank: este comando te muestra tu nivel\n" + "-a!lb: este comando te enseña la lista de las personas con mas nivel\n" + "a!rank + {usuario}: este comando te permite saber  el nivel que tiene {usuario}", true);
            embed2.addField("", "", true);
            embed2.addField("Niveles:", "-<@&802558385731403796>: Acceso a <#828776985349193728>\n" + "-<@&802558603034492959>: Acceso a <#828777055666569257>\n" + "-<@&802558698021978182>: Acceso a <#828777122289156096> y a <#802525437992632320>\n" + "-<@&802558804197638154>: Acceso a <#828777335649075220>\n" + "-<@&802558970899857408>: Acceso a <#828777398232285204>\n" + "-<@&802559044690640956>: Acceso a <#828777449298329600>\n" + "-<@&802559219642400858>: Acceso a <#828777503208112138> y derecho a un nitro, por tu poca vida social\n" + "-<@&802559907374301194>: Acceso a <#828777562930544640> y derecho a otro nitro\n" + "-<@&802559280342761532>: Acceso a <#828777723634909195> y tu rango saldrá el mas alto del servidor\n", true);
            embed2.addField("", "", true);


            embed2.setColor(7279795);
            event.getChannel().sendMessage(embed2.build()).queue(message -> message.addReaction("🗑️").queue());
        }
    }

    @Override
    public String getHelp() {
        return "Shows ranks info";
    }

    @Override
    public String getInvoke() {
        return "ranks";
    }
}