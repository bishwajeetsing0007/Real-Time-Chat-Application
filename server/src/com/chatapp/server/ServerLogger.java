
package com.chatapp.server;

import com.chatapp.utils.DateUtils;

public class ServerLogger {
    public static void log(String message) {
        System.out.println("[" + DateUtils.now() + "] " + message);
    }
}
