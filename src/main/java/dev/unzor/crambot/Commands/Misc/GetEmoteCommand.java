package dev.unzor.crambot.Commands.Misc;

import com.vdurmont.emoji.EmojiManager;
import dev.unzor.crambot.Objects.ICommand;
import dev.unzor.crambot.Utils.UrlReaderUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class GetEmoteCommand implements ICommand {
    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        event.getChannel().deleteMessageById(event.getMessageIdLong()).queue();
        if (args.isEmpty()) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Ladrón de emotes");
            embed.setDescription("Uso incorrecto, usa !getmote {emote}");
            embed.setColor(Color.red);
            embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
            event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());

        } else {
            if (EmojiManager.containsEmoji(args.toString())) {
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Ladrón de emotes");
                embed.setDescription("No puedes robar emojis UTF8 de discord, esto es solo para otros emotes de otros servidores");
                embed.setColor(Color.red);
                embed.setThumbnail("https://images-ext-1.discordapp.net/external/9JFZB8ciu6xnUwZ6_oPp3FBJ_jnM1WBillvAvxaTYjc/%3Fsize%3D256/https/cdn.discordapp.com/avatars/812711414212722719/0c0cc2e334708a2e8ac28b6cc73747b2.png");
                event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());
            }else{
                String Args = args.toString();
                String Form1Args = Args.replace("<", "");
                String Form2Args = Form1Args.replace("[", "");
                String Form3Args = Form2Args.replace("]", "");
                String Form4Args = Form3Args.replace(",", "");
                String FormArgs = Form4Args.replace(">", "");
                String[] array = UrlReaderUtil.StringArrayToArrayDivByDouble(FormArgs);
                String ID = array[array.length - 1];
                String emote = "https://cdn.discordapp.com/emojis/" + ID ;
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Ladron de emotes");
                embed.setImage(emote);
                embed.setColor(Color.green);
                event.getChannel().sendMessage(embed.build()).queue(message -> message.addReaction("🗑️").queue());

            }
        }
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "getemote";
    }
}
    //String Args = args.toString();
    //String repl1 = Args.replaceAll("[:A-z:]","");
    //String Final = repl1.replaceAll("[<>]","");
            //System.out.println(Final);