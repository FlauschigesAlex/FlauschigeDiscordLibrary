package net.dv8tion;

import at.flauschigesalex.discordLibrary.FlauschigeDiscordLibrary;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.requests.restaction.CommandCreateAction;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("DeprecatedIsStillUsed")
public abstract class DiscordCommand extends PreDiscordCommand {
    @Deprecated
    public final void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if (!event.getInteraction().getCommandString().equalsIgnoreCase(command())) return;
        this.runCommand(event);
    }

    protected abstract void runCommand(final @NotNull SlashCommandInteractionEvent event);

    protected abstract @NotNull String command();
    protected @NotNull String description() {
        return "Default command description";
    }
    protected boolean guildOnly() {
        return false;
    }
    protected boolean nsfw() {
        return false;
    }
    protected List<DiscordCommandArgument> arguments() {
        return new ArrayList<>();
    }

    @Deprecated public static void registerAll() {
        for (String string : FlauschigeDiscordLibrary.getLibrary().getWorkingDirectoryPath()) {
            for (Class<?> subClass : FlauschigeDiscordLibrary.getLibrary().getReflector().reflect(string).getSubClasses(DiscordCommand.class)) {
                try {
                    DiscordCommand source = (DiscordCommand) subClass.getConstructor().newInstance();
                    CommandCreateAction commandAction = FlauschigeDiscordLibrary.getJDA().upsertCommand(source.command(), source.description());
                    commandAction = commandAction.setGuildOnly(source.guildOnly());
                    commandAction = commandAction.setNSFW(source.nsfw());
                    for (DiscordCommandArgument commandArgument : source.arguments()) {
                        commandAction = commandAction.addOption(commandArgument.getType(), commandArgument.getName(), commandArgument.getDescription(), commandArgument.isRequired(), commandArgument.isAutoComplete());
                    }
                    commandAction.queue();
                } catch (Exception fail) {
                    fail.printStackTrace();
                }
            }
        }
    }
}

