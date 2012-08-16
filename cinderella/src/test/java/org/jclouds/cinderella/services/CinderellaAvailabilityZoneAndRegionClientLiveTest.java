package org.jclouds.cinderella.services;

import org.jclouds.ec2.services.AvailabilityZoneAndRegionClientLiveTest;
import org.testng.annotations.Test;

@Test(groups = "live", singleThreaded = true, testName = "CinderellaAvailabilityZoneAndRegionClientLiveTest")
public class CinderellaAvailabilityZoneAndRegionClientLiveTest extends AvailabilityZoneAndRegionClientLiveTest {
   public CinderellaAvailabilityZoneAndRegionClientLiveTest() {
      provider = "cinderella";
   }

}
