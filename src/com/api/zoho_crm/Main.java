package com.api.zoho_crm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.debug("Hello World");
        // 環境変数は、intellijの実行構成の編集上で追加すること(https://reasonable-code.com/intellij-environment-variable/)
        System.out.println("CLIENT_ID: " + System.getenv("ZOHO_CLIENT_ID"));
        System.out.println("CLIENT_SECRET: " + System.getenv("ZOHO_CLIENT_SECRET"));
        System.out.println("REFRESH_TOKEN: " + System.getenv("ZOHO_REFRESH_TOKEN"));

        // OAuth
        String zohoAccountsUrl = "https://accounts.zoho.com";
        String oauthUrl = String.format("%s/oauth/v2/token", zohoAccountsUrl);
        System.out.println("REFRESH_TOKEN: " + System.getenv("ZOHO_REFRESH_TOKEN"));

    }
}
