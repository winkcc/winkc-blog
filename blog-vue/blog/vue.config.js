module.exports = {
  transpileDependencies: ["vuetify"],
  devServer: {
    open: true,
    host: 'localhost',
    port: 8082,
    proxy: {
      "/api": {
        target: "http://localhost:8080",
        changeOrigin: true,
        pathRewrite: {
          "^/api": ""
        }
      }
    },
    disableHostCheck: true
  },
  productionSourceMap: false,
  css: {
    extract: true,
    sourceMap: false
  }
};
