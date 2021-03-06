package com.gateon.vogellafeed;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Maxim on 8/9/2017.
 */

@Root(name = "item", strict = false)
public class Article {

    @Element(name = "title")
    private String title;

    @Element(name = "link")
    private String link;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
