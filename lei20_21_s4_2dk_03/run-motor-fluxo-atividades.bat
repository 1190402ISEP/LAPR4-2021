REM set the class path,
REM assumes the build was executed with maven copy-dependencies
export EAPLI_BASE_MOTOR_FLUXO_ATIVIDADES_CP=base.app.motorfluxoatividades\target\base.app.motorfluxoatividades-1.3.0-SNAPSHOT.jar;base.app.motorfluxoatividades\target\dependency\*;
REM call the java VM, e.g,
java -cp %EAPLI_BASE_MOTOR_FLUXO_ATIVIDADES_CP% eapli.base.app.motorfluxosatividades.Main