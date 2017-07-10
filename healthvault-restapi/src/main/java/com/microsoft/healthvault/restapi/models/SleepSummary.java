/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SleepSummary Type.
 */
public class SleepSummary {
    /**
     * The ISO 8601 formatted time the user went to bed.
     */
    @JsonProperty(value = "bedtime")
    private String bedtime;

    /**
     * The ISO 8601 formatted time the user took to fall asleep.
     */
    @JsonProperty(value = "fallAsleepDuration")
    private String fallAsleepDuration;

    /**
     * The ISO 8601 formatted time the user woke up.
     */
    @JsonProperty(value = "wakeupTime")
    private String wakeupTime;

    /**
     * The ISO 8601 formatted time the user was asleep during the activity.
     */
    @JsonProperty(value = "sleepDuration")
    private String sleepDuration;

    /**
     * Get the bedtime value.
     *
     * @return the bedtime value
     */
    public String bedtime() {
        return this.bedtime;
    }

    /**
     * Set the bedtime value.
     *
     * @param bedtime the bedtime value to set
     * @return the SleepSummary object itself.
     */
    public SleepSummary withBedtime(String bedtime) {
        this.bedtime = bedtime;
        return this;
    }

    /**
     * Get the fallAsleepDuration value.
     *
     * @return the fallAsleepDuration value
     */
    public String fallAsleepDuration() {
        return this.fallAsleepDuration;
    }

    /**
     * Set the fallAsleepDuration value.
     *
     * @param fallAsleepDuration the fallAsleepDuration value to set
     * @return the SleepSummary object itself.
     */
    public SleepSummary withFallAsleepDuration(String fallAsleepDuration) {
        this.fallAsleepDuration = fallAsleepDuration;
        return this;
    }

    /**
     * Get the wakeupTime value.
     *
     * @return the wakeupTime value
     */
    public String wakeupTime() {
        return this.wakeupTime;
    }

    /**
     * Set the wakeupTime value.
     *
     * @param wakeupTime the wakeupTime value to set
     * @return the SleepSummary object itself.
     */
    public SleepSummary withWakeupTime(String wakeupTime) {
        this.wakeupTime = wakeupTime;
        return this;
    }

    /**
     * Get the sleepDuration value.
     *
     * @return the sleepDuration value
     */
    public String sleepDuration() {
        return this.sleepDuration;
    }

    /**
     * Set the sleepDuration value.
     *
     * @param sleepDuration the sleepDuration value to set
     * @return the SleepSummary object itself.
     */
    public SleepSummary withSleepDuration(String sleepDuration) {
        this.sleepDuration = sleepDuration;
        return this;
    }

}
