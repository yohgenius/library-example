# Tanya Library

<table>
  <tr>
    <td>
<img width="322" alt="Home Screen" src="https://github.com/user-attachments/assets/53e02203-8d73-4013-8090-e3d3ed62e401">
    </td>
    <td>
<img width="322" alt="Search Screen" src="https://github.com/user-attachments/assets/6a82b852-7c6c-4ce5-a5f7-279f84ff7892">
    </td>
  </tr>
</table>

[Download sample apk](https://drive.google.com/file/d/1Hnapf97itPCPdszYBYBLuMwudrZVnpXN/view?usp=sharing)

## Description

A sample library created using native Kotlin and XML, showing an activity that can be used as a separate feature on an app.

## Installation

Step 1. Add the JitPack repository to your build file

```bash
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```bash
	dependencies {
	        implementation 'com.github.yohgenius:library-example:1.2.2'
	}
```

## Project setup

Step 1. Create a button in view

```bash
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/bg_gradient"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/tanya_btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:padding="15dp"
        android:text="Tanya Bestie" />
</RelativeLayout>
```

Step 2. Set the onClickListener and intent destination

```bash
class MainActivity : AppCompatActivity() {

    lateinit var tanyaBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tanyaBtn = findViewById(R.id.tanya_btn)
        tanyaBtn.setOnClickListener {
            val tanyaBestie = Intent(this, TanyaActivity::class.java)
            startActivity(tanyaBestie)
        }
    }
}
```

## Specifications

- Compile SDK 35
- Min SDK 29
- Android gradle plugin 8.3.2
- Kotlin 1.9.0
- openjdk17
