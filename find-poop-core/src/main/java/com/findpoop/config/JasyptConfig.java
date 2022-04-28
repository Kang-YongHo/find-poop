package com.findpoop.config;

import com.ulisesbocchio.jasyptspringboot.properties.JasyptEncryptorConfigurationProperties;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfig {

    @Value("${jasypt.encryptor.password}")
    private String password;

    @Bean("jasyptStringEncryptor")
    public StringEncryptor stringEncryptor() {
        JasyptEncryptorConfigurationProperties properties = new JasyptEncryptorConfigurationProperties();
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();

        config.setPassword(password);
        config.setPoolSize(properties.getPoolSize());
        config.setStringOutputType(properties.getStringOutputType());
        config.setAlgorithm(properties.getAlgorithm());
        config.setKeyObtentionIterations(properties.getKeyObtentionIterations());
        config.setIvGeneratorClassName(properties.getIvGeneratorClassname());
        config.setProviderName(properties.getProviderName());
        config.setSaltGeneratorClassName(properties.getSaltGeneratorClassname());
        encryptor.setConfig(config);
        return encryptor;
    }
}