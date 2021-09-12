import React from 'react'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import Search from 'pages/Search'
import HomeNavigator from './HomeNavigator'

const Tab = createBottomTabNavigator()

export type TabNavigatorProps = {}

function TabNavigator({}: TabNavigatorProps) {
	return (
		<Tab.Navigator>
			<Tab.Screen name="Home" component={HomeNavigator} />
			<Tab.Screen name="Search" component={Search} />
			<Tab.Screen name="Search1" component={Search} />
			<Tab.Screen name="Search2" component={Search} />
			<Tab.Screen name="Search3" component={Search} />
		</Tab.Navigator>
	)
}

export default TabNavigator
