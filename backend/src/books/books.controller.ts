import { Body, Controller, Post } from '@nestjs/common'
import { CreateBookDto } from './dto/create-book.dto'
import { BooksService } from './books.service'

@Controller('books')
export class BooksController {
	constructor(private readonly bookService: BooksService) {}

	@Post()
	async create(@Body() book: CreateBookDto) {
		return this.bookService.create(book)
	}
}
