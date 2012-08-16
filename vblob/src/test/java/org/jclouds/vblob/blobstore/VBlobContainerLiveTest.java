package org.jclouds.vblob.blobstore;

import org.jclouds.s3.blobstore.integration.S3ContainerLiveTest;
import org.testng.annotations.Test;

@Test(groups =  "live", testName = "VBlobContainerLiveTest")
public class VBlobContainerLiveTest extends S3ContainerLiveTest {
   
   public VBlobContainerLiveTest() {
      provider = "vblob";
   }
   
}
