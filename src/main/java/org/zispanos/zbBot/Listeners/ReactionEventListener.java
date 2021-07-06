package org.zispanos.zbBot.Listeners;


import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageReaction;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.exceptions.ErrorResponseException;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Utils.MemberUtil;

import java.awt.*;
import java.util.Objects;


public class ReactionEventListener extends ListenerAdapter {
    boolean hasPerms = false;
    boolean hasPerms2 = false;

    public void onMessageReactionAdd(MessageReactionAddEvent event) throws ErrorResponseException {
        AudioManager audioManager = event.getGuild().getAudioManager();

        for (String role : Constants.OProles) {
            if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                hasPerms = true;

            }
        }

        MessageReaction reaction = event.getReaction();
        MessageReaction.ReactionEmote emote = reaction.getReactionEmote();
        Long msg = event.getMessageIdLong();

        event.getChannel().retrieveMessageById(msg).queue((message) -> {
            if (message.getAuthor().isBot()) {
                if (!Objects.requireNonNull(event.getUser()).isBot()) {
                    if (emote.getEmoji().equals("💬")) {
                        event.getReaction().removeReaction(event.getUser()).queue();
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("Comandos Miscelaneos");
                        embed.addField("$help", "Muestra la pagina de ayuda", true);
                        embed.addField("$botinfo", "Muestra informacion sobre el bot", true);
                        embed.addField("$ranks", "Obten información de los rangos del servidor de MrCramYT", true);
                        embed.addField("$avatar/$av", "Envia tu avatar", true);
                        embed.addField("$info", "Envia información en tiempo real acerca del bot", true);
                        embed.addField("$serverinfo", "Envia información sobre el servidor. Comando acortado: $si", true);
                        embed.addField("$vote", "Inicia una votación. Uso: $vote. El bot te preguntará como quieres la votación acto seguido", true);
                        embed.addField("$whois", "Información detallada sobre un usuario. Uso: $whois @[usuario]", true);

                        embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                        embed.setColor(7279795);
                        event.getChannel().sendMessage(embed.build()).queue(misc -> misc.addReaction("🗑️").queue());

                    }
                    if (emote.getEmoji().equals("😂")) {
                        event.getReaction().removeReaction(event.getUser()).queue();
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("Comandos divertidos");
                        embed.addField("$getemote", "Roba emotes de otro servidor. Uso : $getemote {emote} ", true);
                        embed.addField("$ping", "Muestra el ping que tiene el bot a los servidores de discord", true);
                        embed.addField("$cat", "Envia una imagen random de un gato", true);
                        embed.addField("$dog", "Envia una imagen random de un perro", true);
                        embed.addField("$floppa", "Easter egg", true);
                        embed.addField("$studycat", "Gato estudiante, sean como el niños", true);
                        embed.addField("$amongus", "sus", true);
                        embed.addField("$based", "Te dice lo basado que eres", true);
                        embed.addField("cope", "Te dice lo cope que eres", true);
                        embed.addField("$cramfag", "Te dice lo cramfag que eres", true);
                        embed.addField("$dadjoke", "Envia una dadjoke", true);
                        embed.addField("$furry", "Envia una foto de un furro", true);
                        embed.addField("$penis", "Te dice el % de pene que tienes (no nsfw)", true);
                        embed.addField("$uwunzorfag", "Te dice lo uwunzorfag que eres", true);
                        embed.addField("$virgin", "Te dice lo virgen que eres", true);
                        embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                        embed.setColor(7279795);
                        event.getChannel().sendMessage(embed.build()).queue(game -> game.addReaction("🗑️").queue());
                    }
                    if (emote.getEmoji().equals("🎧")) {
                        event.getReaction().removeReaction(event.getUser()).queue();
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("Voice chat commands help page");
                        embed.addField("$lock", "Bloquea tu canal de voz para que el numero maximo de personas que pueden entrar sea el numero de personas que hay en ese momento en el canal de voz", true);
                        embed.addField("$unlock", "Elimina el bloqueo de numero maximo de personas", true);
                        embed.addField("$limit", "Limita el numero de personas que pueden entrar a un canal de voz al que el usuario elija. Uso: $limit {numero}", true);
                        embed.addField("$unlimit", "Elimina el bloqueo anterior", true);
                        embed.addField("$kickvc", "Crea una votacion para kickear a alguien de un canal de voz", true);
                        embed.addField("$private", "Hace tu canal de voz privado, solo tu elejirás quien quiere entrar", true);
                        embed.addField("$public", "Elimina el bloqueo anterior y hace publico el canal", true);
                        embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                        embed.setColor(7279795);
                        event.getChannel().sendMessage(embed.build()).queue(music -> music.addReaction("🗑️").queue());
                    }
                    if (emote.getEmoji().equals("🎮")) {
                        event.getReaction().removeReaction(event.getUser()).queue();
                        EmbedBuilder embed = new EmbedBuilder();
                        embed.setTitle("Comandos de 2b2t");
                        embed.addField("$prioq", "Muestra la cola actual en 2b2t", true);
                        embed.addField("$seen {username}", "Ultima vez visto a una persona", true);
                        embed.addField("$stats {username}", "Muestra las estadisticas de una persona", true);
                        embed.addField("$tab", "Envia una foto del tab de 2b2t", true);
                        embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                        embed.setColor(7279795);
                        event.getChannel().sendMessage(embed.build()).queue(game -> game.addReaction("🗑️").queue());

                    }
                    for (String role : Constants.OProles) {
                        if (MemberUtil.getRole(Objects.requireNonNull(event.getMember()), role) != null) {

                            hasPerms2 = true;

                        }
                    }

                    if (emote.getEmoji().equals("🔧")) {
                        event.getReaction().removeReaction(event.getUser()).queue();
                        if (hasPerms2) {
                            EmbedBuilder embed = new EmbedBuilder();
                            embed.setTitle("Administration commands help page");
                            embed.addField("$purge", "Purges specified messages if you have enough perms usage !purge {number}", true);
                            embed.addField("$shutdown", "Stops the bot if you have enough perms", true);
                            embed.addField("$saveconfig [client|bot] {version}", "Saves or modifies the config if you have enough perms", true);
                            embed.addField("$priopeek", "Enables / disables queue peek on bot status", true);
                            embed.addField("$create", "Creates an interactive voice chat", true);
                            embed.addField("$template", "Please, if you dont know what are doing dont touch anything", true);
                            embed.addField("$kick", "Creo que no necesita explicación", true);
                            embed.addField("$ban", "Creo que tampoco necesita explicación", true);
                            embed.addField("$setrpc", "Cambia el rpc del bot", true);

                            embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                            embed.setColor(7279795);
                            event.getChannel().sendMessage(embed.build()).queue(adm -> adm.addReaction("🗑️").queue());

                        } else {
                            EmbedBuilder embed = new EmbedBuilder();
                            embed.setTitle("Ayuda de crambot");
                            embed.setColor(Color.red);
                            embed.setDescription("No tienes permiso para ver esta pagina!");
                            embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                            event.getChannel().sendMessage(embed.build()).queue(adm -> adm.addReaction("🗑️").queue());


                        }
                    }

                    if (emote.getEmoji().equals("🗑️")) {
                        event.getChannel().deleteMessageById(message.getId()).queue();
                    }


                    }}});}}
                    /*

                    if (emote.getEmoji().equals("☑️")) {
                        if (event.getChannel().getName().equalsIgnoreCase("zb-bugs") || event.getChannel().getName().equalsIgnoreCase("zb-suggestion") || event.getChannel().getName().equalsIgnoreCase("bot-suggestions")) {
                            if (hasPerms) {
                                event.getUser().openPrivateChannel().queue((priv) ->
                                {

                                    event.getChannel().deleteMessageById(message.getId()).queue();
                                    EmbedBuilder bugdel = new EmbedBuilder();
                                    bugdel.setTitle("Bug successfully deleted");
                                    bugdel.setDescription("You deleted a bug hopefully its fixed");
                                    bugdel.setColor(7279795);
                                    bugdel.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                                    event.getUser().openPrivateChannel().queue((privy) ->
                                            privy.sendMessage(bugdel.build()).queue());

                                });

                            } else {
                                event.getUser().openPrivateChannel().queue((priv) ->
                                {
                                    EmbedBuilder embed = new EmbedBuilder();
                                    embed.setTitle("Hey you cant do that!");
                                    embed.setDescription("You dont have enough perms to do that");
                                    embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                                    embed.setColor(7279795);

                                    priv.sendMessage(embed.build()).queue();
                                    event.getReaction().removeReaction(event.getUser()).queue();
                                });

                            }

                        }
                    }
                }
            }
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Zispanos Radio", null);
            embed.setColor(Color.BLUE);
            embed.setFooter("Cram radio provided by the Hisparquia backdoor");
            embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
            try {
                if (audioManager.isConnected()) {


                    String repl1 = Arrays.toString(splitToComponentTimes(PlayerManager.get().getGuildMusicManager(event.getGuild()).player.getPlayingTrack().getPosition() / 1000));
                    String repl12 = repl1.replace(",", ":");
                    String repl2 = Arrays.toString(splitToComponentTimes(PlayerManager.get().getGuildMusicManager(event.getGuild()).player.getPlayingTrack().getDuration() / 1000));
                    String repl22 = repl2.replace(",", ":");
                    String repl13 = repl12.replace(" ", "");
                    String repl23 = repl22.replace(" ", "");
                    String repl14 = repl13.replace("[", "");
                    String repl24 = repl23.replace("[", "");
                    String TimeSpent = repl14.replace("]", "");
                    String TimeRemaining = repl24.replace("]", "");
                    embed.setDescription("Playing Now " + PlayerManager.get().getGuildMusicManager(event.getGuild()).player.getPlayingTrack().getInfo().title);
                    embed.addField("Duration: H:M:S / H:M:S", TimeSpent + "/" + TimeRemaining, false);
                } else {
                    embed.setDescription("Theres nothing playing right now use !play to play a song");
                    embed.addField("Duration: H:M:S / H:M:S", "0:0:0 / 0:0:0", false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (!Objects.requireNonNull(event.getUser()).isBot()) {
                if (emote.getEmoji().equals("⏸️")) {

                    PlayerManager.get().getGuildMusicManager(event.getGuild()).player.setPaused(true);
                    event.getChannel().sendMessage(embed.build()).queue(msg1 -> {
                        msg1.addReaction("⏸️").queue();
                        msg1.addReaction("▶️").queue();
                        msg1.addReaction("⏭️").queue();
                        msg1.addReaction("🔄").queue();
                        msg1.addReaction("🗑️").queue();
                    });

                    event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                }

                if (emote.getEmoji().equals("▶️")) {
                    event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                    PlayerManager.get().getGuildMusicManager(event.getGuild()).player.setPaused(false);
                    event.getChannel().sendMessage(embed.build()).queue(msg2 -> {
                        msg2.addReaction("⏸️").queue();
                        msg2.addReaction("▶️").queue();
                        msg2.addReaction("⏭️").queue();
                        msg2.addReaction("🔄").queue();
                        msg2.addReaction("🗑️").queue();
                    });

                }


                if (emote.getEmoji().equals("⏭️")) {
                    PlayerManager.get().getGuildMusicManager(event.getGuild()).scheduler.nextTrack();
                    event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                    event.getChannel().sendMessage(embed.build()).queue(msg3 -> {
                        msg3.addReaction("⏸️").queue();
                        msg3.addReaction("▶️").queue();
                        msg3.addReaction("⏭️").queue();
                        msg3.addReaction("🔄").queue();
                        msg3.addReaction("🗑️").queue();
                    });

                }

                if (emote.getEmoji().equals("🔄")) {
                    event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
                    event.getChannel().sendMessage(embed.build()).queue(msg4 -> {
                        msg4.addReaction("⏸️").queue();
                        msg4.addReaction("▶️").queue();
                        msg4.addReaction("⏭️").queue();
                        msg4.addReaction("🔄").queue();
                        msg4.addReaction("🗑️").queue();
                    });
                }
            }
        });}}
*/
