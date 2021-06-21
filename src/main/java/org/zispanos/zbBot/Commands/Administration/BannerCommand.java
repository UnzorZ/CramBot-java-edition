package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.FactsUtil;
import org.zispanos.zbBot.Utils.MemberUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class BannerCommand implements ICommand{
    boolean hasPerms = false;
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws IOException {
        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                hasPerms = true;

            }
        }

        if (hasPerms) {

            EmbedBuilder embed = new EmbedBuilder();

            embed.setTitle("Dad Joke");
            embed.setDescription(FactsUtil.getDadJoke());
            embed.addField(event.getGuild().getBannerUrl(), "", true);
            embed.setColor(Color.orange);
            event.getChannel().sendMessage(embed.build()).queue();

        } else {

            EmbedBuilder noperms = new EmbedBuilder();
            noperms.setTitle("Looks like you dont have perms to do this");
            noperms.setColor(Color.RED);
            noperms.setFooter("Ooops, " + event.getAuthor().getName() + " doesent have perms to do this");
            noperms.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
            event.getChannel().sendMessage(noperms.build()).queue(message -> message.addReaction("🗑️").queue());

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
