package org.zispanos.zbBot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.guild.GuildLeaveEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.zispanos.zbBot.Listeners.ReactionEventListener;
import org.zispanos.zbBot.Utils.FactsUtil;

import javax.security.auth.login.LoginException;
import java.util.Random;

public class Main extends ListenerAdapter {
    private static final Random random = new Random();

    static CommandManager commandManager = new CommandManager(random);
    static Listener listener = new Listener(commandManager);

    public static void main(String[] args) throws LoginException {
        FactsUtil.Load();
        JDABuilder.createLight(TOKEN.token)
                .setActivity(Activity.watching("MrCramYT"))
                .setStatus(OnlineStatus.ONLINE)
                .addEventListeners(listener, new Main(), new ReactionEventListener())
                .build();

    }

    @Override
    public void onGuildJoin(GuildJoinEvent event) {
        super.onGuildJoin(event);
        System.out.println("**************************************************************");
        System.out.println("--------------------------------------------------------------");
        System.out.println("" +
                "░██╗░░░░░░░██╗░█████╗░██████╗░███╗░░██╗██╗███╗░░██╗░██████╗░\n" +
                "░██║░░██╗░░██║██╔══██╗██╔══██╗████╗░██║██║████╗░██║██╔════╝░\n" +
                "░╚██╗████╗██╔╝███████║██████╔╝██╔██╗██║██║██╔██╗██║██║░░██╗░\n" +
                "░░████╔═████║░██╔══██║██╔══██╗██║╚████║██║██║╚████║██║░░╚██╗\n" +
                "░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║██║░╚███║██║██║░╚███║╚██████╔╝\n" +
                "░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝╚═╝░░╚══╝░╚═════╝░");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("" +
                "███╗░░██╗███████╗░██╗░░░░░░░██╗░░░░░░░██████╗░██╗░░░██╗██╗██╗░░░░░██████╗\n" +
                "████╗░██║██╔════╝░██║░░██╗░░██║░░░░░░██╔════╝░██║░░░██║██║██║░░░░░██╔══██╗\n" +
                "██╔██╗██║█████╗░░░╚██╗████╗██╔╝░░░░░░██║░░██╗░██║░░░██║██║██║░░░░░██║░░██║\n" +
                "██║╚████║██╔══╝░░░░████╔═████║░░░░░░░██║░░╚██╗██║░░░██║██║██║░░░░░██║░░██║\n" +
                "██║░╚███║███████╗░░╚██╔╝░╚██╔╝░░░░░░░╚██████╔╝╚██████╔╝██║███████╗██████╔╝\n" +
                "╚═╝░░╚══╝╚══════╝░░░╚═╝░░░╚═╝░░░░░░░░░╚═════╝░░╚═════╝░╚═╝╚══════╝╚═════╝");
        System.out.println("--------------------------------------------------------------");
        System.out.println("**************************************************************");

    }

    @Override
        public void onGuildLeave (GuildLeaveEvent event){
            super.onGuildLeave(event);
            System.out.println("**************************************************************");
            System.out.println("--------------------------------------------------------------");
            System.out.println("" +
                    "░██╗░░░░░░░██╗░█████╗░██████╗░███╗░░██╗██╗███╗░░██╗░██████╗░\n" +
                    "░██║░░██╗░░██║██╔══██╗██╔══██╗████╗░██║██║████╗░██║██╔════╝░\n" +
                    "░╚██╗████╗██╔╝███████║██████╔╝██╔██╗██║██║██╔██╗██║██║░░██╗░\n" +
                    "░░████╔═████║░██╔══██║██╔══██╗██║╚████║██║██║╚████║██║░░╚██╗\n" +
                    "░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║██║░╚███║██║██║░╚███║╚██████╔╝\n" +
                    "░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝╚═╝░░╚══╝░╚═════╝░");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("" +
                    "░██████╗░██╗░░░██╗██╗██╗░░░░░██████╗░░░░░░░░██╗░░░░░███████╗███████╗████████╗\n" +
                    "██╔════╝░██║░░░██║██║██║░░░░░██╔══██╗░░░░░░░██║░░░░░██╔════╝██╔════╝╚══██╔══╝\n" +
                    "██║░░██╗░██║░░░██║██║██║░░░░░██║░░██║░░░░░░░██║░░░░░█████╗░░█████╗░░░░░██║░░░\n" +
                    "██║░░╚██╗██║░░░██║██║██║░░░░░██║░░██║░░░░░░░██║░░░░░██╔══╝░░██╔══╝░░░░░██║░░░\n" +
                    "╚██████╔╝╚██████╔╝██║███████╗██████╔╝░░░░░░░███████╗███████╗██║░░░░░░░░██║░░░\n" +
                    "░╚═════╝░░╚═════╝░╚═╝╚══════╝╚═════╝░░░░░░░░╚══════╝╚══════╝╚═╝░░░░░░░░╚═╝░░░");
            System.out.println("--------------------------------------------------------------");
            System.out.println("**************************************************************");
        }


    //R80336
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()) {
            String MSG = ("Seems like we received a message from \"" + event.getAuthor().getAsTag() + "\", aka \"" + event.getAuthor().getName() + "\" that says: " + event.getMessage().getContentDisplay());
            System.out.println("DEBUG: "+MSG);
        }
    }
}
