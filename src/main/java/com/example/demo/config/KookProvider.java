package com.example.demo.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ALIENWARE on 15/9/2560.
 */

@Data
@Configuration
public class KookProvider implements AWSCredentialsProvider {

    @Autowired
    private CredentialAWS credentialAWS;

//    @Value("${aws.accessKey}")
//    private String ACCESS_KEY;
//
//    @Value("${aws.secretKey}")
//    private String SECRET_KEY;

    public KookProvider() {
    }

    @Override
    public AWSCredentials getCredentials() {
        AWSCredentials credentials = new BasicAWSCredentials(credentialAWS.getAccessKey(), credentialAWS.getSecretKey());
        return credentials;
    }

    @Override
    public void refresh() {

    }
}
