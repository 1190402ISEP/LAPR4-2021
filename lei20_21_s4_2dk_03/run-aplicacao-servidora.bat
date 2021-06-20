REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET EAPLI_BASE_SERV_CP=base.app.servidor\target\base.app.servidor-1.3.0-SNAPSHOT.jar;base.app.servidor\target\dependency\*;
REM call the java VM, e.g,
java -cp %EAPLI_BASE_SERV_CP% eapli.base.app.servidor.Main