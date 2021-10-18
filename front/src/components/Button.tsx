import React from 'react'
import styled from 'styled-components/native'
import {GestureResponderEvent, StyleProp, TextStyle, ViewStyle} from 'react-native'
import {FONT} from 'styles'

export type ButtonProps = {
    onPress(e: GestureResponderEvent): void;
    label: string;
    labelStyle?: StyleProp<TextStyle>
    icon(): JSX.Element;
    containerStyle?: StyleProp<ViewStyle>
}

function Button({onPress, icon, label, labelStyle, containerStyle}: ButtonProps) {
    return (
        <Container onPress={onPress} style={containerStyle}>
            {icon && icon()}
            <Label style={labelStyle}>
                {label}
            </Label>
        </Container>
    )
}

const Container = styled.TouchableOpacity`
  flex-direction: row;
  width: 80%;
  padding: 13px;
  justify-content: center;
  border-radius: 100000px;
`

const Label = styled.Text`
  ${FONT.h4}
`

export default Button
