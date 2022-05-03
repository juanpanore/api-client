package com.chefcompany.apiclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import java.net.*;
import java.io.*;

@SuppressWarnings("deprecation")
@Configuration
public class AplicacionWebConfig {
	@Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurerAdapter() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/api/v1/**").allowedMethods("DELETE","PUT","POST","GET");
	            }
	        };
	    }

	@Bean
		public static void setProxy() throws IOException {
			URL proxyUrl = new URL(System.getenv("QUOTAGUARDSHIELD_URL"));
			String userInfo = proxyUrl.getUserInfo();
			String user = userInfo.substring(0, userInfo.indexOf(':'));
			String password = userInfo.substring(userInfo.indexOf(':') + 1);

			URLConnection conn = null;
			System.setProperty("http.proxyHost", proxyUrl.getHost());
			System.setProperty("http.proxyPort", Integer.toString(proxyUrl.getPort()));

			Authenticator.setDefault(new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(user, password.toCharArray());
				}
			});

			URL url = new URL("https://ip.quotaguard.com");
			conn = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);

			in.close();
		}


}
