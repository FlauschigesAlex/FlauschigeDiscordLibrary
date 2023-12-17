package net.dv8tion;

import lombok.Getter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import org.jetbrains.annotations.NotNull;

@Getter
@SuppressWarnings("unused")
public final class DiscordCommandArgument {

    private final OptionType type;
    private final String name;
    private String description;
    private boolean required;
    private boolean autoComplete;

    @Deprecated
    public DiscordCommandArgument(@NotNull OptionType type, @NotNull String name) {
        this.type = type;
        this.name = name;
    }
    public DiscordCommandArgument(@NotNull OptionType type, @NotNull String name, @NotNull String description) {
        this.type = type;
        this.name = name;
        this.description = description;
    }

    /**
     * @deprecated
     * @see #DiscordCommandArgument(OptionType, String, String) DiscordCommandArgument(OptionType type, String name, String description)
     */
    public DiscordCommandArgument description(@NotNull String description) {
        this.description = description;
        return this;
    }

    public DiscordCommandArgument required(boolean required) {
        this.required = required;
        return this;
    }

    public DiscordCommandArgument autoComplete(boolean autoComplete) {
        this.autoComplete = autoComplete;
        return this;
    }
}
