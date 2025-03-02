if (loginSuccessful) {
    logger.severe("User login succeeded for: " + sanitizeUser(username));
} else {
    logger.severe("User login failed for: " + sanitizeUser(username));
}

public static String sanitizeUser(String username) {
    return Pattern.matches("[A-Za-z0-9]+", username) ? username : "unauthorized user";
}