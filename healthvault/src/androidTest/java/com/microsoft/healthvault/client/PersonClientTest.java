package com.microsoft.healthvault.client;

import com.microsoft.healthvault.HealthVaultConfiguration;
import com.microsoft.healthvault.HealthVaultConnectionFactory;
import com.microsoft.healthvault.IHealthVaultSodaConnection;
import com.microsoft.healthvault.types.Guid;
import com.microsoft.healthvault.types.PersonInfo;
import com.microsoft.healthvault.types.Record;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class PersonClientTest extends TestCase {
    private HealthVaultConfiguration configuration;
    private IHealthVaultSodaConnection connection;
    private IPersonClient personClient;
    private Record record;

    public PersonClientTest() {
    }

    public void setUp() throws Exception {
        this.configuration = TestSettings.getTestConfiguration();
        this.record = TestSettings.getTestRecord();
        this.connection = HealthVaultConnectionFactory.Current().GetOrCreateSodaConnection(this.configuration);
        this.connection.setSessionCredential(TestSettings.getTestSessionCredential());
        this.personClient = connection.createPersonClient();
        connection.getPersonInfo(); // authenticate or refresh token.
    }

    public void testGetPersonInfo() {
        PersonInfo personInfo = this.personClient.getPersonInfoAsync();

        Assert.assertNotNull(personInfo);
    }

    public void testGetApplicationSettings() {
        HashMap<String, String> settings = new HashMap<String, String>();
        settings.put("mysetting", "somevalue");
        settings.put("othersetting", "othervalue");
        this.personClient.setApplicationSettingsAsync(settings);

        HashMap<String, String> result = this.personClient.getApplicationSettingsAsync();

        Assert.assertNotNull(result);
        Assert.assertTrue(result.containsKey("mysetting"));
        Assert.assertTrue(result.containsKey("othersetting"));
        Assert.assertEquals("somevalue", result.get("mysetting"));
        Assert.assertEquals("othervalue", result.get("othersetting"));
    }

    public void testSetApplicationSettings() throws Exception{
        HashMap<String, String> settings = new HashMap<String, String>();
        settings.put("mysetting", "somevalue");

        this.personClient.setApplicationSettingsAsync(settings);
    }

    public void testGetAuthorizedPeople() {
        List<PersonInfo> people = this.personClient.getAuthorizedPeopleAsync();

        Assert.assertNotNull(people);
        Assert.assertTrue(people.size() > 0);
    }

    public void testGetAuthorizedRecords() {
        ArrayList<Guid> recordIds = new ArrayList<Guid>();
        recordIds.add(new Guid(this.record.getId()));

        List<Record> results = this.personClient.getAuthorizedRecordsAsync(recordIds);

        Assert.assertNotNull(results);
        Assert.assertTrue(results.size() > 0);
    }
}