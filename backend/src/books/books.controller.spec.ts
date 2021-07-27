import { Test, TestingModule } from '@nestjs/testing'
import { BooksController } from './books.controller'

describe('BooksController', () => {
	let controller: BooksController

	beforeEach(async () => {
		const module: TestingModule = await Test.createTestingModule({
			controllers: [BooksController],
		}).compile()

		controller = module.get<BooksController>(BooksController)
	})

	it('should be defined', () => {
		expect(controller).toBeDefined()
	})

	it('제목으로 책 조회', async () => {
		const title = ''
		const book = await controller.findByTitle(title)
		expect(book).toBe(title)
	})
})
