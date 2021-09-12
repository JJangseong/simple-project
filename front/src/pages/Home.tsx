import React from 'react'
import styled from 'styled-components/native'
import HomeHeader from 'components/HomeHeader'

export type HomeProps = {}

function Home({}: HomeProps) {
	return (
		<Container>
			<HomeHeader />
		</Container>
	)
}

const Container = styled.ScrollView``

const Text = styled.Text``

export default Home
