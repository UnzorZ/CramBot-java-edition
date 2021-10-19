package org.zispanos.zbBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.guild.GuildLeaveEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.zispanos.zbBot.Listeners.ReactionEventListener;
import org.zispanos.zbBot.Utils.FactsUtil;
import org.zispanos.zbBot.Utils.SQLite;

import javax.security.auth.login.LoginException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

public class Main extends ListenerAdapter {
    private static final Random random = new Random();

    static CommandManager commandManager = new CommandManager(random);
    static Listener listener = new Listener(commandManager);
    static Listener log = new Listener(commandManager);

    public static void main(String[] args) throws LoginException, ClassNotFoundException {
        SQLite.connect();
        FactsUtil.Load();
        JDABuilder.createLight(TOKEN.token)
                .setActivity(Activity.watching("MrCramYT"))
                .setStatus(OnlineStatus.ONLINE)
                .addEventListeners(listener, new Main(), new ReactionEventListener())
                .build();
    }

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        super.onReady(event);
        System.out.println("**************************************************************");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Im currently in " + event.getGuildTotalCount() + " guilds. I manage to see " + event.getJDA().getTextChannels().size() + " text channels and " +
                "" + event.getJDA().getVoiceChannels().size() + " voice channels. Also " + event.getJDA().getRoles().size() + " roles.");
        System.out.println("--------------------------------------------------------------");
        System.out.println("**************************************************************");
    }

    @Override
    public void onGuildJoin(GuildJoinEvent event) {
        super.onGuildJoin(event);
        String servercramid = "432645641441640448";
        String unzorid = "758441764121608202";
        Guild guild = event.getJDA().getGuildById(servercramid);
        assert guild != null;
        AtomicReference<String> boosts = new AtomicReference<>(String.valueOf(event.getGuild().getBoostCount()));

        if (boosts.equals(null)) {
            boosts.set("0");
        }

        String finalBoosts = boosts.get();
        guild.retrieveMemberById(unzorid).queue(member ->{
            member.getUser().openPrivateChannel().queue(privateChannel -> {
                //StringBuilder message = new StringBuilder();
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("He entrado a un servidor");
                embed.setDescription("He entrado a un servidor llamado " + event.getGuild().getName() + " con " + event.getGuild().getMemberCount() + " miembros, " + event.getGuild().getRoles().size() + " roles," +
                                event.getGuild().getTextChannels().size() + " canales de texto y " + event.getGuild().getVoiceChannels().size() + " canales de voz.");
                embed.setImage(event.getGuild().getIconUrl());
                embed.addField("Boost", "El servidor tiene " + finalBoosts + " boosts", false);

                privateChannel.sendMessage(embed.build()).queue();

                boosts.set("0");
            });
        });

    }

    @Override
    public void onGuildLeave(GuildLeaveEvent event) {
        super.onGuildLeave(event);
        String servercramid = "432645641441640448";
        String unzorid = "758441764121608202";
        Guild guild = event.getJDA().getGuildById(servercramid);
        assert guild != null;
        AtomicReference<String> boosts = new AtomicReference<>(String.valueOf(event.getGuild().getBoostCount()));

        if (boosts.equals(null)) {
            boosts.set("0");
        }

        String finalBoosts = boosts.get();
        guild.retrieveMemberById(unzorid).queue(member ->{
            member.getUser().openPrivateChannel().queue(privateChannel -> {
                //StringBuilder message = new StringBuilder();
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("He salido a un servidor");
                embed.setDescription("He salido a un servidor llamado " + event.getGuild().getName() + " con " + event.getGuild().getMemberCount() + " miembros, " + event.getGuild().getRoles().size() + " roles," +
                        event.getGuild().getTextChannels().size() + " canales de texto y " + event.getGuild().getVoiceChannels().size() + " canales de voz.");
                embed.setImage(event.getGuild().getIconUrl());
                embed.addField("Boost", "El servidor tenía " + finalBoosts + " boosts", false);

                privateChannel.sendMessage(embed.build()).queue();

                boosts.set("0");
            });
        });
    }


    //R80336
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()) {
            String MSG = ("Seems like we received a message from \"" + event.getAuthor().getAsTag() + "\", aka \"" + event.getAuthor().getName() + "\" in " + event.getChannel().getName() + "( " + event.getGuild().getName() + "  that says: " + event.getMessage().getContentDisplay());
            System.out.println("DEBUG: " + MSG);
        }
    }

    @Override
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
        if (!event.getAuthor().isBot()) {
            if (event.getAuthor.getId().equals(""))
            String servercramid = "432645641441640448";
            String unzorid = "758441764121608202";
            Guild guild = event.getJDA().getGuildById(servercramid);
            assert guild != null;
            String message = event.getMessage().getContentRaw();

            guild.retrieveMemberById(unzorid).queue(member ->{
                member.getUser().openPrivateChannel().queue(privateChannel -> {
                //StringBuilder message = new StringBuilder();
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setTitle("He recivido un mensaje");
                    embed.setDescription(event.getAuthor().getName() + " says: " + message);

                privateChannel.sendMessage(embed.build()).queue();
            });
        });
    }
    }

}
