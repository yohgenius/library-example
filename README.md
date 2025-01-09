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
