/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

/**
 * An instance of a goal recommendation associated to a user.
 */
public class GoalRecommendationInstance {
    /**
     * The identifier of the recommendation.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The ID of the organization that manages this recommendation.
     */
    @JsonProperty(value = "organizationId")
    private String organizationId;

    /**
     * The name of the organization that manages this recommendation.
     */
    @JsonProperty(value = "organizationName")
    private String organizationName;

    /**
     * Specifies if the user has used the recommendation to set a goal.
     */
    @JsonProperty(value = "acknowledged")
    private Boolean acknowledged;

    /**
     * The expiration date of the recommendation in Universal Time Zone(UTC).
     */
    @JsonProperty(value = "expirationDate")
    private DateTime expirationDate;

    /**
     * The associated goal data.
     */
    @JsonProperty(value = "associatedGoal")
    private Goal associatedGoal;

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
     * @return the GoalRecommendationInstance object itself.
     */
    public GoalRecommendationInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the organizationId value.
     *
     * @return the organizationId value
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * Set the organizationId value.
     *
     * @param organizationId the organizationId value to set
     * @return the GoalRecommendationInstance object itself.
     */
    public GoalRecommendationInstance withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Get the organizationName value.
     *
     * @return the organizationName value
     */
    public String organizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName value.
     *
     * @param organizationName the organizationName value to set
     * @return the GoalRecommendationInstance object itself.
     */
    public GoalRecommendationInstance withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the acknowledged value.
     *
     * @return the acknowledged value
     */
    public Boolean acknowledged() {
        return this.acknowledged;
    }

    /**
     * Set the acknowledged value.
     *
     * @param acknowledged the acknowledged value to set
     * @return the GoalRecommendationInstance object itself.
     */
    public GoalRecommendationInstance withAcknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
        return this;
    }

    /**
     * Get the expirationDate value.
     *
     * @return the expirationDate value
     */
    public DateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate value.
     *
     * @param expirationDate the expirationDate value to set
     * @return the GoalRecommendationInstance object itself.
     */
    public GoalRecommendationInstance withExpirationDate(DateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the associatedGoal value.
     *
     * @return the associatedGoal value
     */
    public Goal associatedGoal() {
        return this.associatedGoal;
    }

    /**
     * Set the associatedGoal value.
     *
     * @param associatedGoal the associatedGoal value to set
     * @return the GoalRecommendationInstance object itself.
     */
    public GoalRecommendationInstance withAssociatedGoal(Goal associatedGoal) {
        this.associatedGoal = associatedGoal;
        return this;
    }

}
