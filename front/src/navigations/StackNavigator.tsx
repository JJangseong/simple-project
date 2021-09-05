import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import Login from '../pages/Login'

const Stack = createNativeStackNavigator()

export type StackNavigatorProps = {}

function StackNavigator({}: StackNavigatorProps) {
	return (
		<Stack.Navigator>
			<Stack.Screen name="Login" component={Login} />
		</Stack.Navigator>
	)
}

export default StackNavigator
