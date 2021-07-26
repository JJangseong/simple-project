import { EntityRepository, Repository } from 'typeorm'
import { BookEntity } from './entities/book.entity'

@EntityRepository(BookEntity)
export class BooksRepository extends Repository<BookEntity> {}
