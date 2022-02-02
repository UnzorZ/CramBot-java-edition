package dev.unzor.crambot;

import dev.unzor.crambot.Objects.Constants;
import dev.unzor.crambot.Utils.RandomColorUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.IOException;
import java.util.Calendar;
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
        logger.info(String.format("Im currently in " + event.getJDA().getGuilds().size()) + " guilds");
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        User author = event.getAuthor();
        Message message = event.getMessage();
        String content = message.getContentDisplay();
        String guildid = event.getGuild().getId();

        if (event.isFromType(ChannelType.TEXT)) {

            Guild guild = event.getGuild();
            TextChannel textChannel = event.getTextChannel();

            logger.info(String.format("(%s)[%s]<%#s>: %s", guild.getName(), textChannel.getName(), author, content));
        } else if (event.isFromType(ChannelType.PRIVATE)) {
            logger.info(String.format("[PRIV]<%#s>: %s", author, content));
        }
        String msg = event.getMessage().getContentRaw();
        if (!event.getMessage().getAuthor().isBot()) {
            if (msg.startsWith("yo soy un ".toLowerCase())) {
                event.getChannel().sendMessage(("Hola " + msg.replace("yo soy un ", "") + ", soy el CramBot.").replaceAll("\\s+", " ")).queue();
                return;
            }
            if (msg.startsWith("Soy un ".toLowerCase())) {
                event.getChannel().sendMessage(("Hola " + msg.replace("soy un ", "") + ", soy el CramBot.").replaceAll("\\s+", " ")).queue();
                return;
            }
            if (msg.startsWith("Yo soy ".toLowerCase())) {
                event.getChannel().sendMessage(("Hola " + msg.replace("yo soy ", "") + ", soy el CramBot.").replaceAll("\\s+", " ")).queue();
                return;
            }
            if (msg.startsWith("Soy ".toLowerCase(Locale.ROOT))) {
                event.getChannel().sendMessage(("Hola " + msg.replace("yo soy ", "") + ", soy el CramBot.").replaceAll("\\s+", " ")).queue();
            }
        }
        if (guildid.equals("432645641441640448")) {

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("No esta permitido decir esta palabra en este servidor " + author.getName());
            embed.setColor(Color.RED);

            User user;


            if (msg.contains(".aternos".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains(". aternos".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }


            if (msg.contains(". at3rn0s".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }

            if (msg.contains(". a t e r n o s".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains(".at3rnos".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains(".atern0s".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains(".at3rn0s".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains(".a t e r n o s".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains("punto aternos".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                embed.setColor(Color.RED);
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains(".holly.".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains("punto me".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains("7b".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains("crackedanarchy".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains("latanarquia".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains("qbasty".toLowerCase(Locale.ROOT))) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                event.getChannel().sendMessage(embed.build()).queue();
                return;
            }
            if (msg.contains("卐")) {
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            }
            if (msg.contains("ζ")) {
                String name = event.getAuthor().getName();
                EmbedBuilder embed2 = new EmbedBuilder();
                embed2.setTitle("Detected Zoophile, banning them...");
                embed2.setColor(Color.RED);
                embed2.setFooter("Succesfully banned " + name, event.getAuthor().getAvatarUrl());
                event.getChannel().sendMessage(embed2.build()).queue();
                user = event.getAuthor();
                event.getGuild().ban(user, 0, "Zoophile symbol found in its message").queue();
                event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
            }
            String name = event.getAuthor().getName();
            Member member = event.getMember();

            if (name.contains("ζ")) {
                assert member != null;
                member.ban(0, "Zoophile symbol found in its name").complete();
                EmbedBuilder embed2 = new EmbedBuilder();
                embed2.setTitle("Detected Zoophile, banning them...");
                embed2.setColor(Color.RED);
                embed2.setFooter("Succesfully banned " + name, event.getAuthor().getAvatarUrl());
                event.getChannel().sendMessage(embed2.build()).queue();
            }

        }
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(System.currentTimeMillis() - System.currentTimeMillis());
        int mYear = c.get(Calendar.YEAR) - 1970;
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH) - 1;
        if (mYear < 0) {
            mYear = 0;
            mMonth = 0;
            mDay = 0;
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

        long id = event.getJDA().getSelfUser().getIdLong();
        String msg = event.getMessage().getContentRaw();

        if (msg.contains("<@" + id + ">")) {

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Hola, veo que me has llamado");
            embed.setDescription("Mi prefix es " + Constants.PREFIX + ", y si necesitas ayuda puedes visitar mi [página web](https://crambot.xyz/)");
            embed.setColor(RandomColorUtil.getRandomColor());
            event.getChannel().sendMessage(embed.build()).queue();
        }

    }
}
