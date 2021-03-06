/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An action plan objective for the purpose of the adherence report.
 */
public class ObjectiveAdherenceSummary {
    /**
     * The unique identifier of the instance of the objective.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the objective.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The name of the associated outcome.
     */
    @JsonProperty(value = "outcomeName")
    private String outcomeName;

    /**
     * The Tasks associated with this plan.
     */
    @JsonProperty(value = "associatedTasks")
    private List<ActionPlanTaskAdherenceSummary> associatedTasks;

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
     * @return the ObjectiveAdherenceSummary object itself.
     */
    public ObjectiveAdherenceSummary withId(String id) {
        this.id = id;
        return this;
    }

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
     * @return the ObjectiveAdherenceSummary object itself.
     */
    public ObjectiveAdherenceSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the outcomeName value.
     *
     * @return the outcomeName value
     */
    public String outcomeName() {
        return this.outcomeName;
    }

    /**
     * Set the outcomeName value.
     *
     * @param outcomeName the outcomeName value to set
     * @return the ObjectiveAdherenceSummary object itself.
     */
    public ObjectiveAdherenceSummary withOutcomeName(String outcomeName) {
        this.outcomeName = outcomeName;
        return this;
    }

    /**
     * Get the associatedTasks value.
     *
     * @return the associatedTasks value
     */
    public List<ActionPlanTaskAdherenceSummary> associatedTasks() {
        return this.associatedTasks;
    }

    /**
     * Set the associatedTasks value.
     *
     * @param associatedTasks the associatedTasks value to set
     * @return the ObjectiveAdherenceSummary object itself.
     */
    public ObjectiveAdherenceSummary withAssociatedTasks(List<ActionPlanTaskAdherenceSummary> associatedTasks) {
        this.associatedTasks = associatedTasks;
        return this;
    }

}
