package com.rcs.newsletter.core.model.commons;

import com.rcs.newsletter.core.model.NewsletterArchive;
import java.util.Comparator;

/**
 * Comparator that sort the Archive putting the newest on top
 * @author Ariel Parra <ariel@rotterdam-cs.com>
 */
public class ArchiveComparator implements Comparator<NewsletterArchive> {

    public int compare(NewsletterArchive a1, NewsletterArchive a2) {
        int result = 0;

        if (a1.getDate().after(a2.getDate())) {
            result = -1;
        } else if (a1.getDate().before(a2.getDate())) {
            result = 1;
        }

        return result;
    }
}
