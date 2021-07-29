import { Injectable, Logger } from '@nestjs/common'
import { CreateBookDto } from './dto/create-book.dto'
import { InjectRepository } from '@nestjs/typeorm'
import { Repository } from 'typeorm'
import { BookEntity } from './entities/book.entity'

@Injectable()
export class BooksService {
	private static readonly logger = new Logger(BooksService.name)

	constructor(
		@InjectRepository(BookEntity)
		private readonly booksRepository: Repository<BookEntity>,
	) {}

	async create(book: CreateBookDto) {
		const newBook = this.booksRepository.create({
			title: book.title,
			writer: book.writer,
		})
		return await this.booksRepository.save(newBook)
	}

	async findByTitle(title: string) {
		return await this.booksRepository.findOne({ title })
	}

	async findAll() {
		return await this.booksRepository.find()
	}
}
