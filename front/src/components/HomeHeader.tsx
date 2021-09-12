import React from 'react'
import { Text } from 'react-native'
import styled from 'styled-components/native'

export type HomeHeaderProps = {}

function HomeHeader({}: HomeHeaderProps) {
	return (
		<Container>
			<Text>Home</Text>
		</Container>
	)
}

export default HomeHeader

const Container = styled.SafeAreaView`
	height: 20px;
`
