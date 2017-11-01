package com.shavinod.scala.example

import java.util
import scala.collection.JavaConversions._
import com.shavinod.java.example.Book
object BooksProcessor {
  def filterByAuthor(author: String)(implicit books: util.ArrayList[Book]) = {
    books.filterNot(book => book.toString() == author)
  }
}