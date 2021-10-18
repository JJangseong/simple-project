import React, { useState } from 'react'
import TabNavigator from './TabNavigator'
import StackNavigator from './StackNavigator'

function AppNavigator() {
	const [isLogin, setIsLogin] = useState(false)
	return isLogin ? <TabNavigator /> : <StackNavigator />
}

export default AppNavigator
