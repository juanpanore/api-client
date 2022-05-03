package com.chefcompany.apiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.*;
import java.io.*;


@SpringBootApplication
public class ApiClientApplication {

	public static void main(String[] args) throws IOException {
		URL proxyUrl = new URL("http://9jtwr48ql4svvo:srqr4i5znpqtlke7p3c3lykqol@us-east-static-10.quotaguard.com:9293");
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

		SpringApplication.run(ApiClientApplication.class, args);
	}

}
