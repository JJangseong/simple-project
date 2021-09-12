/**
 * Metro configuration for React Native
 * https://github.com/facebook/react-native
 *
 * @format
 */
const path = require('path')

module.exports = {
	resolver: {
		extraNodeModules: {
			src: path.resolve(__dirname, 'src'),
			assets: path.resolve(__dirname, 'src/assets'),
			components: path.resolve(__dirname, 'src/components'),
			constants: path.resolve(__dirname, 'src/constants'),
			hooks: path.resolve(__dirname, 'src/hooks'),
			navigations: path.resolve(__dirname, 'src/navigations'),
			pages: path.resolve(__dirname, 'src/pages'),
			utils: path.resolve(__dirname, 'src/utils'),
		},
	},
	transformer: {
		getTransformOptions: async () => ({
			transform: {
				experimentalImportSupport: false,
				inlineRequires: true,
			},
		}),
	},
}
