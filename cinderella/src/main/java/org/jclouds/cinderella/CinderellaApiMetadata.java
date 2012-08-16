package org.jclouds.cinderella;

import static org.jclouds.compute.config.ComputeServiceProperties.TIMEOUT_PORT_OPEN;

import java.util.Properties;

import org.jclouds.apis.ApiMetadata;
import org.jclouds.ec2.EC2ApiMetadata;
import org.jclouds.ec2.EC2AsyncClient;
import org.jclouds.ec2.EC2Client;


public class CinderellaApiMetadata extends EC2ApiMetadata {
   /** The serialVersionUID */
   private static final long serialVersionUID = 3060225665040763827L;

   private static Builder builder() {
      return new Builder();
   }

   @Override
   public Builder toBuilder() {
      return builder().fromApiMetadata(this);
   }

   public CinderellaApiMetadata() {
      this(builder());
   }

   protected CinderellaApiMetadata(Builder builder) {
      super(builder);
   }

   public static Properties defaultProperties() {
      Properties properties = EC2ApiMetadata.defaultProperties();
      properties.setProperty(TIMEOUT_PORT_OPEN, 5 * 60 * 1000 + "");
      return properties;
   }

   public static class Builder extends EC2ApiMetadata.Builder {
      protected Builder() {
         super(EC2Client.class, EC2AsyncClient.class);
         id("cinderella")
         .defaultEndpoint("http://localhost:8080/")
         .version("2009-10-31")
         .name("Cinderella (EC2 clone) API")
         .defaultProperties(CinderellaApiMetadata.defaultProperties());
      }

      @Override
      public CinderellaApiMetadata build() {
         return new CinderellaApiMetadata(this);
      }

      @Override
      public Builder fromApiMetadata(ApiMetadata in) {
         super.fromApiMetadata(in);
         return this;
      }
   }

}
