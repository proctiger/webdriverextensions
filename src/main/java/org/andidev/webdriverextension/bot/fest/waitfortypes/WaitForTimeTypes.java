package org.andidev.webdriverextension.bot.fest.waitfortypes;

import java.util.concurrent.TimeUnit;
import org.andidev.webdriverextension.bot.BotUtils;

public class WaitForTimeTypes {

    private final double time;

    public WaitForTimeTypes(double time) {
        this.time = time;
    }

    public void days() {
        BotUtils.waitFor(time, TimeUnit.DAYS);
    }

    public void hours() {
        BotUtils.waitFor(time, TimeUnit.HOURS);
    }

    public void minutes() {
        BotUtils.waitFor(time, TimeUnit.HOURS);
    }

    public void seconds() {
        BotUtils.waitFor(time);
    }

    public void milliSeconds() {
        BotUtils.waitFor(time, TimeUnit.MILLISECONDS);
    }

    public void microSeconds() {
        BotUtils.waitFor(time, TimeUnit.MICROSECONDS);
    }

    public void nanoSeconds() {
        BotUtils.waitFor(time, TimeUnit.NANOSECONDS);
    }
}