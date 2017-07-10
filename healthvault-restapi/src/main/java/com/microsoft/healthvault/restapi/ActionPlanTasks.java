/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi;

import com.microsoft.healthvault.restapi.models.ActionPlanTaskInstanceV2;
import com.microsoft.healthvault.restapi.models.ActionPlanTasksResponseActionPlanTaskInstanceV2;
import com.microsoft.healthvault.restapi.models.ActionPlanTaskTrackingResponseActionPlanTaskTracking;
import com.microsoft.healthvault.restapi.models.ActionPlanTaskV2;
import com.microsoft.healthvault.restapi.models.ErrorResponseException;
import com.microsoft.healthvault.restapi.models.TrackingValidation;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ActionPlanTasks.
 */
public interface ActionPlanTasks {
    /**
     * Get a collection of task definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ActionPlanTasksResponseActionPlanTaskInstanceV2 object if successful.
     */
    ActionPlanTasksResponseActionPlanTaskInstanceV2 get();

    /**
     * Get a collection of task definitions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ActionPlanTasksResponseActionPlanTaskInstanceV2> getAsync(final ServiceCallback<ActionPlanTasksResponseActionPlanTaskInstanceV2> serviceCallback);

    /**
     * Get a collection of task definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTasksResponseActionPlanTaskInstanceV2 object
     */
    Observable<ActionPlanTasksResponseActionPlanTaskInstanceV2> getAsync();

    /**
     * Get a collection of task definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTasksResponseActionPlanTaskInstanceV2 object
     */
    Observable<ServiceResponse<ActionPlanTasksResponseActionPlanTaskInstanceV2>> getWithServiceResponseAsync();
    /**
     * Get a collection of task definitions.
     *
     * @param actionPlanTaskStatus Possible values include: 'Unknown', 'Archived', 'InProgress', 'Recommended', 'Completed', 'Template'
     * @param maxPageSize The maximum number of entries to return per page. Defaults to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ActionPlanTasksResponseActionPlanTaskInstanceV2 object if successful.
     */
    ActionPlanTasksResponseActionPlanTaskInstanceV2 get(String actionPlanTaskStatus, Integer maxPageSize);

    /**
     * Get a collection of task definitions.
     *
     * @param actionPlanTaskStatus Possible values include: 'Unknown', 'Archived', 'InProgress', 'Recommended', 'Completed', 'Template'
     * @param maxPageSize The maximum number of entries to return per page. Defaults to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ActionPlanTasksResponseActionPlanTaskInstanceV2> getAsync(String actionPlanTaskStatus, Integer maxPageSize, final ServiceCallback<ActionPlanTasksResponseActionPlanTaskInstanceV2> serviceCallback);

    /**
     * Get a collection of task definitions.
     *
     * @param actionPlanTaskStatus Possible values include: 'Unknown', 'Archived', 'InProgress', 'Recommended', 'Completed', 'Template'
     * @param maxPageSize The maximum number of entries to return per page. Defaults to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTasksResponseActionPlanTaskInstanceV2 object
     */
    Observable<ActionPlanTasksResponseActionPlanTaskInstanceV2> getAsync(String actionPlanTaskStatus, Integer maxPageSize);

    /**
     * Get a collection of task definitions.
     *
     * @param actionPlanTaskStatus Possible values include: 'Unknown', 'Archived', 'InProgress', 'Recommended', 'Completed', 'Template'
     * @param maxPageSize The maximum number of entries to return per page. Defaults to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTasksResponseActionPlanTaskInstanceV2 object
     */
    Observable<ServiceResponse<ActionPlanTasksResponseActionPlanTaskInstanceV2>> getWithServiceResponseAsync(String actionPlanTaskStatus, Integer maxPageSize);

    /**
     * Put an update for an action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskInstanceV2 value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ActionPlanTasksResponseActionPlanTaskInstanceV2 object if successful.
     */
    ActionPlanTasksResponseActionPlanTaskInstanceV2 replace(ActionPlanTaskInstanceV2 actionPlanTask);

    /**
     * Put an update for an action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskInstanceV2 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ActionPlanTasksResponseActionPlanTaskInstanceV2> replaceAsync(ActionPlanTaskInstanceV2 actionPlanTask, final ServiceCallback<ActionPlanTasksResponseActionPlanTaskInstanceV2> serviceCallback);

    /**
     * Put an update for an action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskInstanceV2 value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTasksResponseActionPlanTaskInstanceV2 object
     */
    Observable<ActionPlanTasksResponseActionPlanTaskInstanceV2> replaceAsync(ActionPlanTaskInstanceV2 actionPlanTask);

    /**
     * Put an update for an action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskInstanceV2 value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTasksResponseActionPlanTaskInstanceV2 object
     */
    Observable<ServiceResponse<ActionPlanTasksResponseActionPlanTaskInstanceV2>> replaceWithServiceResponseAsync(ActionPlanTaskInstanceV2 actionPlanTask);

    /**
     * Post a new action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskV2 value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object create(ActionPlanTaskV2 actionPlanTask);

    /**
     * Post a new action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskV2 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> createAsync(ActionPlanTaskV2 actionPlanTask, final ServiceCallback<Object> serviceCallback);

    /**
     * Post a new action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskV2 value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> createAsync(ActionPlanTaskV2 actionPlanTask);

    /**
     * Post a new action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskV2 value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> createWithServiceResponseAsync(ActionPlanTaskV2 actionPlanTask);

    /**
     * Patch an update for an action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskInstanceV2 value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ActionPlanTasksResponseActionPlanTaskInstanceV2 object if successful.
     */
    ActionPlanTasksResponseActionPlanTaskInstanceV2 update(ActionPlanTaskInstanceV2 actionPlanTask);

    /**
     * Patch an update for an action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskInstanceV2 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ActionPlanTasksResponseActionPlanTaskInstanceV2> updateAsync(ActionPlanTaskInstanceV2 actionPlanTask, final ServiceCallback<ActionPlanTasksResponseActionPlanTaskInstanceV2> serviceCallback);

    /**
     * Patch an update for an action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskInstanceV2 value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTasksResponseActionPlanTaskInstanceV2 object
     */
    Observable<ActionPlanTasksResponseActionPlanTaskInstanceV2> updateAsync(ActionPlanTaskInstanceV2 actionPlanTask);

    /**
     * Patch an update for an action plan task.
     *
     * @param actionPlanTask the ActionPlanTaskInstanceV2 value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTasksResponseActionPlanTaskInstanceV2 object
     */
    Observable<ServiceResponse<ActionPlanTasksResponseActionPlanTaskInstanceV2>> updateWithServiceResponseAsync(ActionPlanTaskInstanceV2 actionPlanTask);

    /**
     * Get a task by id.
     *
     * @param actionPlanTaskId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ActionPlanTaskInstanceV2 object if successful.
     */
    ActionPlanTaskInstanceV2 getById(String actionPlanTaskId);

    /**
     * Get a task by id.
     *
     * @param actionPlanTaskId the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ActionPlanTaskInstanceV2> getByIdAsync(String actionPlanTaskId, final ServiceCallback<ActionPlanTaskInstanceV2> serviceCallback);

    /**
     * Get a task by id.
     *
     * @param actionPlanTaskId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTaskInstanceV2 object
     */
    Observable<ActionPlanTaskInstanceV2> getByIdAsync(String actionPlanTaskId);

    /**
     * Get a task by id.
     *
     * @param actionPlanTaskId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTaskInstanceV2 object
     */
    Observable<ServiceResponse<ActionPlanTaskInstanceV2>> getByIdWithServiceResponseAsync(String actionPlanTaskId);

    /**
     * Delete a task by id.
     *
     * @param actionPlanTaskId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object delete(String actionPlanTaskId);

    /**
     * Delete a task by id.
     *
     * @param actionPlanTaskId the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> deleteAsync(String actionPlanTaskId, final ServiceCallback<Object> serviceCallback);

    /**
     * Delete a task by id.
     *
     * @param actionPlanTaskId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deleteAsync(String actionPlanTaskId);

    /**
     * Delete a task by id.
     *
     * @param actionPlanTaskId the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deleteWithServiceResponseAsync(String actionPlanTaskId);

    /**
     *
     * @param trackingValidation the TrackingValidation value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ActionPlanTaskTrackingResponseActionPlanTaskTracking object if successful.
     */
    ActionPlanTaskTrackingResponseActionPlanTaskTracking validateTracking(TrackingValidation trackingValidation);

    /**
     *
     * @param trackingValidation the TrackingValidation value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ActionPlanTaskTrackingResponseActionPlanTaskTracking> validateTrackingAsync(TrackingValidation trackingValidation, final ServiceCallback<ActionPlanTaskTrackingResponseActionPlanTaskTracking> serviceCallback);

    /**
     *
     * @param trackingValidation the TrackingValidation value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTaskTrackingResponseActionPlanTaskTracking object
     */
    Observable<ActionPlanTaskTrackingResponseActionPlanTaskTracking> validateTrackingAsync(TrackingValidation trackingValidation);

    /**
     *
     * @param trackingValidation the TrackingValidation value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActionPlanTaskTrackingResponseActionPlanTaskTracking object
     */
    Observable<ServiceResponse<ActionPlanTaskTrackingResponseActionPlanTaskTracking>> validateTrackingWithServiceResponseAsync(TrackingValidation trackingValidation);

}
