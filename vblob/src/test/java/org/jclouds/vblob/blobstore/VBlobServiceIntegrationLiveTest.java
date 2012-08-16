package org.jclouds.vblob.blobstore;

import org.jclouds.s3.blobstore.integration.S3ServiceIntegrationLiveTest;
import org.testng.annotations.Test;

@Test(groups =  "live", testName = "VBlobServiceIntegrationLiveTest")
public class VBlobServiceIntegrationLiveTest extends S3ServiceIntegrationLiveTest {
   
   public VBlobServiceIntegrationLiveTest() {
      provider = "vblob";
   }
  
}
