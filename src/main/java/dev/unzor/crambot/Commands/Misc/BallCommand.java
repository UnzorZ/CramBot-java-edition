package dev.unzor.crambot.Commands.Misc;

import dev.unzor.crambot.Objects.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import dev.unzor.crambot.Utils.FactsUtil;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class BallCommand implements ICommand {

    @Override
    public void handle(List<String> args, GuildMessageReceivedEvent event) throws InterruptedException, IOException {
        String originalmsg = event.getMessage().getContentRaw();
        String msg = originalmsg.replace("$8ball ", "");
        String msg2 = msg.replace("?", "");
        String msg3 = msg2.replace("¿", "");
        String ball = FactsUtil.getBall();

        if (ball.contains("✅")) {
            System.out.println("Green");
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("¿" + msg3 + "?");
            embed.setDescription(ball);
            embed.setAuthor(event.getAuthor().getAsTag(), "https://www.youtube.com/watch?v=dQw4w9WgXcQ", event.getAuthor().getAvatarUrl());
            embed.setColor(Color.GREEN);
            event.getChannel().sendMessage(embed.build()).queue();

        }
        if (ball.contains("❓")) {
            System.out.println("blue");
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("¿" + msg3 + "?");
            embed.setDescription(ball);
            embed.setAuthor(event.getAuthor().getAsTag(), "https://www.youtube.com/watch?v=dQw4w9WgXcQ", event.getAuthor().getAvatarUrl());
            embed.setColor(Color.BLUE);
            event.getChannel().sendMessage(embed.build()).queue();

        }
        if (ball.contains("❌")) {
            System.out.println("red");
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("¿" + msg3 + "?");
            embed.setDescription(ball);
            embed.setAuthor(event.getAuthor().getAsTag(), "https://www.youtube.com/watch?v=dQw4w9WgXcQ", event.getAuthor().getAvatarUrl());
            embed.setColor(Color.RED);
            event.getChannel().sendMessage(embed.build()).queue();

        }


    }


    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getInvoke() {
        return "8ball";
    }

}
