package com.microsoft.healthvault.client;

import com.microsoft.healthvault.HealthVaultConfiguration;
import com.microsoft.healthvault.HealthVaultConnectionFactory;
import com.microsoft.healthvault.IHealthVaultSodaConnection;
import com.microsoft.healthvault.methods.getthings3.request.ThingFilterSpec;
import com.microsoft.healthvault.thingtypes.AbstractThing;
import com.microsoft.healthvault.thingtypes.Cholesterol;
import com.microsoft.healthvault.thingtypes.Thing2;
import com.microsoft.healthvault.thingtypes.ThingKey;
import com.microsoft.healthvault.thingtypes.Weight;
import com.microsoft.healthvault.types.Guid;
import com.microsoft.healthvault.types.PersonInfo;
import com.microsoft.healthvault.types.Record;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThingClientTest extends TestCase {
    private HealthVaultConfiguration configuration;
    private IHealthVaultSodaConnection connection;
    private IThingClient thingClient;
    private PersonInfo personInfo;
    private Record record;

    public ThingClientTest() {
    }

    public void setUp() throws Exception {
        this.configuration = TestSettings.getTestConfiguration();
        this.record = TestSettings.getTestRecord();
        this.connection = HealthVaultConnectionFactory.Current().GetOrCreateSodaConnection(this.configuration);
        this.connection.setSessionCredential(TestSettings.getTestSessionCredential());
        this.thingClient = connection.createThingClient();
        this.personInfo = connection.getPersonInfo(); // authenticate or refresh token.
    }

    public void testGetThingById() {
        Weight theThing = this.thingClient.getThingAsync(new Guid(this.record.getId()), new Guid("8f87a5c6-ff24-46b2-903a-380be3ac720c"));

        Assert.assertNotNull(theThing);
        Assert.assertTrue(theThing.getThingType().equalsIgnoreCase(Weight.ThingType));
    }

    public void testGetThingsAsyncGeneric() {
        ArrayList<String> types = new ArrayList<>();
        types.add(Weight.ThingType);
        types.add(Cholesterol.ThingType);

        ThingFilterSpec query = new ThingFilterSpec(types);
        List<AbstractThing> resultThings = this.thingClient.getThingsAsync(new Guid(this.record.getId()), query);

        Assert.assertNotNull(resultThings);
        Assert.assertTrue(resultThings.size() > 0);
    }

    public void testGetThingsWithType() {
        ArrayList<String> types = new ArrayList<>();
        types.add(Weight.ThingType);

        ThingFilterSpec query = new ThingFilterSpec(types);
        List<Weight> resultThings = this.thingClient.getThingsOfTypeAsync(new Guid(this.record.getId()), query);

        Assert.assertNotNull(resultThings);
        Assert.assertTrue(resultThings.size() > 0);
    }

    public void testGetThingsAsyncMultiQuery() {
        ThingFilterSpec spec1 = new ThingFilterSpec(new ArrayList<String>(Arrays.asList(Weight.ThingType)));
        ThingFilterSpec spec2 = new ThingFilterSpec(new ArrayList<String>(Arrays.asList(Cholesterol.ThingType)));

        List<ThingFilterSpec> filters = new ArrayList<>();
        filters.add(spec1);
        filters.add(spec2);

        List<AbstractThing> resultThings = this.thingClient.getThingsAsync(new Guid(this.record.getId()), filters);

        Assert.assertNotNull(resultThings);
        Assert.assertTrue(resultThings.size() > 0);
    }

    public void testCreateThings() {
        Weight weight1 = new Weight(51);
        Weight weight2 = new Weight(52);

        ArrayList<Weight> things = new ArrayList<>();
        things.add(weight1);
        things.add(weight2);

        List<ThingKey> result = this.thingClient.createThingsAsync(new Guid(this.record.getId()), things);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());
    }

    public void testUpdateThings() {
        Weight weight = new Weight(51);

        ArrayList<Weight> things = new ArrayList<>();
        things.add(weight);

        List<ThingKey> result = this.thingClient.createThingsAsync(new Guid(this.record.getId()), things);
        Assert.assertTrue(result.size() > 0);

        ThingKey thingId = result.get(0);
        Weight newWeight = new Weight(55);
        newWeight.getThing().setThingId(thingId);

        things.clear();
        things.add(newWeight);

        this.thingClient.updateThingsAsync(new Guid(this.record.getId()), things);

        Weight theThing = this.thingClient.getThingAsync(new Guid(this.record.getId()), new Guid(thingId.getValue()));

        Assert.assertNotNull(theThing);
        Assert.assertEquals(55.0, (theThing.getValue().getKg()));
    }

    public void testRemoveThings() {
        Weight weight = new Weight(51);

        ArrayList<Weight> things = new ArrayList<>();
        things.add(weight);

        List<ThingKey> result = this.thingClient.createThingsAsync(new Guid(this.record.getId()), things);
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.size());

        ThingKey thingId = result.get(0);

        Weight weightToDelete = new Weight();
        weightToDelete.getThing().setThingId(thingId);
        things.clear();
        things.add(weightToDelete);

        this.thingClient.removeThingsAsync(new Guid(this.record.getId()), things);

        Weight theThing = this.thingClient.getThingAsync(new Guid(this.record.getId()), new Guid(thingId.getValue()));

        Assert.assertNull(theThing);
    }
}
