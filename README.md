# Run Clara rules in a Springboot application

Example project for https://stackoverflow.com/a/63513240/3181392

```console
# ./gradlew bootRun                                  

> Task :bootRun
2020-08-21 07:29:51.838  INFO 6459 --- [           main] net.ofnir.clara.App                      : Starting App on ofnir with PID 6459 ($HOME/build/classes/java/main started by $USER in $HOME)
2020-08-21 07:29:51.839  INFO 6459 --- [           main] net.ofnir.clara.App                      : No active profile set, falling back to default profiles: default
2020-08-21 07:29:52.039  INFO 6459 --- [           main] net.ofnir.clara.App                      : Started App in 0.368 seconds (JVM running for 0.527)
net.ofnir.clara.Promotion@6ccd3cf1

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.6/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 2s
3 actionable tasks: 1 executed, 2 up-to-date
# ./gradlew assemble

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.6/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 611ms
3 actionable tasks: 3 up-to-date
# java -jar build/libs/java-clara.jar                
2020-08-21 07:30:11.417  INFO 6641 --- [           main] net.ofnir.clara.App                      : Starting App on ofnir with PID 6641 ($HOME/build/libs/java-clara.jar started by $USER in $HOME)
2020-08-21 07:30:11.419  INFO 6641 --- [           main] net.ofnir.clara.App                      : No active profile set, falling back to default profiles: default
2020-08-21 07:30:11.722  INFO 6641 --- [           main] net.ofnir.clara.App                      : Started App in 0.605 seconds (JVM running for 0.869)
net.ofnir.clara.Promotion@5693d1d2
# unzip -l build/libs/java-clara.jar | grep .clj     
      309  2020-08-21 07:28   BOOT-INF/classes/net/ofnir/clara.clj
```
