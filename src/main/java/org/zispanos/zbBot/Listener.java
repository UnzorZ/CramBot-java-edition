package org.zispanos.zbBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zispanos.zbBot.Objects.Constants;

import java.awt.*;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

class Listener extends ListenerAdapter {

    private final CommandManager manager;
    private final Logger logger = LoggerFactory.getLogger(Listener.class);

    Listener(CommandManager manager) {
        this.manager = manager;
    }

    @Override
    public void onReady(ReadyEvent event) {
        logger.info(String.format("Logged in as %#s", event.getJDA().getSelfUser()));
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        User author = event.getAuthor();
        Message message = event.getMessage();
        String content = message.getContentDisplay();

        if (event.isFromType(ChannelType.TEXT)) {

            Guild guild = event.getGuild();
            TextChannel textChannel = event.getTextChannel();

            logger.info(String.format("(%s)[%s]<%#s>: %s", guild.getName(), textChannel.getName(), author, content));
        } else if (event.isFromType(ChannelType.PRIVATE)) {
            logger.info(String.format("[PRIV]<%#s>: %s", author, content));
        }
        String msg = event.getMessage().getContentRaw();
        if (!event.getMessage().getAuthor().isBot()) {
            if (msg.startsWith("yo soy un".toLowerCase())) {
                event.getChannel().sendMessage(("Hola " + msg.replace("yo soy un", "") + ", soy el CramBot.").replaceAll("\\s+", " ")).queue();
                return;
            }
            if (msg.startsWith("Soy un".toLowerCase())) {
                event.getChannel().sendMessage(("Hola " + msg.replace("soy un", "") + ", soy el CramBot.").replaceAll("\\s+", " ")).queue();
                return;
            }
            if (msg.startsWith("Yo soy".toLowerCase())) {
                event.getChannel().sendMessage(("Hola " + msg.replace("yo soy", "") + ", soy el CramBot.").replaceAll("\\s+", " ")).queue();
                return;
            }
            if (msg.startsWith("Soy".toLowerCase(Locale.ROOT))) {
                event.getChannel().sendMessage(("Hola " + msg.replace("yo soy", "") + ", soy el CramBot.").replaceAll("\\s+", " ")).queue();
            }
            if (msg.contains(".aternos".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
                embed.setColor(Color.RED);
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains(". aternos".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
                embed.setColor(Color.RED);
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }

        }
        if (msg.contains(". at3rn0s".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
            return;
        }

        if (msg.contains(". a t e r n o s".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
            return;
        }
            if (msg.contains(".at3rnos".toLowerCase(Locale.ROOT))) {
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
        embed.setColor(Color.RED);
        event.getChannel().sendMessage(embed.build()).queue();
        return;
    }
        if (msg.contains(".atern0s".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
            return;
        }
        if (msg.contains(".at3rn0s".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
            return;
        }
        if (msg.contains(".a t e r n o s".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
            return;
        }
        if (msg.contains("punto aternos".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
            return;
        }
        if (msg.contains(".holly.".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
            return;
        }
        if (msg.contains("punto me".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No mandes la ip de tu servidor aqui " + author.getName());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
            return;
        }
        if (msg.contains("uwunzor.net".toLowerCase(Locale.ROOT))) {
            event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("NO. " + author.getName());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();
            return;
            
        }
}
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String rw = event.getMessage().getContentRaw();
        String prefix = Constants.PREFIXES.computeIfAbsent(event.getGuild().getIdLong(), (l) -> Constants.PREFIX);
        if (!event.getAuthor().isBot() && !event.getMessage().isWebhookMessage() && rw.startsWith(prefix)) {
            try {
                manager.handleCommand(event);
            } catch (InterruptedException | IOException | JSONException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}