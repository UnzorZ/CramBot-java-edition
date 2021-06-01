package org.zispanos.zbBot.Music;

import com.sedmelluq.discord.lavaplayer.player.AudioLoadResultHandler;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.player.DefaultAudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.source.AudioSourceManagers;
import com.sedmelluq.discord.lavaplayer.tools.FriendlyException;
import com.sedmelluq.discord.lavaplayer.track.AudioPlaylist;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PlayerManager {
    private static PlayerManager INSTANCE;
    private final AudioPlayerManager playerManager;
    private final Map<Long, GuildMusicManager> musicManagers;


    public static PlayerManager get() {
        return INSTANCE;
    }
    private PlayerManager() {
        this.musicManagers = new HashMap<>();

        this.playerManager = new DefaultAudioPlayerManager();
        AudioSourceManagers.registerRemoteSources(playerManager);
        AudioSourceManagers.registerLocalSource(playerManager);
    }

    public synchronized GuildMusicManager getGuildMusicManager(Guild guild) {
        long guildId = guild.getIdLong();
        GuildMusicManager musicManager = musicManagers.get(guildId);

        if (musicManager == null) {
            musicManager = new GuildMusicManager(playerManager);
            musicManagers.put(guildId, musicManager);
        }

        guild.getAudioManager().setSendingHandler(musicManager.getSendHandler());

        return musicManager;
    }
    public void loadPlaylistAndPlay(TextChannel channel, String trackUrl) {
        GuildMusicManager musicManager = getGuildMusicManager(channel.getGuild());

        playerManager.loadItemOrdered(musicManager, trackUrl, new AudioLoadResultHandler() {
            @Override
            public void trackLoaded(AudioTrack track) {
                channel.sendMessage("Adding to queue " + track.getInfo().title).queue();

                play(musicManager, track);

            }





            @Override
            public void playlistLoaded(AudioPlaylist playlist) {
                AudioTrack firstTrack = playlist.getSelectedTrack();

                if (firstTrack == null) {
                    firstTrack = playlist.getTracks().get(0);
                }
                playlist.getTracks().forEach(musicManager.scheduler::queue);

                channel.sendMessage("Adding to queue " + firstTrack.getInfo().title + " (first track of playlist " + playlist.getName() + ")").queue();

                play(musicManager, firstTrack);

            }
            final String URL = trackUrl.replaceAll("^ytsearch:", "");
            @Override
            public void noMatches() {
                channel.sendMessage("Nothing found by " + URL).queue();
            }

            @Override
            public void loadFailed(FriendlyException exception) {
                channel.sendMessage("Could not play: " + exception.getMessage()).queue();
            }
        });

    }


    public void loadAndPlay(TextChannel channel, String trackUrl) {
        GuildMusicManager musicManager = getGuildMusicManager(channel.getGuild());

        playerManager.loadItemOrdered(musicManager, trackUrl, new AudioLoadResultHandler() {
            @Override
            public void trackLoaded(AudioTrack track) {
                channel.sendMessage("Adding to queue " + track.getInfo().title).queue();

                play(musicManager, track);
            }





            @Override
            public void playlistLoaded(AudioPlaylist playlist) {
                AudioTrack firstTrack = playlist.getSelectedTrack();

                if (firstTrack == null) {
                    firstTrack = playlist.getTracks().get(0);
                }
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Zispanos radio");
                embed.setDescription("Adding to queue " + firstTrack.getInfo().title + " (first track of playlist " + playlist.getName() + ")");
                embed.setFooter("Zispanos radio provided by hausemaster backdoor");
                embed.setThumbnail("https://raw.githubusercontent.com/THCFree/Dummy/master/zispanos3.png");
                embed.setColor(Color.blue);
                channel.sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());

                play(musicManager, firstTrack);

            }
                final String URL = trackUrl.replaceAll("^ytsearch:", "");
            @Override
            public void noMatches() {
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Zispanos radio");
                embed.setDescription("Nothing found by" + URL);
                embed.setFooter("Zispanos radio provided by hausemaster backdoor");
                embed.setThumbnail("https://raw.githubusercontent.com/THCFree/Dummy/master/zispanos3.png");
                embed.setColor(Color.blue);
                channel.sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());

            }

            @Override
            public void loadFailed(FriendlyException exception) {
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Zispanos radio");
                embed.setDescription("Could not play" + exception.getMessage());
                embed.setFooter("Zispanos radio provided by hausemaster backdoor");
                embed.setThumbnail("https://raw.githubusercontent.com/THCFree/Dummy/master/zispanos3.png");
                embed.setColor(Color.blue);
                channel.sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());

            }
        });

    }

    private void play(GuildMusicManager musicManager, AudioTrack track) {
        musicManager.scheduler.queue(track);
    }

    public static synchronized PlayerManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PlayerManager();
        }

        return INSTANCE;
    }
}