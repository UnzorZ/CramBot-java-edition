package dev.unzor.crambot.Commands.Misc;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Objects.Constants;

import java.util.List;

public class PrefixCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) {

        Member member = event.getMember();
        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("Change Prefix");
        if (!member.hasPermission(Permission.MANAGE_SERVER)) {
            embed.setDescription("Necesitas **Manage Server permission*** Para usar este comando");
            return;
        }

        if (args.isEmpty()) {
            embed.setDescription("Uso: `" + Constants.PREFIX + getInvoke() + " <prefix>`");
            return;
        }

        String newPrefix = args.get(0);

        Constants.PREFIXES.put(event.getGuild().getIdLong(), newPrefix);

        embed.setDescription("El nuevo prefix es: `" + newPrefix + "`");
        event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "prefix";
    }
}
