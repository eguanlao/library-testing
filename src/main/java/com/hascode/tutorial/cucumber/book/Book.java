package com.hascode.tutorial.cucumber.book;

import java.util.Date;

public class Book {

  private final String title;
  private final String author;
  private final Date published;

  public Book(final String title, final String author, final Date published) {
    this.title = title;
    this.author = author;
    this.published = published;
  }

  public String getTitle() {
    return title;
  }

  public Date getPublished() {
    return published;
  }

}
