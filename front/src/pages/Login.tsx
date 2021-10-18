import React from 'react'
import styled from 'styled-components/native'
import {Kakao, LogoIcon} from 'assets/icons'
import {FONT} from 'styles'
import Button from 'components/Button'

function Login() {
    return <Container>
        <Header>
            <LogoIcon/>
            <SubTitle>우리가 함께할 수 있는 가장 간단한 방법</SubTitle>
            <Title>SNS 로그인</Title>
        </Header>
        <ButtonGroup>
            <Button onPress={() => console.log('press')} label="카카오계정으로 로그인하기" icon={() => <Kakao/>} containerStyle={{backgroundColor: '#FEE500'}}/>
            <Button onPress={() => console.log('press')} label="카카오계정으로 로그인하기" icon={() => <Kakao/>} containerStyle={{backgroundColor: '#FEE500'}}/>
            <Button onPress={() => console.log('press')} label="카카오계정으로 로그인하기" icon={() => <Kakao/>} containerStyle={{backgroundColor: '#FEE500'}}/>
            <Button onPress={() => console.log('press')} label="카카오계정으로 로그인하기" icon={() => <Kakao/>} containerStyle={{backgroundColor: '#FEE500'}}/>
        </ButtonGroup>
    </Container>
}

const Container = styled.SafeAreaView`

`

const Header = styled.View`
  justify-content: center;
  align-items: center;
  margin-top: 10%;
`

const SubTitle = styled.Text`
  margin-top: 16px;
  color: #8E8E8E;
  ${FONT.body3}
`

const Title = styled.Text`
  ${FONT.h4}
  margin: 40px 0;
`

const ButtonGroup = styled.View`
  align-items: center;
  justify-content: space-between;
  height: 40%;
`


export default Login
