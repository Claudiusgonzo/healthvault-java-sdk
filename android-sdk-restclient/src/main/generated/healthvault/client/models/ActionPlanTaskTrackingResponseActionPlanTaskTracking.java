/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The action plans task tracking collection response.
 */
public class ActionPlanTaskTrackingResponseActionPlanTaskTracking {
    /**
     * The collection of tasks tracking occurrences.
     */
    @JsonProperty(value = "taskTrackingInstances")
    private List<ActionPlanTaskTracking> taskTrackingInstances;

    /**
     * The URI for the next page of data.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the taskTrackingInstances value.
     *
     * @return the taskTrackingInstances value
     */
    public List<ActionPlanTaskTracking> taskTrackingInstances() {
        return this.taskTrackingInstances;
    }

    /**
     * Set the taskTrackingInstances value.
     *
     * @param taskTrackingInstances the taskTrackingInstances value to set
     * @return the ActionPlanTaskTrackingResponseActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTrackingResponseActionPlanTaskTracking withTaskTrackingInstances(List<ActionPlanTaskTracking> taskTrackingInstances) {
        this.taskTrackingInstances = taskTrackingInstances;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     * @return the ActionPlanTaskTrackingResponseActionPlanTaskTracking object itself.
     */
    public ActionPlanTaskTrackingResponseActionPlanTaskTracking withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}