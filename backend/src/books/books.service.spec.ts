import { Test, TestingModule } from '@nestjs/testing'
import { BooksService } from './books.service'
import { BookEntity } from './entities/book.entity'
import { getRepositoryToken } from '@nestjs/typeorm'
import { BooksRepository } from './books.repository'
import { Repository } from 'typeorm'

const MockRepository = () => ({
	save: jest.fn().mockImplementation(dto => dto),
	find: jest.fn(),
	findOne: jest.fn(),
	softDelete: jest.fn(),
})

type MockRepository<T = any> = Partial<Record<keyof Repository<T>, jest.Mock>>

describe('BooksService', () => {
	let service: BooksService
	let booksRepository: MockRepository<BookEntity>

	beforeEach(async () => {
		const module: TestingModule = await Test.createTestingModule({
			providers: [
				BooksService,
				BooksRepository,
				{
					provide: getRepositoryToken(BookEntity),
					useValue: { MockRepository },
				},
			],
		}).compile()

		service = module.get<BooksService>(BooksService)
		booksRepository = module.get<MockRepository<BookEntity>>(getRepositoryToken(BookEntity))
	})

	it('should be defined', function () {
		expect(service).toBeDefined()
	})

	it('북 엔티티 생성자 테스트 / 파라미터 없을때', () => {
		const entity = new BookEntity()
		entity.title = '111'
		expect(entity.title).toBe('111')
	})

	it('북 엔티티 생성자 테스트 / 파라미터 있을때', () => {
		const entity = new BookEntity({ title: '111', writer: '111' })
		expect(entity.title).toBe('111')
	})

	it('북 저장 테스트 / 파라미터 없을때', async () => {
		const entity = new BookEntity()
		entity.title = '얏호'
		entity.writer = '유후'
		const result = await booksRepository.create(entity)
		expect(result.title).toBe('얏호')
	})

	it('북 저장 테스트 / 파라미터 있을때', async () => {
		const entity = new BookEntity({ title: 'zlzlzl', writer: 'wiwiwi' })
		const result = await service.create(entity)
		expect(result.title).toBe('zlzlzl')
	})
})
