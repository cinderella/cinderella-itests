package org.jclouds.vblob.blobstore;

import org.jclouds.s3.blobstore.integration.S3ContainerIntegrationLiveTest;
import org.testng.annotations.Test;

@Test(groups =  "live", testName = "VBlobContainerIntegrationLiveTest")
public class VBlobContainerIntegrationLiveTest extends S3ContainerIntegrationLiveTest {
   
   public VBlobContainerIntegrationLiveTest() {
      provider = "vblob";
   }
   
}
