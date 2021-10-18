import React from 'react'
import styled from 'styled-components/native'
import { Text } from 'react-native'
import SelectDropdown from 'react-native-select-dropdown'

export type RoomProps = {}


function Room({}: RoomProps) {
	return (
		<Container>
			<SelectDropdown
				data={countries}
				onSelect={(selectedItem, index) => {
					console.log(selectedItem, index)
				}}
				buttonTextAfterSelection={(selectedItem, index) => {
					// text represented after item is selected
					// if data array is an array of objects then return selectedItem.property to render after item is selected
					return selectedItem
				}}
				rowTextForSelection={(item, index) => {
					// text represented for each item in dropdown
					// if data array is an array of objects then return item.property to represent item in dropdown
					return item
				}}
			/>
		</Container>
	)
}

const Container = styled.ScrollView``
const countries = ['Egypt', 'Canada', 'Australia', 'Ireland']

export default Room