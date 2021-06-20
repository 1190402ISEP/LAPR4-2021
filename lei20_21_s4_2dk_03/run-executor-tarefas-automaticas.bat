REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET EAPLI_BASE_EXECUTOR_TAREFAS_AUTOMATICAS_CP=base.app.executortarefasautomaticas\target\base.app.executortarefasautomaticas-1.3.0-SNAPSHOT.jar;base.app.executortarefasautomaticas\target\dependency\*;
REM call the java VM, e.g,
java -cp %EAPLI_BASE_EXECUTOR_TAREFAS_AUTOMATICAS_CP% eapli.base.app.executortarefasautomaticas.Main