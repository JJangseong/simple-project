import React from 'react'
import {NavigationContainer} from '@react-navigation/native'
import AppNavigator from './navigations/AppNavigator'
import styled from 'styled-components/native'

const App = () => {
    return (
        <NavigationContainer>
            <Container>
                <AppNavigator/>
            </Container>
        </NavigationContainer>
    )
}

const Container = styled.View`
  flex: 1;
`

export default App
