package nl.pluglib.util;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class Sidebar {

    public static Scoreboard scoreboard(String title, String... cols) {

        Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective o = sb.registerNewObjective("data", "dummy", Color.translate(title));
        o.setDisplaySlot(DisplaySlot.SIDEBAR);

        for(int i = 0; i < cols.length; i++) {
            Score score = o.getScore(Color.translate(cols[i]));
            score.setScore(cols.length - 1 - i);
        }

        return sb;

    }

}
