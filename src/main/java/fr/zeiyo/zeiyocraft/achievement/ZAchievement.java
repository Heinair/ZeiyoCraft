package fr.zeiyo.zeiyocraft.achievement;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

/**
 * Created by Luca on 20/11/2016.
 */
public class ZAchievement
{
    public static Achievement achievementNewBorn;

    public static void initAchievement()
    {

        achievementNewBorn = new Achievement("achievement.newborn", "newborn", 0, 0, Items.EGG, (Achievement)null);

    }

    public static void registerAchievements()
    {

        achievementNewBorn.registerStat();
        AchievementPage.registerAchievementPage(new AchievementPage("Achievements+", new Achievement[] {achievementNewBorn}));

    }





}
