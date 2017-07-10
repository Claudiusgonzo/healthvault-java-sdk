/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * sleep information.
 */
public class Sleep {
    /**
     * The unique identifier for the Sleep Activity.
     */
    @JsonProperty(value = "sleepId")
    private String sleepId;

    /**
     * The unique identifier of the user.
     */
    @JsonProperty(value = "userId")
    private String userId;

    /**
     * The ISO 8601 formatted start time of the activity.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The ISO 8601 formatted end time of the activity.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The Sleep Summary details.
     */
    @JsonProperty(value = "sleepSummary")
    private SleepSummary sleepSummary;

    /**
     * The WakeState at the end of Activity, possible values are WideAwake,
     * Tired, Sleepy. Possible values include: 'Unknown', 'WideAwake', 'Tired',
     * 'Sleepy'.
     */
    @JsonProperty(value = "wakeState")
    private String wakeState;

    /**
     * Gets or sets the audit record for the last time the entity was changed.
     */
    @JsonProperty(value = "lastModifiedBy")
    private Audit lastModifiedBy;

    /**
     * Gets or sets the audit record for when the entity was first created.
     */
    @JsonProperty(value = "createdBy")
    private Audit createdBy;

    /**
     * Get the sleepId value.
     *
     * @return the sleepId value
     */
    public String sleepId() {
        return this.sleepId;
    }

    /**
     * Set the sleepId value.
     *
     * @param sleepId the sleepId value to set
     * @return the Sleep object itself.
     */
    public Sleep withSleepId(String sleepId) {
        this.sleepId = sleepId;
        return this;
    }

    /**
     * Get the userId value.
     *
     * @return the userId value
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId value.
     *
     * @param userId the userId value to set
     * @return the Sleep object itself.
     */
    public Sleep withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the Sleep object itself.
     */
    public Sleep withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the Sleep object itself.
     */
    public Sleep withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the sleepSummary value.
     *
     * @return the sleepSummary value
     */
    public SleepSummary sleepSummary() {
        return this.sleepSummary;
    }

    /**
     * Set the sleepSummary value.
     *
     * @param sleepSummary the sleepSummary value to set
     * @return the Sleep object itself.
     */
    public Sleep withSleepSummary(SleepSummary sleepSummary) {
        this.sleepSummary = sleepSummary;
        return this;
    }

    /**
     * Get the wakeState value.
     *
     * @return the wakeState value
     */
    public String wakeState() {
        return this.wakeState;
    }

    /**
     * Set the wakeState value.
     *
     * @param wakeState the wakeState value to set
     * @return the Sleep object itself.
     */
    public Sleep withWakeState(String wakeState) {
        this.wakeState = wakeState;
        return this;
    }

    /**
     * Get the lastModifiedBy value.
     *
     * @return the lastModifiedBy value
     */
    public Audit lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy value.
     *
     * @param lastModifiedBy the lastModifiedBy value to set
     * @return the Sleep object itself.
     */
    public Sleep withLastModifiedBy(Audit lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the createdBy value.
     *
     * @return the createdBy value
     */
    public Audit createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy value.
     *
     * @param createdBy the createdBy value to set
     * @return the Sleep object itself.
     */
    public Sleep withCreatedBy(Audit createdBy) {
        this.createdBy = createdBy;
        return this;
    }

}
