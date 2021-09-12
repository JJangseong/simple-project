// eslint-disable-next-line @typescript-eslint/ban-ts-comment
// @ts-ignore
import { API_URL } from 'react-native-dotenv'
import { Platform } from 'react-native'

export const COMMON = {
	isIOS: Platform.OS === 'ios',
	isAndroid: Platform.OS === 'android',
}

export const API = {
	url: API_URL,
}

export default {
	API,
	COMMON,
}
