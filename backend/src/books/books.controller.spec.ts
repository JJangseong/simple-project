import { Test, TestingModule } from '@nestjs/testing'
import { BooksController } from './books.controller'
import { BooksService } from './books.service'

describe('BooksController', () => {
	let controller: BooksController

	const mockBooksService = {
		create: jest.fn(dto => ({ id: Date.now(), ...dto })),
	}

	beforeEach(async () => {
		const module: TestingModule = await Test.createTestingModule({
			controllers: [BooksController],
			providers: [BooksService],
		})
			.overrideProvider(BooksService)
			.useValue(mockBooksService)
			.compile()

		controller = module.get<BooksController>(BooksController)
	})

	it('should be defined', () => {
		expect(controller).toBeDefined()
	})

	it('should create a user', function () {
		expect(controller.create({ title: '제목 1', writer: '작성자 1' })).toEqual({
			id: expect.any(Number),
			title: '제목 1',
			writer: '작성자 1',
		})
	})

	it('제목으로 책 조회', async () => {
		const title = '제목'
		const book = await controller.findByTitle(title)
		expect(book).toBe(title)
	})
})
