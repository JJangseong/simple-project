import React, { useState } from 'react'
import { Text } from 'react-native'
import TabNavigator from './TabNavigator'
import StackNavigator from './StackNavigator'

export type AppNavigatorProps = {}

function AppNavigator({}: AppNavigatorProps) {
	const [isLogin, setIsLogin] = useState(true)
	return isLogin ? <TabNavigator /> : <StackNavigator />
}

export default AppNavigator
