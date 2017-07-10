/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An action plan being created for a user.
 */
public class ActionPlanV2 {
    /**
     * The name of the plan, localized.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The description of the plan, localized.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * An HTTPS URL to an image for the plan. Suggested resolution is 212x212
     * with a 25px margin in the image.
     */
    @JsonProperty(value = "imageUrl")
    private String imageUrl;

    /**
     * An HTTPS URL to a thumbnail image for the plan. Suggested resolution is
     * 212x212 with a 25px margin in the image.
     */
    @JsonProperty(value = "thumbnailImageUrl")
    private String thumbnailImageUrl;

    /**
     * The category of the plan. Possible values include: 'Unknown', 'Health',
     * 'Sleep', 'Activity', 'Stress'.
     */
    @JsonProperty(value = "category")
    private String category;

    /**
     * The Collection of objectives for the plan.
     */
    @JsonProperty(value = "objectives")
    private List<Objective> objectives;

    /**
     * The Tasks associated with this plan.
     */
    @JsonProperty(value = "associatedTasks")
    private List<ActionPlanTaskV2> associatedTasks;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ActionPlanV2 object itself.
     */
    public ActionPlanV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the ActionPlanV2 object itself.
     */
    public ActionPlanV2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the imageUrl value.
     *
     * @return the imageUrl value
     */
    public String imageUrl() {
        return this.imageUrl;
    }

    /**
     * Set the imageUrl value.
     *
     * @param imageUrl the imageUrl value to set
     * @return the ActionPlanV2 object itself.
     */
    public ActionPlanV2 withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Get the thumbnailImageUrl value.
     *
     * @return the thumbnailImageUrl value
     */
    public String thumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    /**
     * Set the thumbnailImageUrl value.
     *
     * @param thumbnailImageUrl the thumbnailImageUrl value to set
     * @return the ActionPlanV2 object itself.
     */
    public ActionPlanV2 withThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
        return this;
    }

    /**
     * Get the category value.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category value.
     *
     * @param category the category value to set
     * @return the ActionPlanV2 object itself.
     */
    public ActionPlanV2 withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the objectives value.
     *
     * @return the objectives value
     */
    public List<Objective> objectives() {
        return this.objectives;
    }

    /**
     * Set the objectives value.
     *
     * @param objectives the objectives value to set
     * @return the ActionPlanV2 object itself.
     */
    public ActionPlanV2 withObjectives(List<Objective> objectives) {
        this.objectives = objectives;
        return this;
    }

    /**
     * Get the associatedTasks value.
     *
     * @return the associatedTasks value
     */
    public List<ActionPlanTaskV2> associatedTasks() {
        return this.associatedTasks;
    }

    /**
     * Set the associatedTasks value.
     *
     * @param associatedTasks the associatedTasks value to set
     * @return the ActionPlanV2 object itself.
     */
    public ActionPlanV2 withAssociatedTasks(List<ActionPlanTaskV2> associatedTasks) {
        this.associatedTasks = associatedTasks;
        return this;
    }

}
