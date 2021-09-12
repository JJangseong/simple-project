import React from 'react'
import styled from 'styled-components/native'
import { getStatusBarHeight } from 'react-native-status-bar-height'
import { COLOR, SIZE } from 'styles'
import { Logo, Alarm } from 'assets/icons'

export type HomeHeaderProps = {}

function HomeHeader({}: HomeHeaderProps) {
	return (
		<Container>
			<Logo />
			<Alarm style={{ color: COLOR.primary }} />
		</Container>
	)
}

export default HomeHeader

const Container = styled.View`
	padding: ${getStatusBarHeight()}px ${SIZE.padding1} 24px;
	flex-direction: row;
	justify-content: space-between;
	align-items: center;
`
