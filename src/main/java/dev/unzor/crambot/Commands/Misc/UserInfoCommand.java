package dev.unzor.crambot.Commands.Misc;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserInfoCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {

        Member target = event.getMessage().getMentionedMembers().get(0);
        OffsetDateTime fechacreacion = target.getTimeCreated();
        Role rolmasalto = target.getRoles().get(0);
        String idrol = rolmasalto.getId();
        String msg = event.getMessage().getContentRaw();
        List RoleList = target.getRoles();
        int numberroles = RoleList.size();
        String permisos = String.valueOf(target.getPermissionsExplicit());


        if (args.isEmpty()) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Por favor, etiqueta a alguien para poder utilizar el comando.");
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
        } else {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Información sobre " + target.getUser().getName());
            embed.addField("Nombre: ", target.getUser().getName(), false);
            embed.addField("Nick: ", target.getNickname() == null ? "No tiene nick en este servidor" : target.getNickname(), false);
            embed.addField("Nombre + tag: ", target.getUser().getName() + "#" + target.getUser().getDiscriminator(), false);
            embed.addField("ID: ", target.getId(), false);
            embed.addField("Mención: ", target.getAsMention(), false);
            embed.addField("Fecha de creación: ", target.getTimeCreated().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), false);
            embed.addField("Fecha de entrada al servidor: ", target.getTimeJoined().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), false);
            embed.addField("Rol mas alto: ", "<@&" + idrol + ">", false);
            embed.addField("Roles[" + numberroles + "]: ",getRolesAsString(target.getRoles()), false);
            embed.setThumbnail(target.getUser().getAvatarUrl());
            embed.setColor(target.getColor());
            event.getChannel().sendMessage(embed.build()).queue();
        }
    }


    private String getRolesAsString(List rolesList) {
        String roles = "";
        if (!rolesList.isEmpty()) {
            Role tempRole = (Role) rolesList.get(0);
            roles = "<@&" + tempRole.getId() + ">";
            for (int i = 1; i < rolesList.size(); i++) {
                tempRole = (Role) rolesList.get(i);
                roles = roles + ", <@&" + tempRole.getId() + ">";
            }
        } else {
            roles = "Sin roles";
        }
        return roles;
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "ui";
    }
}
