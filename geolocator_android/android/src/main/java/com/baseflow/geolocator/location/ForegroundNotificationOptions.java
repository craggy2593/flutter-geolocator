package com.baseflow.geolocator.location;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Map;

@SuppressWarnings({"ConstantConditions", "unchecked"})
public class ForegroundNotificationOptions {

    @NonNull
    private final String notificationTitle;
    @NonNull
    private final String notificationText;
    @NonNull
    private final AndroidIconResource notificationIcon;
    @NonNull
    private final boolean enableWifiLock;
    @NonNull
    private final boolean enableWakeLock;
    @NonNull
    private final boolean setOngoing;
    @NonNull
    private final int notificationColor;


    public static ForegroundNotificationOptions parseArguments(@Nullable  Map<String, Object> arguments) {
    if (arguments == null) {
      return null;
    }

   final AndroidIconResource notificationIcon = AndroidIconResource.parseArguments((Map<String, Object>)arguments.get("notificationIcon"));
    final String notificationTitle = (String) arguments.get("notificationTitle");
    final String notificationText = (String) arguments.get("notificationText");
    final Boolean enableWifiLock = (Boolean) arguments.get("enableWifiLock");
    final Boolean enableWakeLock = (Boolean) arguments.get("enableWakeLock");
    final Boolean setOngoing = (Boolean) arguments.get("setOngoing");
    final int notificationColor = (int) arguments.get("notificationColor");


    return new ForegroundNotificationOptions(
            notificationTitle,
            notificationText,
            notificationIcon,
            enableWifiLock,
            enableWakeLock,
            setOngoing,
            notificationColor);
  }

    private ForegroundNotificationOptions(String notificationTitle, String notificationText, AndroidIconResource notificationIcon, boolean enableWifiLock, boolean enableWakeLock, boolean setOngoing, int notificationColor) {
        this.notificationTitle = notificationTitle;
        this.notificationText = notificationText;
        this.notificationIcon = notificationIcon;
        this.enableWifiLock = enableWifiLock;
        this.enableWakeLock = enableWakeLock;
        this.setOngoing = setOngoing;
        this.notificationColor = notificationColor;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public AndroidIconResource getNotificationIcon() {
        return notificationIcon;
    }

    public boolean isEnableWifiLock() {
        return enableWifiLock;
    }

    public boolean isEnableWakeLock() {
        return enableWakeLock;
    }

    public boolean isSetOngoing() {
        return setOngoing;
    }

    public boolean getNotificationColor() {
        return notificationColor;
    }

}
