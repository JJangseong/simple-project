import { Column, CreateDateColumn, Entity, PrimaryGeneratedColumn, UpdateDateColumn } from 'typeorm'
import { CreateBookDto } from '../dto/create-book.dto'

@Entity('book')
export class BookEntity {
	@PrimaryGeneratedColumn()
	id: number

	@Column()
	title: string

	@Column()
	writer: string

	@CreateDateColumn({ update: false, name: 'created_at' })
	createdAt: Date

	@UpdateDateColumn({ name: 'updated_at' })
	updatedAt: Date

	constructor(dto?: CreateBookDto) {
		return Object.assign(this, { ...dto })
	}
}
