import { Body, Controller, Get, Param, Post } from '@nestjs/common'
import { CreateBookDto } from './dto/create-book.dto'
import { BooksService } from './books.service'

@Controller('books')
export class BooksController {
	constructor(private readonly bookService: BooksService) {}

	@Post()
	async create(@Body() book: CreateBookDto) {
		return this.bookService.create(book)
	}

	@Get()
	async find() {
		return this.bookService.findAll()
	}

	@Get(':title')
	async findByTitle(@Param('title') title: string) {
		return await this.bookService.findByTitle(title)
	}
}
