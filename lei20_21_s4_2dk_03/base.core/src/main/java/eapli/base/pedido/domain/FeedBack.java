package eapli.base.pedido.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Feed back.
 */
@Embeddable
public class FeedBack implements ValueObject, Comparable<FeedBack> {
    private static final long serialVersionUID = 1L;
    private String feedBack;

    /**
     * Instantiates a new Feed back.
     */
    protected FeedBack() {
        // for ORM
    }

    /**
     * Instantiates a new Feed back.
     *
     * @param feedBack the feed back
     */
    public FeedBack(final String feedBack) {
        if (StringPredicates.isNullOrEmpty(feedBack)) {
            throw new IllegalArgumentException("O feedBack não pode ter valor null e deve ser preenchido.");
        }
        this.feedBack = feedBack;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FeedBack)) {
            return false;
        }

        final FeedBack that = (FeedBack) o;
        return this.feedBack.equals(that.feedBack);
    }

    @Override
    public int hashCode() {
        return this.feedBack.hashCode();
    }

    @Override
    public int compareTo(final FeedBack arg0) {
        return feedBack.compareTo(arg0.feedBack);
    }

    @Override
    public String toString() {
        return this.feedBack;
    }
}
