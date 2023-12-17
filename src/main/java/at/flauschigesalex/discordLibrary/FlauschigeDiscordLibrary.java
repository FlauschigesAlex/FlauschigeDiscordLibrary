package at.flauschigesalex.discordLibrary;

import at.flauschigesalex.defaultLibrary.FlauschigeLibrary;
import at.flauschigesalex.defaultLibrary.utils.file.JsonManager;
import at.flauschigesalex.defaultLibrary.utils.file.ResourceManager;
import lombok.Getter;
import net.dv8tion.DiscordCommand;
import net.dv8tion.DiscordListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import java.util.List;

public final class FlauschigeDiscordLibrary extends FlauschigeLibrary {

    private static FlauschigeDiscordLibrary flauschigeDiscordLibrary;
    @Getter private static JDA JDA;

    /**
     * Make sure to run this method in your main class!
     * This is extremely important for reflections!
     *
     * @return an instance of the Library
     */
    public static FlauschigeDiscordLibrary getLibrary() {
        if (flauschigeDiscordLibrary == null) flauschigeDiscordLibrary = new FlauschigeDiscordLibrary();
        return flauschigeDiscordLibrary;
    }

    @SuppressWarnings("deprecation")
    private FlauschigeDiscordLibrary() {
        super();

        final ResourceManager resourceManager = ResourceManager.getResource("discord.json");
        if (resourceManager == null) return;
        final JsonManager jsonManager = resourceManager.getJsonManager();
        if (jsonManager == null) return;

        JDA = JDABuilder.create(jsonManager.asString("bot.token"), List.of(GatewayIntent.values())).build();

        DiscordListener.registerAll();
        DiscordCommand.registerAll();
    }
}