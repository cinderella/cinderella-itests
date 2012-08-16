package org.jclouds.cinderella.services;

import org.jclouds.ec2.services.ElasticBlockStoreClientLiveTest;
import org.testng.annotations.Test;

@Test(groups = "live", singleThreaded = true, testName = "CinderellaElasticBlockStoreClientLiveTest")
public class CinderellaElasticBlockStoreClientLiveTest extends ElasticBlockStoreClientLiveTest {
   public CinderellaElasticBlockStoreClientLiveTest() {
      provider = "cinderella";
   }

}
