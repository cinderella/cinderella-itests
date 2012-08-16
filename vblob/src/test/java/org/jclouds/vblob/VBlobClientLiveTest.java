package org.jclouds.vblob;

import static org.testng.Assert.assertEquals;

import java.net.URL;

import org.jclouds.s3.S3ClientLiveTest;
import org.jclouds.s3.domain.S3Object;
import org.testng.annotations.Test;


@Test(groups = "live", singleThreaded = true, testName = "VBlobClientLiveTest")
public class VBlobClientLiveTest extends S3ClientLiveTest {
   public VBlobClientLiveTest(){
      provider = "vblob";
   }
   
   // path based, not virtual host
   @Override
   protected URL getObjectURL(String containerName, String key) throws Exception {
      URL url = new URL(String.format(endpoint + "/%s/%s", containerName, key));
      return url;
   }

   // no support for content encoding
   @Override
   protected void assertContentEncoding(S3Object newObject, String string) {
      assertEquals(newObject.getMetadata().getContentMetadata().getContentEncoding(), null);
   }

   // no support for cache control
   @Override
   protected void assertCacheControl(S3Object newObject, String string) {
      assertEquals(newObject.getMetadata().getCacheControl(), null);
   }
}
