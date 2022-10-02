Code reused from [Android Network Tools](https://github.com/stealthcopter/AndroidNetworkTools) and converted to Kotlin for SamKnows Pinging Task 

## Add as dependency
This library is not yet released in Maven Central, until then you can add as a library module or use JitPack.io

add remote maven url

```groovy
    repositories {
        maven {
            url "https://jitpack.io"
        }
    }
```

then add a library dependency. **Remember** to check for latest release [here](https://github.com/Brblol/pinglib/releases)

```groovy
    dependencies {
        compile 'com.github.Brblol:pinglib:1.0.5'
    }
```

### Add permission
Requires internet permission (obviously...)
```xml
  <uses-permission android:name="android.permission.INTERNET" />
```

### Example usage

Uses the native ping binary if available on the device (some devices come without it) and falls back to a TCP request on port 7 (echo request) if not.

```kotlin
    Ping.onAddress(host)
    .setTimeOutMillis(timeout)
    .setTimes(times)
    .doPing(object : Ping.PingListener {
        override fun onResult(pingResult: PingResult?) {
            pingResult?.let { Log.d("Ping Result", it.toString()) }
        }

        override fun onFinished(pingStats: PingStats?) {
            pingStats?.let { Log.d("Ping Stats", it.toString()) }
        }

        override fun onError(e: Exception?) {
            e.let { Log.e("Ping Error", it.toString()) }
            latencyView.text = "Unknown"
        }
    })
```

Note: If we do have to fall back to using TCP port 7 (the java way) to detect devices we will find significantly less than with the native ping binary. If this is an issue you could consider adding a ping binary to your application or device so that it is always available.
