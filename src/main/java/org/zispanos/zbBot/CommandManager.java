package org.zispanos.zbBot;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.json.JSONException;
import org.zispanos.zbBot.Commands.Administration.*;
import org.zispanos.zbBot.Commands.C2b2t.PrioqCommand;
import org.zispanos.zbBot.Commands.C2b2t.SeenCommand;
import org.zispanos.zbBot.Commands.C2b2t.StatsCommand;
import org.zispanos.zbBot.Commands.C2b2t.TabCommand;
import org.zispanos.zbBot.Commands.Misc.*;
import org.zispanos.zbBot.Objects.Constants;
import org.zispanos.zbBot.Objects.ICommand;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

public class CommandManager {

    private final Map<String, ICommand> commands = new HashMap<>();

    CommandManager(Random random) {
        addCommand(new HelpCommand());
        addCommand(new PurgeCommand());
        addCommand(new ShutdownCommand());
        addCommand(new UserInfoCommand());
        addCommand(new PrefixCommand());
        addCommand(new SaveConfigCommand());
        addCommand(new BotInfoCommand());
        addCommand(new HelpCommand());
        addCommand(new QueuePeekCommand());
        addCommand(new GetEmoteCommand());
        addCommand(new DonatorRandomMotds());
        addCommand(new RandomMotdCommand());
        addCommand(new SeenCommand());
        addCommand(new PrioqCommand());
        addCommand(new StatsCommand());
        addCommand(new TabCommand());
        addCommand(new RanksCommand());
        addCommand(new ReglasCommand());
        addCommand(new ReportCommand());
        addCommand(new UnzorCommand());
        addCommand(new CramCommand());
        addCommand(new AmongusCommand());
        addCommand(new FurryCommand());
        addCommand(new DadJokeCommand());
        addCommand(new VerifyCommand());
        addCommand(new PenisCommand());
        addCommand(new CopeCommand());
        addCommand(new BasedCommand());
        addCommand(new CramfagCommand());
        addCommand(new VirginCommand());
        addCommand(new UwunzorfagCommand());
    }

    private void addCommand(ICommand command) {
        if (!commands.containsKey(command.getInvoke())) {
            commands.put(command.getInvoke(), command);
        }

    }

    public Collection<ICommand> getCommands() {
        return commands.values();
    }

    void handleCommand(GuildMessageReceivedEvent event) throws InterruptedException, IOException, JSONException, ExecutionException {
        final String prefix = Constants.PREFIXES.get(event.getGuild().getIdLong());

        final String[] split = event.getMessage().getContentRaw().replaceFirst(
                "(?i)" + Pattern.quote(prefix), "").split("\\s+");
        final String invoke = split[0].toLowerCase();

        if (commands.containsKey(invoke)) {
            final List<String> args = Arrays.asList(split).subList(1, split.length);

            commands.get(invoke).handle(args, event);
        }
    }

}