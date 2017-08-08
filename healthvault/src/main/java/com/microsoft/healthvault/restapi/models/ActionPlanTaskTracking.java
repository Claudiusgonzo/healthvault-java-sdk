/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.util.UUID;

/**
 * A tracking object for an Action Plan Task.
 */
public class ActionPlanTaskTracking {
    /**
     * Gets or sets the Id of the task tracking.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Gets or sets the task tracking type. Possible values include: 'Unknown',
     * 'Manual', 'Auto'.
     */
    @JsonProperty(value = "trackingType")
    private String trackingType;

    /**
     * Gets or sets the timezone offset of the task tracking,
     * if a task is local time based, it should be set as null.
     */
    @JsonProperty(value = "timeZoneOffset")
    private Integer timeZoneOffset;

    /**
     * Gets or sets the task tracking time.
     */
    @JsonProperty(value = "trackingDateTime")
    private DateTime trackingDateTime;

    /**
     * Gets or sets the creation time of the task tracking.
     */
    @JsonProperty(value = "creationDateTime")
    private DateTime creationDateTime;

    /**
     * Gets or sets the task tracking status. Possible values include:
     * 'Unknown', 'Occurrence', 'Completion', 'OutOfWindow'.
     */
    @JsonProperty(value = "trackingStatus")
    private String trackingStatus;

    /**
     * Gets or sets the start time of the occurrence window,
     * it is null for Completion and OutOfWindow tracking.
     */
    @JsonProperty(value = "occurrenceStart")
    private DateTime occurrenceStart;

    /**
     * Gets or sets the end time of the occurrence window,
     * it is null for Completion and OutOfWindow tracking.
     */
    @JsonProperty(value = "occurrenceEnd")
    private DateTime occurrenceEnd;

    /**
     * Gets or sets the start time of the completion window.
     */
    @JsonProperty(value = "completionStart")
    private DateTime completionStart;

    /**
     * Gets or sets the end time of the completion window.
     */
    @JsonProperty(value = "completionEnd")
    private DateTime completionEnd;

    /**
     * Gets or sets task Id.
     */
    @JsonProperty(value = "taskId")
    private UUID taskId;

    /**
     * Gets or sets the tracking feedback.
     */
    @JsonProperty(value = "feedback")
    private String feedback;

    /**
     * Gets or sets the evidence of the task tracking.
     */
    @JsonProperty(value = "evidence")
    private ActionPlanTaskTrackingEvidence evidence;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the trackingType value.
     *
     * @return the trackingType value
     */
    public String trackingType() {
        return this.trackingType;
    }

    /**
     * Set the trackingType value.
     *
     * @param trackingType the trackingType value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withTrackingType(String trackingType) {
        this.trackingType = trackingType;
        return this;
    }

    /**
     * Get the timeZoneOffset value.
     *
     * @return the timeZoneOffset value
     */
    public Integer timeZoneOffset() {
        return this.timeZoneOffset;
    }

    /**
     * Set the timeZoneOffset value.
     *
     * @param timeZoneOffset the timeZoneOffset value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withTimeZoneOffset(Integer timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
        return this;
    }

    /**
     * Get the trackingDateTime value.
     *
     * @return the trackingDateTime value
     */
    public DateTime trackingDateTime() {
        return this.trackingDateTime;
    }

    /**
     * Set the trackingDateTime value.
     *
     * @param trackingDateTime the trackingDateTime value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withTrackingDateTime(DateTime trackingDateTime) {
        this.trackingDateTime = trackingDateTime;
        return this;
    }

    /**
     * Get the creationDateTime value.
     *
     * @return the creationDateTime value
     */
    public DateTime creationDateTime() {
        return this.creationDateTime;
    }

    /**
     * Set the creationDateTime value.
     *
     * @param creationDateTime the creationDateTime value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Get the trackingStatus value.
     *
     * @return the trackingStatus value
     */
    public String trackingStatus() {
        return this.trackingStatus;
    }

    /**
     * Set the trackingStatus value.
     *
     * @param trackingStatus the trackingStatus value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withTrackingStatus(String trackingStatus) {
        this.trackingStatus = trackingStatus;
        return this;
    }

    /**
     * Get the occurrenceStart value.
     *
     * @return the occurrenceStart value
     */
    public DateTime occurrenceStart() {
        return this.occurrenceStart;
    }

    /**
     * Set the occurrenceStart value.
     *
     * @param occurrenceStart the occurrenceStart value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withOccurrenceStart(DateTime occurrenceStart) {
        this.occurrenceStart = occurrenceStart;
        return this;
    }

    /**
     * Get the occurrenceEnd value.
     *
     * @return the occurrenceEnd value
     */
    public DateTime occurrenceEnd() {
        return this.occurrenceEnd;
    }

    /**
     * Set the occurrenceEnd value.
     *
     * @param occurrenceEnd the occurrenceEnd value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withOccurrenceEnd(DateTime occurrenceEnd) {
        this.occurrenceEnd = occurrenceEnd;
        return this;
    }

    /**
     * Get the completionStart value.
     *
     * @return the completionStart value
     */
    public DateTime completionStart() {
        return this.completionStart;
    }

    /**
     * Set the completionStart value.
     *
     * @param completionStart the completionStart value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withCompletionStart(DateTime completionStart) {
        this.completionStart = completionStart;
        return this;
    }

    /**
     * Get the completionEnd value.
     *
     * @return the completionEnd value
     */
    public DateTime completionEnd() {
        return this.completionEnd;
    }

    /**
     * Set the completionEnd value.
     *
     * @param completionEnd the completionEnd value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withCompletionEnd(DateTime completionEnd) {
        this.completionEnd = completionEnd;
        return this;
    }

    /**
     * Get the taskId value.
     *
     * @return the taskId value
     */
    public UUID taskId() {
        return this.taskId;
    }

    /**
     * Set the taskId value.
     *
     * @param taskId the taskId value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withTaskId(UUID taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the feedback value.
     *
     * @return the feedback value
     */
    public String feedback() {
        return this.feedback;
    }

    /**
     * Set the feedback value.
     *
     * @param feedback the feedback value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }

    /**
     * Get the evidence value.
     *
     * @return the evidence value
     */
    public ActionPlanTaskTrackingEvidence evidence() {
        return this.evidence;
    }

    /**
     * Set the evidence value.
     *
     * @param evidence the evidence value to set
     * @return the ActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTracking withEvidence(ActionPlanTaskTrackingEvidence evidence) {
        this.evidence = evidence;
        return this;
    }

}
