package org.wildtales.wildtalesspringapp.configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {


    @Value("${cloudinary.cloud-name}")
    private String myCloudName;

    @Value("${cloudinary.api-key}")
    private String myApiKey;

    @Value("${cloudinary.api-secret}")
    private String myApiSecret;

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", myCloudName,
                "api_key", myApiKey,
                "api_secret", myApiSecret));
    }
}
