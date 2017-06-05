/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SystemThreadingCancellationToken model.
 */
public class SystemThreadingCancellationToken {
    /**
     * The isCancellationRequested property.
     */
    @JsonProperty(value = "isCancellationRequested", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isCancellationRequested;

    /**
     * The canBeCanceled property.
     */
    @JsonProperty(value = "canBeCanceled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean canBeCanceled;

    /**
     * The waitHandle property.
     */
    @JsonProperty(value = "waitHandle", access = JsonProperty.Access.WRITE_ONLY)
    private SystemThreadingWaitHandle waitHandle;

    /**
     * Get the isCancellationRequested value.
     *
     * @return the isCancellationRequested value
     */
    public Boolean isCancellationRequested() {
        return this.isCancellationRequested;
    }

    /**
     * Get the canBeCanceled value.
     *
     * @return the canBeCanceled value
     */
    public Boolean canBeCanceled() {
        return this.canBeCanceled;
    }

    /**
     * Get the waitHandle value.
     *
     * @return the waitHandle value
     */
    public SystemThreadingWaitHandle waitHandle() {
        return this.waitHandle;
    }

}