package com.shavinod.scala.example

import com.shavinod.scala.example.BooksProcessor
import com.shavinod.java.example.BookStorage
object ScalaRunner {
  implicit val books = (new BookStorage()).getBooks

  def main(args: Array[String]): Unit = {
    BooksProcessor.filterByAuthor("Jack London").foreach(b => println(b))
    print("inside class")
  }
}