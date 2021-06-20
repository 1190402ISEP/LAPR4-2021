REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET EAPLI_BASE_PORTAL_CP=base.app.portal\target\base.app.portal-1.3.0-SNAPSHOT.jar;base.app.portal\target\dependency\*;
REM call the java VM, e.g,
java -cp %EAPLI_BASE_PORTAL_CP% eapli.base.app.portal.Portal