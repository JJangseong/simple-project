import { Module } from '@nestjs/common'
import { BooksController } from './books.controller'
import { BooksService } from './books.service'
import { TypeOrmModule } from '@nestjs/typeorm'
import { BooksRepository } from './books.repository'

@Module({
	imports: [TypeOrmModule.forFeature([BooksRepository])],
	controllers: [BooksController],
	providers: [BooksService],
	exports: [BooksService],
})
export class BooksModule {}
