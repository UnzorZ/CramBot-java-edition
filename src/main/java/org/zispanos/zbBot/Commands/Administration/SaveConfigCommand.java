package org.zispanos.zbBot.Commands.Administration;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Objects.ICommand;
import org.zispanos.zbBot.Utils.ConfigUtil;
import org.zispanos.zbBot.Utils.MemberUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class SaveConfigCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {

        boolean hasPerms = false;

        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();

        if (!args.toString().equals("[]")){
            String replace1 = args.toString().replace("[","");
            String replace2 = replace1.replace("]","");
            String replace3 = replace2.replace(",","");
            String version;


            for (String role : Constants.OProles) {
                if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                    hasPerms = true;

                }
            }

            if (replace2.toLowerCase().contains("client")){
                if (hasPerms){
                    version = replace3.replace("client","");
                    ConfigUtil.cver = version;
                    ConfigUtil.saveConfig();
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setColor(Color.BLACK);
                    embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                    embed.setDescription("Done, client version updated!");
                    event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());

                }else {
                    EmbedBuilder noperms = new EmbedBuilder();
                    noperms.setTitle("Looks like you dont have perms to do this");
                    noperms.setColor(Color.RED);
                    noperms.setFooter("Ooops " + event.getAuthor().getName() + " Doesn't have perms to change version.");
                    noperms.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                    event.getChannel().sendMessage(noperms.build()).queue(message -> message.addReaction("🗑️").queue());
                }
            }else if (replace2.toLowerCase().contains("bot")){
                if (hasPerms){
                    version = replace3.replace("bot","");
                    ConfigUtil.botVer = version;
                    ConfigUtil.saveConfig();
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setColor(Color.BLACK);
                    embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                    embed.setDescription("Done, bot version updated!");
                    event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());

                }else {
                    EmbedBuilder noperms = new EmbedBuilder();
                    noperms.setTitle("Looks like you dont have perms to do this");
                    noperms.setColor(Color.RED);
                    noperms.setFooter("Ooops " + event.getAuthor().getName() + " Doesn't have perms to change version.");
                    noperms.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                    event.getChannel().sendMessage(noperms.build()).queue(message -> message.addReaction("🗑️").queue());
                }
            }else {

            }



        }else {
            EmbedBuilder noArgs = new EmbedBuilder();
            noArgs.setDescription("Usage of the command !saveconfig {client or bot} {version}");
            noArgs.setColor(Color.BLACK);
            noArgs.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
            event.getChannel().sendMessage(noArgs.build()).queue(message -> message.addReaction("🗑️").queue());
        }
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "saveconfig";
    }
}
