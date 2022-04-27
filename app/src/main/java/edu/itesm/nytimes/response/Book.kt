package edu.itesm.nytimes

data class Results(
 val status: String,
 val results: Books
)


data class Books(
 val books: List<Book>
)

data class Book(val rank: Int,
                val title: String,
                val description: String,
                val book_image: String)