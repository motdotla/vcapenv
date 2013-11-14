# vcapenv

This Java module makes it easy for you to get our your `VCAP_SERVICES` environment variables on CloudFoundry.

```java
import com.github.scottmotte.Vcapenv;
Vcapenv vcapenv             = new Vcapenv();
String sendgrid_username    = vcapenv.SENDGRID_USERNAME();
String sendgrid_password    = vcapenv.SENDGRID_PASSWORD();
```

## Available Methods

```java
Vcapenv vcapenv = new Vcapenv();
vcapenv.SENDGRID_USERNAME();
vcapenv.SENDGRID_PASSWORD();
```

Please add more by creating a [pull request](https://github.com/scottmotte/vcapenv/pulls).

## Installation

There are multiple ways to install this library. I recommend using [Gradle](http://www.gradle.org/).

### via Gradle (recommended)

Add the following to your build.gradle file in the root of your project.

```
...

repositories {
  mavenCentral()
  add(new org.apache.ivy.plugins.resolver.URLResolver()) {
    name = 'GitHub'
    addArtifactPattern 'https://github.com/scottmotte/vcapenv/raw/v[revision]/repo/com/github/scottmotte/[revision]/vcapenv-[revision]-jar.jar'
  }
}
dependencies {
  ...
  compile 'com.github.scottmotte:vcapenv:0.0.1'
}

...
```

Then import the library - in the file appropriate to your Java project.

```java
import com.github.scottmotte.Vcapenv;
```

### via copy/paste

#### Include the Vcapenv.java library

Copy and paste the [Vcapenv.java](https://github.com/scottmotte/vcapenv/blob/master/src/main/java/com/github/scottmotte/Vcapenv.java) file into your project. That file is available here: [https://github.com/scottmotte/vcapenv/blob/master/src/main/java/com/github/scottmotte/Vcapenv.java](https://github.com/scottmotte/vcapenv/blob/master/src/main/java/com/github/scottmotte/Vcapenv.java)

Then import the library - in the file appropriate to your Java project.

```java
import com.github.scottmotte.Vcapenv;
```

#### Include the required dependencies

* You need to include the [jackson-core-asl](http://mvnrepository.com/artifact/org.codehaus.jackson/jackson-core-asl)
* You need to include the [jackson-mapper-asl](http://mvnrepository.com/artifact/org.codehaus.jackson/jackson-mapper-asl)

### via Maven

I'd like to get this on Maven. Please [+1 your support](https://github.com/scottmotte/vcapenv/issues) if you'd like to see it on Maven as well.

## Testing

First set some test export environment variables.

```bash
export VCAP_SERVICES='{"sendgrid-n/a":[{"name":"sendgrid-e5af0","label":"sendgrid-n/a","tags":["smtp"],"plan":"free","credentials":{"username":"orion","hostname":"smtp.sendgrid.net","password":"ofsky"}}]}'
```

Then run the tests.

```bash
gradle test -i
``` 
