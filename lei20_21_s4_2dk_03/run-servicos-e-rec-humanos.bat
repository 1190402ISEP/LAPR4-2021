REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET EAPLI_BASE_SERV_REC_HUMANOS_CP=base.app.servicoserecursoshumanos\target\base.app.servicoserecursoshumanos-1.3.0-SNAPSHOT.jar;base.app.servicoserecursoshumanos\target\dependency\*;
REM call the java VM, e.g,
java -cp %EAPLI_BASE_SERV_REC_HUMANOS_CP% eapli.base.app.servicoserecursoshumanos.ServicosRecursosHumanos