# ToastyLibraryDemo


*** To get a Git project into your build ***

========== Gradle =============

  1).  Add the JitPack repository to your build file
  
  - Add it in your root build.gradle at the end of repositories:
  
  
	      allprojects {	
			repositories {
				maven { url 'https://jitpack.io' }
			}
		}

  2).  Add the dependency
  
      dependencies {
	        implementation 'com.github.MrfHarsoda:ToastyLibraryDemo:Tag'
	}
  
  
========== Maven ===============

1).  Add the JitPack repository to your build file
  
  - Add it in your root build.gradle at the end of repositories:
  
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  
2).  Add the dependency
  
    <dependency>
	    <groupId>com.github.MrfHarsoda</groupId>
	    <artifactId>ToastyLibraryDemo</artifactId>
	    <version>Tag</version>
	</dependency>
