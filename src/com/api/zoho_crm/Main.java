package com.api.zoho_crm;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // 環境変数は、intellijの実行構成の編集上で追加すること(https://reasonable-code.com/intellij-environment-variable/)
        System.out.println("CLIENT_ID: " + System.getenv("ZOHO_CLIENT_ID"));
        System.out.println("CLIENT_SECRET: " + System.getenv("ZOHO_CLIENT_SECRET"));
        System.out.println("REFRESH_TOKEN: " + System.getenv("ZOHO_REFRESH_TOKEN"));

    }
}
