/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.implementation;

import com.microsoft.healthvault.restapi.ActionPlanObjectives;
import com.microsoft.healthvault.restapi.ActionPlanTasks;
import com.microsoft.healthvault.restapi.ActionPlans;
import com.microsoft.healthvault.restapi.GoalRecommendations;
import com.microsoft.healthvault.restapi.Goals;
import com.microsoft.healthvault.restapi.MicrosoftHealthVaultRestApi;
import com.microsoft.healthvault.restapi.Onboardings;
import com.microsoft.healthvault.restapi.Sleeps;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceClient;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the MicrosoftHealthVaultRestApi class.
 */
public class MicrosoftHealthVaultRestApiImpl extends ServiceClient implements MicrosoftHealthVaultRestApi {

    /**
     * The ActionPlans object to access its operations.
     */
    private ActionPlans actionPlans;

    /**
     * Gets the ActionPlans object to access its operations.
     * @return the ActionPlans object.
     */
    public ActionPlans actionPlans() {
        return this.actionPlans;
    }

    /**
     * The ActionPlanObjectives object to access its operations.
     */
    private ActionPlanObjectives actionPlanObjectives;

    /**
     * Gets the ActionPlanObjectives object to access its operations.
     * @return the ActionPlanObjectives object.
     */
    public ActionPlanObjectives actionPlanObjectives() {
        return this.actionPlanObjectives;
    }

    /**
     * The ActionPlanTasks object to access its operations.
     */
    private ActionPlanTasks actionPlanTasks;

    /**
     * Gets the ActionPlanTasks object to access its operations.
     * @return the ActionPlanTasks object.
     */
    public ActionPlanTasks actionPlanTasks() {
        return this.actionPlanTasks;
    }

    /**
     * The Goals object to access its operations.
     */
    private Goals goals;

    /**
     * Gets the Goals object to access its operations.
     * @return the Goals object.
     */
    public Goals goals() {
        return this.goals;
    }

    /**
     * The GoalRecommendations object to access its operations.
     */
    private GoalRecommendations goalRecommendations;

    /**
     * Gets the GoalRecommendations object to access its operations.
     * @return the GoalRecommendations object.
     */
    public GoalRecommendations goalRecommendations() {
        return this.goalRecommendations;
    }

    /**
     * The Onboardings object to access its operations.
     */
    private Onboardings onboardings;

    /**
     * Gets the Onboardings object to access its operations.
     * @return the Onboardings object.
     */
    public Onboardings onboardings() {
        return this.onboardings;
    }

    /**
     * The Sleeps object to access its operations.
     */
    private Sleeps sleeps;

    /**
     * Gets the Sleeps object to access its operations.
     * @return the Sleeps object.
     */
    public Sleeps sleeps() {
        return this.sleeps;
    }

    /**
     * Initializes an instance of MicrosoftHealthVaultRestApi client.
     */
    public MicrosoftHealthVaultRestApiImpl() {
        this("https://data.ppe.microsofthealth.net");
    }

    /**
     * Initializes an instance of MicrosoftHealthVaultRestApi client.
     *
     * @param baseUrl the base URL of the host
     */
    public MicrosoftHealthVaultRestApiImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of MicrosoftHealthVaultRestApi client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public MicrosoftHealthVaultRestApiImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://data.ppe.microsofthealth.net", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of MicrosoftHealthVaultRestApi client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public MicrosoftHealthVaultRestApiImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of MicrosoftHealthVaultRestApi client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public MicrosoftHealthVaultRestApiImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.actionPlans = new ActionPlansImpl(retrofit(), this);
        this.actionPlanObjectives = new ActionPlanObjectivesImpl(retrofit(), this);
        this.actionPlanTasks = new ActionPlanTasksImpl(retrofit(), this);
        this.goals = new GoalsImpl(retrofit(), this);
        this.goalRecommendations = new GoalRecommendationsImpl(retrofit(), this);
        this.onboardings = new OnboardingsImpl(retrofit(), this);
        this.sleeps = new SleepsImpl(retrofit(), this);
    }
}
