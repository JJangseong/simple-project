/**
 * Metro configuration for React Native
 * https://github.com/facebook/react-native
 *
 * @format
 */
const path = require('path')
const { getDefaultConfig } = require('metro-config')

module.exports = (async () => {
	const {
		resolver: { sourceExts, assetExts },
	} = await getDefaultConfig()
	return {
		transformer: {
			getTransformOptions: async () => ({
				transform: {
					experimentalImportSupport: false,
					inlineRequires: true,
				},
			}),
			babelTransformerPath: require.resolve('react-native-svg-transformer'),
		},
		resolver: {
			assetExts: assetExts.filter(ext => ext !== 'svg'),
			sourceExts: [...sourceExts, 'svg'],
			extraNodeModules: {
				src: path.resolve(__dirname, 'src'),
				assets: path.resolve(__dirname, 'src/assets'),
				components: path.resolve(__dirname, 'src/components'),
				constants: path.resolve(__dirname, 'src/constants'),
				hooks: path.resolve(__dirname, 'src/hooks'),
				navigations: path.resolve(__dirname, 'src/navigations'),
				pages: path.resolve(__dirname, 'src/pages'),
				utils: path.resolve(__dirname, 'src/utils'),
				styles: path.resolve(__dirname, 'src/styles'),
			},
		},
	}
})()
