package eapli.base.atividade.domain;

import eapli.base.utils.scriptreader.ScriptFileImporter;
import eapli.base.utils.scriptreader.ScriptReader;
import eapli.framework.domain.model.ValueObject;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Embeddable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Script.
 */
@Embeddable
public class Script implements ValueObject, Comparable<Script> {
    private String conteudo;//cada string é uma linha
    private String path;

    /**
     * Instantiates a new Script.
     */
    protected Script() {
        //ORM
    }

    /**
     * Instantiates a new Script.
     *
     * @param script the script
     */
    public Script(File script) {
        ScriptReader reader = new ScriptFileImporter();
        try {
            this.path = script.getAbsolutePath();

            this.conteudo = obterConteudoString(reader.readFile(caminho(script)));
        } catch (FileNotFoundException e) {
            this.conteudo = "";
        }
    }

    private String obterConteudoString(List<String> readFile) {
        StringBuffer s = new StringBuffer();
        for (String pos : readFile) {
            s.append(pos);
        }
        return s.toString();
    }

    /**
     * Value of script.
     *
     * @param script the script
     * @return the script
     */
    public static Script valueOf(final String script) {
        File file = new File(script);
        return new Script(file);
    }

    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Script)) {
            return false;
        }
        final Script that = (Script) o;


        return this.conteudo.equalsIgnoreCase(that.conteudo);
    }


    /**
     * Caminho string.
     *
     * @return the string
     */
    public String caminho(File script) {
        return script.getPath();
    }

    @Override
    public int compareTo(Script o) {
        return this.conteudo.compareToIgnoreCase(o.conteudo);
    }

    public String conteudoFicheiro() {
        return this.conteudo;
    }

    public String caminho() {
        return this.path;
    }
}