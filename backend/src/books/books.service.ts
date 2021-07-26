import { Injectable } from '@nestjs/common'
import { BooksRepository } from './books.repository'
import { CreateBookDto } from './dto/create-book.dto'

@Injectable()
export class BooksService {
	constructor(private readonly booksRepository: BooksRepository) {}

	async create(book: CreateBookDto) {
		const newBook = this.booksRepository.create({
			title: book.title,
			writer: book.writer,
		})
		return await this.booksRepository.save(newBook)
	}
}
