import React, { useState } from 'react'
import TabNavigator from './TabNavigator'
import StackNavigator from './StackNavigator'

function AppNavigator() {
	const [isLogin, setIsLogin] = useState(true)
	return isLogin ? <TabNavigator /> : <StackNavigator />
}

export default AppNavigator
