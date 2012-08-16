package org.jclouds.vblob.blobstore;

import java.io.IOException;

import org.jclouds.blobstore.domain.Blob;
import org.jclouds.s3.blobstore.integration.S3BlobIntegrationLiveTest;
import org.testng.annotations.Test;

@Test(groups = "live", testName = "VBlobBlobIntegrationLiveTest")
public class VBlobBlobIntegrationLiveTest extends S3BlobIntegrationLiveTest {
   
   public VBlobBlobIntegrationLiveTest() {
      provider = "vblob";
   }
   
   // no support for content encoding
   @Override
   protected void checkContentEncoding(Blob blob, String contentEncoding) {
      assert blob.getPayload().getContentMetadata().getContentEncoding() == null;
      assert blob.getMetadata().getContentMetadata().getContentEncoding() == null;
   }

   // no support for content language
   @Override
   protected void checkContentLanguage(Blob blob, String contentLanguage) {
      assert blob.getPayload().getContentMetadata().getContentLanguage() == null;
      assert blob.getMetadata().getContentMetadata().getContentLanguage() == null;
   }

   // double range not supported
   @Test(groups = { "integration", "live" })
   @Override
   public void testGetTwoRanges() throws InterruptedException, IOException {

   }

   // range not supported
   @Test(groups = { "integration", "live" })
   @Override
   public void testGetRange() throws InterruptedException, IOException {
   }
}
