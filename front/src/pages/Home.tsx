import React from 'react'
import styled from 'styled-components/native'
import { FlatList } from 'react-native'
import HomeHeader from 'components/HomeHeader'

export type HomeProps = {}

const DATA = [
	{ id: 1, content: 'content1' },
	{ id: 2, content: 'content1' },
	{ id: 3, content: 'content1' },
	{ id: 4, content: 'content1' },
	{ id: 5, content: 'content1' },
]

function Home({}: HomeProps) {
	const renderTitle = () => {
		return <Text>Header</Text>
	}

	return (
		<>
			<HomeHeader />
			<Container>
				<Text>Home</Text>
				<FlatList
					style={{
						backgroundColor: '#ff0000',
					}}
					data={DATA}
					renderItem={({ item }) => {
						return <Text>{item.content}</Text>
					}}
					ListHeaderComponent={() => {
						return renderTitle()
					}}
					ListFooterComponent={() => {
						return renderTitle()
					}}
				/>
			</Container>
		</>
	)
}

const Container = styled.View`
	flex: 1;
	justify-content: center;
	align-items: center;
`

const Text = styled.Text``

export default Home
