package dev.unzor.crambot.Commands.Misc;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.util.List;

public class PingCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) {
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();

        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("Ping");
        embed.setColor(7279795);
        embed.setFooter("Ping del bot hacia los servidores de discord");
        embed.setDescription(String.valueOf(event.getJDA().getGatewayPing()));
        embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
        event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
    }

    @Override
    public String getHelp() {
        return "Shows the ping from the bot to the discord server";
    }

    @Override
    public String getInvoke() {
        return "ping";
    }
}
