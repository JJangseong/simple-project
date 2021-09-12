import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import Home from 'pages/Home'

const Stack = createNativeStackNavigator()

export type HomeNavigatorProps = {}

function HomeNavigator({}: HomeNavigatorProps) {
	return (
		<Stack.Navigator
			screenOptions={{
				headerShown: false,
			}}
		>
			<Stack.Screen name="Main" component={Home} options={{ headerShown: false }} />
		</Stack.Navigator>
	)
}

export default HomeNavigator
