package net.dv8tion;

import at.flauschigesalex.discordLibrary.FlauschigeDiscordLibrary;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

@SuppressWarnings({"unused", "DeprecatedIsStillUsed"})
public abstract class DiscordListener extends ListenerAdapter {

    protected final JDA getJDA() {
        return FlauschigeDiscordLibrary.getJDA();
    }

    @Deprecated public static void registerAll() {
        for (String string : FlauschigeDiscordLibrary.getLibrary().getWorkingDirectoryPath()) {
            for (Class<?> subClass : FlauschigeDiscordLibrary.getLibrary().getReflector().reflect(string).getSubClasses(DiscordListener.class)) {
                try {
                    DiscordListener listener = (DiscordListener) subClass.getConstructor().newInstance();
                    FlauschigeDiscordLibrary.getJDA().addEventListener(listener);
                } catch (Exception fail) {
                    fail.printStackTrace();
                }
            }
        }
    }
}
