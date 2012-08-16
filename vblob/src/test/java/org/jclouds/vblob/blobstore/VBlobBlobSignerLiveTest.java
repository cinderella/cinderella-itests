package org.jclouds.vblob.blobstore;

import org.jclouds.s3.blobstore.integration.S3BlobSignerLiveTest;
import org.testng.annotations.Test;

@Test(groups =  "live", testName = "VBlobBlobSignerLiveTest")
public class VBlobBlobSignerLiveTest extends S3BlobSignerLiveTest {
   
   public VBlobBlobSignerLiveTest() {
      provider = "vblob";
   }
   
}
