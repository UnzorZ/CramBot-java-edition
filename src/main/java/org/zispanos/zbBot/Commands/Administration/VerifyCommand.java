package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.MemberUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class VerifyCommand implements ICommand{
    boolean hasPerms = false;
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {
        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {
                hasPerms = true;
            }
        }

        if (!hasPerms){

            EmbedBuilder noperms = new EmbedBuilder();
            noperms.setTitle("No tienes permisos para ejecutar este comando");
            noperms.setColor(Color.RED);
            noperms.setFooter("Ooops, " + event.getAuthor().getName() + " no tiene permisos para hacer esto");
            noperms.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
            event.getChannel().sendMessage(noperms.build()).queue(message -> message.addReaction("🗑️").queue());

        } else{

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Verificación");
            embed.addField("Para verificarte, por favor, reacciona a este mensaje", "Al reaccionar, aceptas que has leido <#536624573505077268> y estas de acuerdo con ellas. Si reaccionas y no ocurre nada, por favor contacta con algun administrador", true);
            embed.setColor(Color.GREEN);
            event.getChannel().sendMessage(embed.build()).queue();
        }

    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "asdasdasd123";
    }
}