<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">

    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.POST_NOTIFICATIONS" />

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="УГКЦ Календар"
        android:theme="@style/Theme.Material3.DayNight">
        
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        
    </application>

</manifest>
```

4. **Commit changes**

---

## Крок 6: Створюємо `app/src/main/java/ua/ugcc/calendar/MainActivity.kt`

1. **"Add file"** → **"Create new file"**
2. Назва:
```
   app/src/main/java/ua/ugcc/calendar/MainActivity.kt
