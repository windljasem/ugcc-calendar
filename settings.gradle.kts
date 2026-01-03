pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "UGCC-Calendar"
include(":app")
```

5. Внизу натисни **"Commit changes..."** → **"Commit changes"**

---

## Крок 2: Створюємо файл `build.gradle.kts` (кореневий)

1. **"Add file"** → **"Create new file"**
2. Назва:
```
   build.gradle.kts
